package Epam.Interest;

public class DrivingClass {
    public static void main(String[] args) {
        CompoundInterest simpleInterest = new CompoundInterest(1000, 2.5, 2);
        System.out.println(simpleInterest.interest());
    }


}
