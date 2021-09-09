package dgg.qa;

public class Robot {

    String robotName;
    String robotColor;
    int robotHeight;
    int robotWeight;
    int robotWidth;
    boolean isWorker;
    boolean isFighter;

    String[] firstWing = {"9", "8", "7","6","5","4","3","2","1","BooM!!!"};

    public Robot(String robotName, String robotColor, int robotHeight, int robotWeight, int robotWidth) {
        this.robotName = robotName;
        this.robotColor = robotColor;
        this.robotHeight = robotHeight;
        this.robotWeight = robotWeight;
        this.robotWidth = robotWidth;
            }

    void SetWeight(int weight) {
        this.robotWeight = weight;
    }

    void isTall() {
        System.out.println(this.robotHeight > 11);
    }

    void isFat() {
        System.out.println(this.robotWeight > 1100);
    }


    void ifTallOrShort() {
        if (robotHeight >= 12) {
            System.out.println(robotName + " is tall");
        } else {
            System.out.println(robotName + " is short");
        }
    }


    void printAllParameters() {
        System.out.print(robotName + "appearance is: \n");
        System.out.println(robotColor);
        System.out.println(robotHeight);
        System.out.println(robotWeight);
        System.out.println(robotWidth);
    }

    void destroyRobot() {
        System.out.println(robotName + " will be destroyed in");

        for (String s : firstWing) {
            System.out.println(s);
        }
        System.out.println(robotName + " is destroyed but'll be back someday meat bags!!!");
        }



}

