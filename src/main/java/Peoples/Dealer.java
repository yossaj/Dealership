package Peoples;

public class Dealer extends Person{
    private int gabLevel;
    private int honestyLevel;

    public Dealer(String name, int age, int gabLevel, int honestyLevel){
        super(name, age);
        this.gabLevel = gabLevel;
        this.honestyLevel = honestyLevel;
    }


    public int getGabLevel() {
        return gabLevel;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }
}
