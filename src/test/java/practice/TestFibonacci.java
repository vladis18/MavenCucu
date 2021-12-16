package practice;

public class TestFibonacci {
    public static void main(String[] args) {
//        int a = 0, b = 1, c;
//        // To print 0 and 1
//        System.out.print(a + " " + b);
//        // loop starts from 2. We have already printed 0 and 1 in the previous step
//        for (int i = 2; i < 10; i++) {
//            c = a + b;
//            System.out.print(" " + c);
//            a = b;
//            b = c;
//        }
 int aa=0, bb=1, cc=0;

//for (int i =0; i<=10; i++) {
//    cc = bb + aa;
//    System.out.println(cc);
//
//    aa = bb;
//    bb = cc;
//}
//        for (int i =0; i<=10;i++){
//            cc=bb+aa;
//            System.out.print(cc + "  ");
//            aa=bb;
//            bb=cc;
//        }

        for (int i =0;i<=10;i++){
            cc=bb+aa;
            System.out.println(cc+" ");
            aa=bb;
            bb=cc;

        }
    }
}
