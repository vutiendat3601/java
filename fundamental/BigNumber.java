package fundamental;

import java.math.BigDecimal;

public class BigNumber {
    public static void main(String[] args) {
        BigDecimal revenueQ1 = new BigDecimal("1031190123000562300267071");
        BigDecimal revenueQ2 = new BigDecimal("311901231105623002631");
        System.out.println(revenueQ1.add(revenueQ2));
        System.out.println(revenueQ2.subtract(revenueQ1));
        System.out.println(revenueQ2.multiply(BigDecimal.valueOf(4L)));
        System.out.println(revenueQ2.divide(BigDecimal.valueOf(4L)));
    }
}
