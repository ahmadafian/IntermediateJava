package my.com.miniaturemechanics.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching my CarSimulator!!!");

        Car myHyundai = new Car("Red", "Leather");
        System.out.println("My Hyundai is coloured " + myHyundai.colour);
        System.out.println("It has " + myHyundai.getNumberOfSeats() + " seats!!!");
        System.out.println("My Hyundai's interior is " + myHyundai.getInterior());
        myHyundai.drive();
        myHyundai.drive(63);
        myHyundai.drive("Ayam");

    }
}
