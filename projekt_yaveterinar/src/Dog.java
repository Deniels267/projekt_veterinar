
public class Dog extends Pets{
    private String dogBreed;
    private boolean goodHouseKeeper;

    public Dog(int petId, boolean healthy, String petName, String diseases, double currentWeight, String birthDate,String dogBreed,boolean goodHouseKeeper) {
        super(petId,healthy,petName,diseases,currentWeight,birthDate);
        this.dogBreed=dogBreed;
        this.goodHouseKeeper=goodHouseKeeper;
    }
    public String bark(){
        return("woof woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "healthy=" + isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", currentWeight=" + getCurrentWeight() +
                ", birthDate=" + getBirthDate() +
                ", petId=" + getPetId() +
                "dogBreed='" + dogBreed + '\'' +
                ", goodHouseKeeper=" + goodHouseKeeper +
                '}';
    }

    public boolean isGoodHouseKeeper() {
        return goodHouseKeeper;
    }

    public void setGoodHouseKeeper(boolean goodHouseKeeper) {
        this.goodHouseKeeper = goodHouseKeeper;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}
