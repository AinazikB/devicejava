import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        double totalPrice = 0.0;
        double totalWeight = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of devices you want to create: ");
        int numDevices = s.nextInt();
        if (numDevices > 20 || numDevices < 1){
            System.out.println("Incorrect input!");
        } else {
            Device device;
            for (int i = 0; i < numDevices; i++) {
                String[] dType = {"Smartphone", "Laptop", "Tablet"};
                String randomType = dType[r.nextInt(dType.length)];
                double randomPrice = 1000 + r.nextDouble() * 10000;
                double randomWeight = 1000 + r.nextDouble() * 1000;

                if (randomType.equals("Smarthpone")) {
                    double randomScreenSize = 1.0 + r.nextDouble() * 9.0;
                    double randomCameraRes = 5 + r.nextDouble() * 40;
                    device = new Smartphone(randomType, randomPrice, randomWeight, randomScreenSize, randomCameraRes);
                } else if (randomType.equals("Laptop")) {
                    int randomMemory = 32 + r.nextInt() * 480;
                    double randomScreenRes = 4.0 + r.nextDouble() * 16.0;
                    int randomBattery = 10 + r.nextInt() + 90;
                    device = new Laptop(randomType, randomPrice, randomWeight, randomMemory, randomScreenRes, randomBattery);
                } else {
                    double randomScrSize = 5.0 + r.nextDouble() * 19.0;
                    int randomBat = 10 + r.nextInt() * 90;
                    double randomMem = 32 + r.nextInt() * 480;
                    device = new Tablet(randomType, randomPrice, randomWeight, randomScrSize, randomBat, randomMem);
                }

                totalPrice += device.getPrice();
                totalWeight += device.getWeight();
            }

            System.out.println("Total price of all devices which you created: " + totalPrice + "$");
            System.out.println("Total weight of all devices which you created: " + totalWeight);
        }
    }
}
