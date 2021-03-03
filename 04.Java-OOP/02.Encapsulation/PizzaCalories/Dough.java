package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;
    private double bakingTechniqueModifier = 0;
    private double flourTypeModifier = 0;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
                flourTypeModifier = 1.5;
                this.flourType = flourType;
                break;
            case "Wholegrain":
                flourTypeModifier = 1.0;
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
                bakingTechniqueModifier = 0.9;
                this.bakingTechnique = bakingTechnique;
                break;
            case "Chewy":
                bakingTechniqueModifier = 1.1;
                this.bakingTechnique = bakingTechnique;
                break;
            case "Homemade":
                bakingTechniqueModifier = 1.0;
                this.bakingTechnique = bakingTechnique;
                break;

            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * weight * bakingTechniqueModifier * flourTypeModifier;
    }
}
