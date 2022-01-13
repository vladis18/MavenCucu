package practice;

public class TestString {
    public static void main(String[] args) {
        String string = "HelloAll";

        for (int i=string.length()-1;i>=0;i--){
            System.out.print( string.charAt(i));
        }
    }
}
