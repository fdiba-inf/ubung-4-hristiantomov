package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        int size = input.nextInt();
        int[]array = new int[size];
        for(int i = 0; i < size; i++){
          array[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
          for(int j = 0; j < i; j++) {
            System.out.print(" ");
          }
        System.out.println(array[i]);
    }
  }
}