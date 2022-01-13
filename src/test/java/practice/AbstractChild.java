package practice;

public class AbstractChild extends AbstractParent{
    public static void main(String[] args) {


//    @Override
//    public void message() {
//        System.out.println("hello");
//    }
         AbstractParent parent = new AbstractChild();
        parent.method();
        String str4 = "100";
        // Integer.parseInt()
        System.out.println( Integer.parseInt( str4 ));

String s = "hello";
String s2 = "hello";
String s3 = new String("hello");

        System.out.println(  s.equals(s2));
        System.out.println(   s ==s2 );
        System.out.println(s.equals(s3));
        System.out.println(s==s3);
        String str = "Hello";

String str2 = str.concat("Hello00000");
str2.concat(" Goodbye");

        System.out.println(str2);
        System.out.println(str2);
str = str+" World";



//str.concat(" World");
        System.out.println(str);
        System.out.println(str==(str));

        for (int i =1; i<=5; i++){

            for (int j=1; j<=i;j++){
                System.out.print(j+ " " );
            }

            System.out.println(" ");
        }
        for (int i =5; i>=1; i--){

            for (int j=1; j<=i;j++){
                System.out.print( "X " );
            }

            System.out.println(" ");
        }

        for (int i =5; i>=1; i--){
            System.out.print(" ");
            for (int j=5; j>=i;j--){
                System.out.print( "X " );


            }

            System.out.println(" ");
        }
//x for rows, y for columns, and row denotes the number of rows to print
        int x, y, row=5;
//outer loop for number of rows
        for(x=0; x<row; x++)
        {
//inner loop for columns
            for(y=2*(row-x); y>=0; y--)
            {
//To prints spaces
                System.out.print(" ");
            }
//Inner loop for columns
            for(y=0; y<=x; y++)
            {
//To prints stars
                System.out.print("* ");
            }
//Cursor goes to the new line after printing each line
            System.out.println();
        }

//    AbstractParent parent = new AbstractParent() {
//        @Override
//        public void message() {
//            System.out.println("hello");
//        }
//    };


    }

    @Override
    public void message() {

    }
}
