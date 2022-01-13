package practice;

public class TestLoop {
    public static void main(String[] args) {
        for (int i =1; i<=5; i++){
           System.out.print( "outer " + i);
            for ( int j =1; j<=i-j; j++ ){
                System.out.print(" inner1  " + j);
                for (int k =1; k<=j;k ++ ){
                    System.out.print(" inner2 " + k) ;
                }

            }
            System.out.println();
        }
        for (int i =1; i<=5; i++){

            for ( int j =1; j<=i; j++ ){
               //System.out.print(" ");
                for (int k =i; k>=j;k -- ){

                    System.out.print(" ") ;
//                     for(int l=5; l>=i; l--){
//                         System.out.print("   *   ");
//                     }

                }
              // System.out.print(" ");
            }
            System.out.print(" * ");
            for(int l=5; l>=i; l--){
                         System.out.print("   *   ");
                     }
            System.out.println();
        }

 int y ;
        int row = 5;


            for (int x =0; x<row; x++){
                //System.out.print( "outer " + i);
                for(y=2*(row-x); y>=0; y--){
                    System.out.print(" " );
                }
                    for (y =0; y<=x;y ++ ){
                        System.out.print(" * " ) ;
                    }


                System.out.println();
            }
    }
}
