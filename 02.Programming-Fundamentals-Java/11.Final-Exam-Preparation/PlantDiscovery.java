import java.util.*;

public class PlantDiscovery {
    static class Plant {
        String plantName;
        int rarity;
        List<Double> ratings;


        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public List<Double> getRating() {
            return ratings;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public String getPlantName() {
            return plantName;
        }

        public int getRarity() {
            return rarity;
        }

        public double getAverageRating() {
            if (this.ratings.isEmpty()) {
                return 0;
            }
            double averageRating = 0;
            for (Double rating : this.ratings) {
                averageRating += rating;
            }
            averageRating = averageRating / this.ratings.size();
            return averageRating;
        }

        public Plant(String plantName, int rarity) {
            this.plantName = plantName;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public void resetRating() {
            this.ratings.clear();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> plantsByName = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");

            Plant p = new Plant(input[0], Integer.parseInt(input[1]));
            plantsByName.put(p.getPlantName(), p);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandAndParameters = command.split(": ");

            switch (commandAndParameters[0]) {
                case "Rate":
                    String[] parameters = commandAndParameters[1].split(" - ");
                    double rating = Double.parseDouble(parameters[1]);
                    String ratePlantName = parameters[0];
                    Plant ratePlant = plantsByName.get(ratePlantName);
                    if (ratePlant != null) {
                        ratePlant.addRating(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    String[] updateParameters = commandAndParameters[1].split(" - ");
                    String updatePlantName = updateParameters[0];
                    int updateNum = Integer.parseInt(updateParameters[1]);
                    Plant updatePlant = plantsByName.get(updatePlantName);
                    if (updatePlant != null) {
                        updatePlant.setRarity(updateNum);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    String resetPlantName = commandAndParameters[1];
                    Plant resetPlant = plantsByName.get(resetPlantName);
                    if (resetPlant != null) {
                        plantsByName.get(resetPlantName).resetRating();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        plantsByName.values()
                .stream()
                .sorted((a, b) -> {
                    if (a.getRarity() != b.getRarity()) {
                        return Integer.compare(b.getRarity(), a.getRarity());
                    } else {
                        return Double.compare(b.getAverageRating(), a.getAverageRating());
                    }
                })
                .map(p -> "- " + p.getPlantName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f", p.getAverageRating()))
                .forEach(s -> System.out.println(s));


    }
}
