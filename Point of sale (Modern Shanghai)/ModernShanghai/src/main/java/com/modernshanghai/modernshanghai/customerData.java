/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modernshanghai.modernshanghai;

import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Xeb
 */
public class customerData {
    public static String name;
    public static String gender;
    public static String superCard;
    public static String transactionType;
    public static Object[][] tableData;
    
    public static double overallTotal;
    public static double payment;
    public static String transactionNumber;
    public static String supercard;
    public static String type;
    
    public static String setTransactionNumber()
    {
        Random random = new Random();
        
        // Generate a 10-digit number
        long randomNumber = 100_000_0000L + random.nextLong() % 9_000_000_000L;
        transactionNumber = Math.abs(randomNumber) + "";
        return Math.abs(randomNumber) + "";
    }
    
    public static String setSuperCardNumber()
    {
        Random random = new Random();
        
        // Generate a 10-digit number
        long randomNumber = 100_000_0000L + random.nextLong() % 9_000_000_000L;
        String formattedNumber = String.format("%010d", Math.abs(randomNumber));
        supercard = formattedNumber;
        return formattedNumber;
    }
}
