package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double number = -999;
        int size = input.nextInt();
        double[] array = new double[size];
        for(int i=0; i < size;  i++) {
          array[i] = input.nextInt();
          if(array[i] > number){
            number=array[i];
          }
          
        }
        System.out.println("Max number: " + number);

        

    }
}