package practice;

public class TestForLooprPyramid {
    public static void main(String args[])
    {
//x for rows, y for columns, and row denotes the number of rows to print
        int x, y, row = 5;
//Outer loop for rows
        for (x=0; x<row; x++)
        {
//inner loop for space
            for (y=row-x; y>1; y--)
            {
//To print space between two stars
                System.out.print("-");
            }
//inner loop for columns
            for (y=0; y<=x; y++ )
            {
//To print star
                System.out.print(" * ");
            }
//Cursor goes to the new line after printing each line.
            System.out.println();
        }

        for(int i=0;i<=5;i++){
            for(int j = 5; j>=1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i =0;i<=5;i++){
            for (int j=5;j>=1;j--){
                System.out.print( " ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(" + ");
            }
            System.out.println();
        }



    }
}
