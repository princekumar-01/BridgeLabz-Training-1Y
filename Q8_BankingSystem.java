// com/bank/util/InterestCalculator.java
package com.bank.util;

public class InterestCalculator {
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }

    public double calculateCompoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100.0), t) - p;
    }
}


// BankingMain.java
import static java.lang.Math.*;
import com.bank.util.InterestCalculator;

public class BankingMain {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 8.5;
        double time = 3.0;

        InterestCalculator calc = new InterestCalculator();

        double si = calc.calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest   : %.2f%n", si);
        System.out.printf("Amount after SI   : %.2f%n", principal + si);

        double ci = principal * pow((1 + rate / 100.0), time) - principal;
        System.out.printf("Compound Interest : %.2f%n", ci);
        System.out.printf("Amount after CI   : %.2f%n", principal + ci);
    }
}
