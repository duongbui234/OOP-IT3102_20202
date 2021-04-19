package week2;

import java.util.*;

public class Harmonic {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = sc.nextInt();
        float harmonic = 0;

        for(int i=0; i<n; i++){
            harmonic += 1. / (i+1);
        }

        System.out.println("Harmonic(" + n+ ") = " + harmonic);
    }
}
