package practice;

public class RiverseStringCharToArray {
    public static void main(String[] args) {
        String str ="ABCDEFG";
        char myCharArray[] =str.toCharArray();
        for (int i=myCharArray.length-1; i>=0;i--){
            System.out.print(myCharArray[i]);
        }
    }
}
