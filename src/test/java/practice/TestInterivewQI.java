package practice;

public class TestInterivewQI
{
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args) {

        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("i = " + a  + " j = " + b);

        String x = "Hello";
        String y = "Wellcome";
        x=x+y;

        System.out.println("the length of y is " + y.length());
        System.out.println("the length of x is  " + x.length());
        y=x.substring(0,(x).length()-y.length());
        x=x.substring(y.length());
        System.out.println("x = "  + x);
        //x=x.substring(5,13);
        //x=x.substring(4, y.length());
        System.out.println(x.length());
       // x=x.substring(x.length(),y.length());
        System.out.println("x = " + x);
       // x=x.substring(0,y.length());
        System.out.println("y = "+y);

        System.out.println( isPrime(11));


//       int given =2;
//       boolean isPrime=true;
//
//       if(given>1) {
//           for (int i = 2; i < given; i++) {
//               if (given % i == 0) {
//                   isPrime = false;
//                   break;
//               }
//           }
//           }else{}
//
//        isPrime=false;
//        System.out.println("Given number " + given+ " is prime?" +isPrime);
    }
}
