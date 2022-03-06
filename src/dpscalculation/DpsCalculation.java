/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpscalculation;

/**
 *
 * @author Raihan Mahamud
 */
public class DpsCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DpsCalculation eCalc = new DpsCalculation();
        eCalc.calcEmi(5000, 9, 30);

    }

    public void calcEmi(double p, double r, double n) {
        double R = (p * (r / 100)) / 12;
        double profit = 0.0;
        double total = p * n;
        double value = 0.0;
        double totalvalue = p;

        for (double i = 1; i <= n; i++) {

            profit = (((p * i) + value) * (r / 100) / 12);
            //profit = ((((p * i) + value) * r * 30) / 36500);
            value += profit;

            System.out.println(" Month -> " + (int) i + " Value-->" + (p * i));
            System.out.println(" Profit -> " + (p * i) + " Value-->" + profit);

        }
        totalvalue *= n;
        System.out.println(" totalvalue-> " + totalvalue);
        System.out.println(" value-> " + (value + total));
        System.out.println(" Profit-> " + (value));

        //return R;
    }

    public void calcEmiAllMonths(double p, double r, double n) {

        /* double R = (r / 12) / 100;
        double P = p;
        double e = calcEmi(P, r, n);
        double totalInt = Math.round((e * n) - p);
        double totalAmt = Math.round((e * n));
        //System.out.println(" Profit-> " + P);
        System.out.println("***************************");
        System.out.println(" Principal-> " + P);
        System.out.println(" Rate of Interest-> " + r);
        System.out.println(" Number of Months-> " + n);

        System.out.println(" EMI -> " + Math.round(e));
        System.out.println(" Total Interest -> " + totalInt);
        System.out.println(" Total Amount -> " + totalAmt);

        System.out.println("***************************");
        double intPerMonth = Math.round(totalInt / n);

        for (double i = 1; i <= n; i++) {
            intPerMonth = (P * R);
            P = ((P) - ((e) - (intPerMonth)));
            System.out.println(" Month -> " + (int) i);

        }*/
    }

}
