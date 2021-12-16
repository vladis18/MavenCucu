package practice;

public class RiverseStringBuilder {
    public static void main(String[] args) {

        System.out.println();
        String input="Software Testing Material";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);
        for (int i=0;i<input1.length();i++)
            System.out.print(input1.charAt(i));
        System.out.println();
        for (int j=input1.length()-1;j>=0;j--){
            System.out.print(input1.charAt(j));
        }
    }
}
