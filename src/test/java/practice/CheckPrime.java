package practice;

public class CheckPrime

{
    public static void main(String[] args) {
        int couter=0;
        int    num;
        int  prime;

        for ( num = 1; num<=20; num++){
          //  if ( i/1==i) {
               // System.out.println(i);
             //   if (i / i == 1) {
//prime number between 1 to 100
//
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
                    if((num%num==0)) {
                        couter ++;
                    }

            if (couter  >=2) {
                prime = num ;
                System.out.println(prime);
                couter=0;
                continue;
            }


        }

//        int i,j,count=0;
//        //print prime no between 1 to 100
//        System.out.println("prime number between 1 to 100\n");
//
//        //loop for printing prime no between 1 to 100
//        for(i=2;i<=20;i++) {
//            for(j=1;j<=i;j++)
//            {
//                if(i%j==0) {
//                    count++;
//                }
//            }
//            if(count==2) {
//                System.out.print(" " + i);
//            }
//                count = 0;
//
//
//        }

    }
}
