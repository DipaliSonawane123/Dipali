package com.program;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int i, number, count = 0;
        Scanner  sc = new Scanner(System.in);
        System.out.print(" Please Enter any Integer : ");
        number = sc.nextInt();
        for (i = 2; i <number; i++)
        {
            if(number % i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0 && number != 1 )
        {
            System.out.println( number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is is Not Prime Number");
            sc.close();
        }
    }
}
