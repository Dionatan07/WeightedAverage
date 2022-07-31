package application;

import entities.Calc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int cont = key.nextInt();

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < cont; i++) {
            double n1 = key.nextDouble();
            double n2 = key.nextDouble();
            double n3 = key.nextDouble();

            Calc calc = new Calc(n1, n2, n3);

            list.add(calc.calcAverage(n1, n2, n3));
        }
        for(Double num : list){
            System.out.println(String.format("%.1f", num));
        }


    }
}
