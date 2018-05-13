package my.com.miniaturemechanics.javapractice;

public class Car {
    public String colour = "Black";
    private int mNumberOfSeats = 5;
    private String mInterior;

    public Car() {

    }

    public Car(String chosenColour, String chosenInterior) {
        colour = chosenColour;
        mInterior = chosenInterior;
    }

    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void drive() {
        System.out.println("Car is moving!!!");
    }

    public void drive(int speed) {
        System.out.println(speed);
    }

    public void drive(String name) {
        System.out.println(name);
    }
}
