//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Random;

public class QuickEmiQuote {
    public static void main(String[] args) {
        Random random = new Random();
        int p = random.nextInt(5000, 25000);
        int n = random.nextInt(6, 36);
        float APR = random.nextFloat(3.5F, 11.5F);
        float r = APR / 12.0F / 100.0F;
        double EMI = (double)((float)p * r) * Math.pow((double)(1.0F + r), (double)n) / (Math.pow((double)(1.0F + r), (double)n) - (double)1.0F);
        double totalPayments = EMI * (double)n;
        double var10000 = totalPayments - (double)p;
        IO.println("Your EMI is $" + (int)EMI);
        IO.println("Your EMI rounded is $" + Math.round(EMI));
        System.out.printf("Your EMI is $%.2f", EMI);
    }
}
