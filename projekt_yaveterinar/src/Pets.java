import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Pets {
    private int petId;
    private boolean healthy;
    private String petName;
    private String diseases;
    private double currentWeight;
    private String birthDate;
    private static ArrayList<Pets> petsCollection=new ArrayList<Pets>();

    Scanner scan = new Scanner(System.in);
    public Pets(int petId,boolean healthy,String petName,String diseases,double currentWeight,String birthDate) {
        this.petId=petId;
        this.healthy=healthy;
        this.petName=petName;
        this.diseases=diseases;
        this.currentWeight=currentWeight;
        this.birthDate=birthDate;
    }
    public void registration(){

        System.out.println(" Hello we are veterynary from Dagda, I am doc Jonny, Mr. Sins. \n There ar two options: either you put your pet into a base of clinic or it is already in there. \n Which one would you like to choose?");
        int x = scan.nextInt();
        Pets p1=new Pets(0,false,"","",0,"");
        Dog p2 = new Dog(1, false, "bobik", "diarea", 5.6, "year:2015, month:04,date:19", "yorkterier", true);
        Popugaj p3=new Popugaj(2,true,"Gesha","perja padajut",0.7,"year:2022, month:08,date:11","razgovorny",true);
        Python p4=new Python(3,false,"inokentij","not eating ",7,"year:2020, month:03,date:8",3,false);
        Fish p5=new Fish(4,true,"masha","oxygen unbalance",0.8,"year:2024, month:01,date:12","pike",true);
        if (x == 1) {
            System.out.println("Do you have a dog,python.parrot or a fish?");
            scan.nextLine();
            String z = scan.nextLine();
            if(z.equals("Dog")) {
                System.out.println("Enter your dog characteristics");
                System.out.println("Enrter your pet id");
                petId = scan.nextInt();
                System.out.println("Is your dog healthy?");
                boolean healthy = scan.nextBoolean();
                scan.nextLine();
                System.out.println("Enrter your pet name");
                String petName = scan.nextLine();
                System.out.println("Enrter your pet diseases");
                String diseases = scan.nextLine();
                System.out.println("Enrter your pet weight");
                double currentWeight = scan.nextDouble();
                scan.nextLine();
                System.out.println("Enrter your pet birth date");
                String birthDate = scan.nextLine();
                System.out.println("Enrter your pet breed");
                String dogBreed = scan.nextLine();
                System.out.println("Enrter your dog a good housekeeper?");
                boolean goodHouseKeeper = scan.nextBoolean();
                p2 = new Dog(petId, healthy, petName, diseases, currentWeight, birthDate, dogBreed, goodHouseKeeper);
                System.out.println(p2.toString());
                Pets.addPets(p2);
            }

            else if(z.equals("Parrot")){
                System.out.println("Enter your parrot characteristics");
                System.out.println("Enrter your pet id");
                int x1= scan.nextInt();
                System.out.println("Is your parrot healthy?");
                boolean x2= scan.nextBoolean();
                scan.nextLine();
                System.out.println("Enrter your pet name");
                String x3= scan.nextLine();
                System.out.println("Enrter your pet diseases");
                String x4= scan.nextLine();
                System.out.println("Enrter your pet weight");
                double x5= scan.nextDouble();
                scan.nextLine();
                System.out.println("Enrter your pet birth date");
                String x6= scan.nextLine();
                System.out.println("Enrter your pet breed");
                String x7= scan.nextLine();
                System.out.println("Enrter your parrot talking?");
                boolean x8= scan.nextBoolean();
                Popugaj p6 = new Popugaj(x1,x2,x3, x4,x5,x6,x7,x8);
                System.out.println(p6.toString());
                    Pets.addPets(p6);
            }
            else if(z.equals("Fish")){
                System.out.println("Enter your fish characteristics");
                System.out.println("Enrter your pet id");
                int x1= scan.nextInt();
                System.out.println("Is your fish healthy?");
                boolean x2= scan.nextBoolean();
                scan.nextLine();
                System.out.println("Enrter your pet name");
                String x3= scan.nextLine();
                System.out.println("Enrter your pet diseases");
                String x4= scan.nextLine();
                System.out.println("Enrter your pet weight");
                double x5= scan.nextDouble();
                scan.nextLine();
                System.out.println("Enrter your pet birth date");
                String x6= scan.nextLine();
                System.out.println("Enrter your pet breed");
                String x7= scan.nextLine();
                System.out.println("Enrter your fish a predator?");
                boolean x8= scan.nextBoolean();
                Fish p7 = new Fish(x1,x2,x3, x4,x5,x6,x7,x8);
                System.out.println(p7.toString());
                    Pets.addPets(p7);
            }
            else if(z.equals("Python")){
                System.out.println("Enter your python characteristics");
                System.out.println("Enrter your pet id");
                int x1= scan.nextInt();
                System.out.println("Is your python healthy?");
                boolean x2= scan.nextBoolean();
                scan.nextLine();
                System.out.println("Enrter your pet name");
                String x3= scan.nextLine();
                System.out.println("Enrter your pet diseases");
                String x4= scan.nextLine();
                System.out.println("Enrter your pet weight");
                double x5= scan.nextDouble();
                scan.nextLine();
                System.out.println("Enrter your pet birth date");
                String x6= scan.nextLine();
                System.out.println("Enrter your python's length");
                int x7= scan.nextInt();
                System.out.println("Enrter your python poisonous?");
                boolean x8= scan.nextBoolean();
                Python p11 = new Python(x1,x2,x3, x4,x5,x6,x7,x8);
                System.out.println(p11.toString());
                    Pets.addPets(p11);
            }
            else{
                System.out.println("chosen option is incorrect");
            }

        }
        else if (x == 2) {
            System.out.println("Enter your petId(1-4)");
            int y = scan.nextInt();
            if (y == 1) {
                System.out.println(p2.toString());
            }
            else if (y == 2) {
                System.out.println(p3.toString());
            }
            else if (y == 3) {
                System.out.println(p4.toString());
            }
            else if (y == 4) {
                System.out.println(p5.toString());
            }
            else{
                System.out.println("Chosen option is incorrect");
            }
        }
        else {
            System.out.println("Chosen option is incorrect");
        }

Pets.writeFile();
        if(p2.isHealthy()==false){
            System.out.println("Enter the treatment you'd like to choose(pain killer,sedative,both)");
            scan.nextLine();
            String option = scan.nextLine();
            if ((Objects.equals(option, "pain killer"))||(Objects.equals(option, "Pain killer"))) {

                double dosage = (currentWeight/2.20462)*(0.002/12);

                System.out.println("Carprofen dosage: "+dosage);

            }

            if ((Objects.equals(option, "sedative"))||(Objects.equals(option, "Sedative"))) {

                double dosage = (currentWeight/2.20462)*(0.002/10);

                System.out.println("Acepromazine dosage: "+dosage);

            }

            if ((Objects.equals(option, "both killer and sedative"))||(Objects.equals(option, "Both killer and sedative"))) {

                double dosage = (currentWeight/2.20462)*(0.002/12);

                double dosage1 = (currentWeight/2.20462)*(0.0002/10);

                System.out.println("Carprofen dosage: "+dosage+"\nAcepromazine dosage: "+dosage1);

            }

        }
        else{
            System.out.println("It is healthy, idi domoj");
        }
    }

    public void treatment(){

    }

    public String speak(){
        return("I am speaking");
    }
    public String healing(){
        return "Almost healthy";
    }
    public String eat(){return("I am eating");}

    public String toString() {
        return "Pets{" +
                "healthy=" + healthy +
                ", petName='" + petName + '\'' +
                ", diseases='" + diseases + '\'' +
                ", currentWeight=" + currentWeight +
                ", birthDate=" + birthDate +
                ", petId=" + petId +
                '}';
    }
    public static ArrayList<Pets> getPetsCollection() {
        return petsCollection;
    }
    public static void addPets(Pets pets){petsCollection.add(pets);}
    public static void removePets(Pets pets){petsCollection.remove(pets);}
    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("failik.txt",true);
            for (Pets pets: petsCollection){
                fw.write(pets.toString()+"\n");
                fw.write( pets.speak() + "\n");
                fw.write( pets.healing() + "\n");
                fw.write( pets.eat() + "\n");}
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
