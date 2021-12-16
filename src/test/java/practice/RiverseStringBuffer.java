package practice;

public class RiverseStringBuffer {
    public static void main(String[] args) {
        // Using StringBuffer class
        StringBuffer a = new StringBuffer("Software Testing Material");
        StringBuffer b  = new StringBuffer("ABCDEF");
        System.out.println(b.reverse());
        // use reverse() method to reverse string
        System.out.println(a.reverse());
        System.out.println(a.length());
        System.out.println( a.append(  "SSS", 0, 3));
        System.out.println(a.delete(3, 7));
        System.out.println(a.append("HELLO",0,5));
        System.out.println(b.delete(0,5));

    }
}
