package practice;

public class PrimeNumbers {
    public static void main(String[] args) {


//        int num1, num2 = 0;//&& (! (i%3==0)) &&(! (i%4==0)) && (!(i%5==0))
//
//        for (int i = 0; i <= 100; i++) {
//            // i <= num / 2
//            num2 = i;
//
//            if (i > 0) {
//                if (num2 <= i / 2) {
//                    if (!(i % i == 0)) {
//
//                        num1 = i;
//                        System.out.println(num1);
//                    }
//                }
//            }
//        public static void main (String[] args){
//            int i =0;
//            int num =0;
//            String  primeNumbers = "";
//
//            for (i = 1; i <= 100; i++){
//                int counter=0;
//                for(num =i; num>=1; num--){
//                    if(i%num==0){
//                        counter = counter + 1;
//                    }
//                }
//                if (counter ==2){
//                    primeNumbers = primeNumbers + i + " ";
//                  //  System.out.print( i+" ");
//                }
//            }
//            System.out.println("Prime numbers from 1 to 100 are :");
//            System.out.println(primeNumbers);
//        }


                int i,j,count=0;
                //print prime no between 1 to 100
                System.out.println("prime number between 1 to 100\n");

                //loop for printing prime no between 1 to 100
                for(i=2;i<=100;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        if(i%j==0)
                            count++;
                    }
                    if(count==2)
                        System.out.print(" "+i);
                    count=0;
                }
        }
    }
//}