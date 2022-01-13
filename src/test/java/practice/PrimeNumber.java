package practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        // for (int j = 0; j<=4;j++) {
//            System.out.println("enter a number to check");
//
//            double x = sc.nextInt();
//            int devided=0;
//            int counter = 0;
//
//            for (int i = 2; i <= x /2; i++) {
//                devided=i;
//                if (x % i == 0) {
//                    counter = 1;
//                    System.out.println("Entered number is not a prime number");
//                    System.out.println("x was devided by " + i);
//                    break;
//                }
//            }
//            if (counter == 0) {
//                System.out.println("This is a prime number");
//                System.out.println("x was devided by number " + devided);
//            }
//       }
//
//        for (int j=0; j<=3;j++){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number to check");
//        int givenNum= scanner.nextInt();
//        int counter=0;
//        for (int i=2;i<=givenNum/2;i++) {
//            if (givenNum % i == 0) {
//                counter = 1;
//                System.out.println("Entered number isn't a prime number ");
//                break;
//            }
//        }
//            if (counter == 0) {
//                System.out.println(" This is a prime number ");
//            }
//
//        }
            String isPrime="", notPrime="";

            int count =0;
         for ( int i=2; i<=100; i++) {

             for (int j = 2; j <= i/2 ; j++) {
                 if (i % j == 0) {
                     count = 1;
                     notPrime = notPrime +  " "  + i;
                     break;
                 }
                 count=0;
             }
             if (count==0){
                 isPrime = isPrime+ " " + i;
             }
         }
        System.out.print("prime numbers:" + isPrime);
        System.out.println();
        System.out.print("not prime:" +notPrime);

    }

}
