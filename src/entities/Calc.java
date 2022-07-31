package entities;

public class Calc {

    public static double P1 = 2.0;
    public static double P2 = 3.0;
    public static double P3 = 5.0;

    private double n1;
    private double n2;
    private double n3;

    public Calc(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double calcAverage(double n1, double n2, double n3) {

        double average = ((n1 * P1) + (n2 * P2) + (n3 * P3)) / (P1 + P2 + P3);
        return average;

    }
}
