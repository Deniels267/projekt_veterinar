
public class Fish extends Pets {
    private String FishBreed;
    private boolean predator;

    public Fish(int petId, boolean healthy, String petName, String diseases, double currentWeight, String birthDate,String FishBreed,boolean predator) {
        super(petId, healthy, petName, diseases, currentWeight, birthDate);
        this.FishBreed = FishBreed;
        this.predator = predator;
    }

    public String eat() {
        if (predator==true) {
            return ("I am hungry\n-------------------");
        } else {
            return ("Im not hungry\n-------------------");
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "healthy=" + isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", currentWeight=" + getCurrentWeight() +
                ", birthDate=" + getBirthDate() +
                ", petId=" + getPetId() +
                "FishBreed='" + FishBreed + '\'' +
                ", predator=" + predator +
                '}';
    }

    public String getFishBreed() {
        return FishBreed;
    }

    public void setFishBreed(String fishBreed) {
        FishBreed = fishBreed;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }
}