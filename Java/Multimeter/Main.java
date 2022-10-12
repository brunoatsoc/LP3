import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        double[] voltage = new double[10];
        double sumV = 0, sumS = 0, average, deviation;

        for(int i = 0; i < 10; i++){
            System.out.printf("Enter the %d measurement: ", i + 1);
            voltage[i] = input.nextDouble();
            sumV = sumV + voltage[i];
        }

        average = sumV / 10;

        for(int i = 0; i < 10; i++){
            sumS = sumS + (voltage[i] - average) * (voltage[i] - average);
        }

        deviation = Math.sqrt(sumS / 10);

        System.out.printf("Average is %f\n\n", average);
        System.out.printf("Deviation is %f\n\n", deviation);

        for(int i = 0 ; i < 10; i++){
            System.out.printf("Voltage %d: %f\n", i + 1, voltage[i]);
        }

        if(deviation < (0.1 * average)){
            System.out.println("\nMultimeter with problem.");
        }else{
            System.out.println("\nMultimeter can be used.");
        }

        input.close();
    }
}