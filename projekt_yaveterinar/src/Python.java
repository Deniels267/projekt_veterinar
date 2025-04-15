
public class Python extends Pets {
    private int length;
    private boolean poison;

    public Python(int petId, boolean healthy, String petName, String diseases, double currentWeight, String birthDate,int length,boolean poison) {
        super(petId, healthy, petName, diseases, currentWeight, birthDate);
        this.length = length;
        this.poison = poison;
    }
    public String bite(){
        if(length>2){
            return("I am biting\n-------------------");
        }
        else{
            return("Im not biting\n-------------------");
        }
    }

    @Override
    public String toString() {
        return "Python{" +
                "healthy=" + isHealthy() +
                ", petName='" + getPetName() + '\'' +
                ", diseases='" + getDiseases() + '\'' +
                ", currentWeight=" + getCurrentWeight() +
                ", birthDate=" + getBirthDate() +
                ", petId=" + getPetId() +
                "length=" + length +
                ", poison=" + poison +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }
}