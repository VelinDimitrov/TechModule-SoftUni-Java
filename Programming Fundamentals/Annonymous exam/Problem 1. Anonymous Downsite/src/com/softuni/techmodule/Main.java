package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int websites=Integer.parseInt(input.readLine());
        int securityKeys=Integer.parseInt(input.readLine());
        BigDecimal totalLoss=BigDecimal.ZERO;
        BigInteger securityToken=BigInteger.valueOf(securityKeys);
        securityToken=securityToken.pow(websites);
        for (int i = 0; i < websites; i++) {
            String[] websiteInfo=input.readLine().split(" ");
            String website=websiteInfo[0];
            System.out.println(website);

            long siteVisits=Long.parseLong(websiteInfo[1]);
//            double siteCommercialPricePerVisit=Double.parseDouble(websiteInfo[2]);
            BigDecimal siteCommercialPricePerVisit=new BigDecimal(websiteInfo[2]);

            BigDecimal currentLoss=BigDecimal.valueOf(siteVisits);
//            currentLoss=currentLoss.multiply(BigDecimal.valueOf(siteCommercialPricePerVisit));
            currentLoss=currentLoss.multiply(siteCommercialPricePerVisit);
            totalLoss=totalLoss.add(currentLoss);
        }
        System.out.printf("Total Loss: %.20f%nSecurity Token: %d",totalLoss,securityToken);
    }
}
