package dgg.qa;

public class Main {

    public static void main(String[] args) {
        Robot Bob = new Robot("Bob","Red",12,1000,8);
        Robot Jack = new Robot("Jack", "White", 12, 900, 7);
        Robot Butty = new Robot("Butty","Green",10,750,6);

        System.out.println(Bob.robotName + " is " + Bob.robotHeight + " meters tall");

        Bob.isTall();

        Butty.isTall();

        Bob.isFat();

        System.out.println(Bob.robotWeight);
        Bob.SetWeight(1200);
        System.out.println(Bob.robotWeight);
        Bob.isFat();

        Jack.printAllParameters();

        Jack.ifTallOrShort();

        Butty.ifTallOrShort();

        Bob.destroyRobot();




       }

}
