package practice;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestException {

    public static List<Exception> listOfExceptions(){
        Exception exception1 = new Exception();
        Exception exception2 = new Exception();
        Exception exception3 = new Exception();
        Exception exception4= new Exception();






        try {
            exception1.getCause();


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It's out of bound array" + e.getCause());
        }
        try { exception2.fillInStackTrace();
        }catch (   IndexOutOfBoundsException e ) {
            System.out.println("it's out of bound index    " + e)  ;
        }
        try {exception3.getSuppressed();
        }catch (InputMismatchException e ){
            System.out.println( "Input is mismatched " + e );
        }
        try {  exception4.getCause();
        }catch (IllegalArgumentException e){
            System.out.println( " it's Illegal Argument Exception   " +  e );
        }
        List<Exception> exceptionsList = new ArrayList<>();
        exceptionsList.add( exception1);
        exceptionsList.add(exception2);
        exceptionsList.add(exception3);
        exceptionsList.add(exception4);
        return exceptionsList;
    }

    public static void main(String[] args) {

        Throwable trh= new Throwable();
        System.out.println(listOfExceptions());
        int i=1;
        int nums []={13,14};
        Scanner scan = new Scanner(System.in);


        try{
            System.out.println(nums[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println( "out of bound index " + e);
        }

        try{
            int  text = scan.nextInt();
        }
catch (InputMismatchException e){
    System.out.println("You made a booboo  " + e  + " " + trh.getSuppressed() + e.initCause(e.getCause()));


}
        System.out.println("this is where i am checking out");


    }
}
