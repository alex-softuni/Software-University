package bakery.core;

import bakery.core.interfaces.Controller;
import bakery.entities.bakedFoods.Bread;
import bakery.entities.bakedFoods.Cake;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.Tea;
import bakery.entities.drinks.Water;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.tables.InsideTable;
import bakery.entities.tables.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.*;


public class ControllerImpl implements Controller {
    private FoodRepository<BakedFood> foodRepository;
    private DrinkRepository<Drink> drinkRepository;
    private TableRepository<Table> tableRepository;
    private double totalIncome;

    public ControllerImpl(FoodRepository<BakedFood> foodRepository,
                          DrinkRepository<Drink> drinkRepository,
                          TableRepository<Table> tableRepository) {

        this.foodRepository = foodRepository;
        this.drinkRepository = drinkRepository;
        this.tableRepository = tableRepository;
    }


    @Override
    public String addFood(String type, String name, double price) {
        BakedFood bakedFood = foodRepository.getByName(name);
        if (bakedFood != null) {
            throw new IllegalArgumentException(String.
                    format("%s %s is already in the menu", type, name));
        }

        if (type.equals("Bread")) {
            bakedFood = new Bread(name, price);
            foodRepository.add(bakedFood);
        } else if (type.equals("Cake")) {
            bakedFood = new Cake(name, price);
            foodRepository.add(bakedFood);
        }

        return String.format("Added %s (%s) to the menu", name, type);
    }

    @Override
    public String addDrink(String type, String name, int portion, String brand) {
        Drink drink = drinkRepository.getByNameAndBrand(type, brand);
        if (drink != null) {
            throw new IllegalArgumentException(String.
                    format("%s %s is already in the menu", type, name));
        }
        if (type.equals("Tea")) {
            drink = new Tea(name, portion, brand);
            drinkRepository.add(drink);
        } else if (type.equals("Water")) {
            drink = new Water(name, portion, brand);
            drinkRepository.add(drink);
        }
        return String.format("Added %s (%s) to the drink menu", name, brand);
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table table = tableRepository.getByNumber(tableNumber);

        if (table != null) {
            throw new IllegalArgumentException(String.
                    format("Table %d is already added to the restaurant", tableNumber));
        }
        if (type.equals("InsideTable")) {
            table = new InsideTable(tableNumber, capacity);
            tableRepository.add(table);
        } else if (type.equals("OutsideTable")) {
            table = new OutsideTable(tableNumber, capacity);
            tableRepository.add(table);
        }

        return String.format("Added table number %s in the bakery", tableNumber);
    }

    @Override
    public String reserveTable(int numberOfPeople) {
        String  output = String.format("No available table for %d people", numberOfPeople);
        Table table = null;
        for (Table t : tableRepository.getAll()) {
            if (!t.isReserved() && t.getCapacity() >= numberOfPeople) {
                table = t;
                break;
            }
        }
        if (table != null) {
            output = String.format("Table %d has been reserved for %d people", table.getTableNumber(), numberOfPeople);
            table.reserve(numberOfPeople);
        }
        return output;
    }

    @Override
    public String orderFood(int tableNumber, String foodName) {
        String output = "";
        boolean canOrder = true;
        Table table = tableRepository.getByNumber(tableNumber);
        BakedFood bakedFood = foodRepository.getByName(foodName);

        if (table == null || !table.isReserved()) {
            canOrder = false;
            output = String.format("Could not find table %d", tableNumber);
        }
        if (bakedFood == null) {
            canOrder = false;
            output = String.format("No %s in the menu", foodName);
        }
        if (canOrder) {
            table.orderFood(bakedFood);
            output = String.format("Table %d ordered %s", tableNumber, foodName);
        }

        return output;
    }

    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {
        String output = "";
        boolean canOrder = true;
        Table table = tableRepository.getByNumber(tableNumber);
        Drink drink = drinkRepository.getByNameAndBrand(drinkName, drinkBrand);
        if (table == null || !table.isReserved()) {
            canOrder = false;
            output = String.format("Could not find table %d", tableNumber);
        }
        if (drink == null) {
            canOrder = false;
            output = String.format("There is no %s %s available", drinkName, drinkBrand);
        }
        if (canOrder) {
            output = String.format("Table %d ordered %s %s", tableNumber, drinkName, drinkBrand);
            table.orderDrink(drink);
        }
        return output;

    }

    @Override
    public String leaveTable(int tableNumber) {
        Table table = tableRepository.getByNumber(tableNumber);
        double bill = table.getBill();
        this.totalIncome += bill;
        table.clear();
        return String.format("Table: %d%nBill: %.2f", tableNumber, bill);
    }

    @Override
    public String getFreeTablesInfo() {
        StringBuilder out = new StringBuilder();
        for (Table table : tableRepository.getAll()) {
           out.append(table.getFreeTableInfo());
        }

        return out.toString().trim();
    }

    @Override
    public String getTotalIncome() {
        return String.format("Total income: %.2flv", this.totalIncome);
    }
}
