
public class Popugaj extends Pets {
    private String ParrotBreed;
    private boolean talking;

    public Popugaj(int petId, boolean healthy, String petName, String diseases, double currentWeight, String birthDate,String ParrotBreed,boolean talking) {
        super(petId, healthy, petName, diseases, currentWeight, birthDate);
        this.ParrotBreed = ParrotBreed;
        this.talking = talking;
    }
    public String speak(){
        if(talking==true){
            return("I am talking\n-------------------");
        }
        else{
            return("Im not talking\n-------------------");
        }
    }

    @Override
    public String toString() {
        return "Popugaj{" +
                "healthy=" + isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", currentWeight=" + getCurrentWeight() +
                ", birthDate=" + getBirthDate() +
                ", petId=" + getPetId() +
                "ParrotBreed='" + ParrotBreed + '\'' +
                ", talking=" + talking +
                '}';
    }

    public String getParrotBreed() {
        return ParrotBreed;
    }

    public void setParrotBreed(String parrotBreed) {
        ParrotBreed = parrotBreed;
    }

    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }
}