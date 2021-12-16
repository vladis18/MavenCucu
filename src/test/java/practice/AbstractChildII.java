package practice;

public  class AbstractChildII extends AbstractParent {

    //AbstractParent abstractParent = new AbstractChildII() {};

    @Override
    public void message() {
        System.out.println("Hello from overridden message");
    }

    public static void main(String[] args) {
        AbstractChildII abstractChildII=new AbstractChildII();
        abstractChildII.message();
    }
//
//        @Override
//        public void message() {
//
//        }
//        @Override
//        public void message() {
//            System.out.println("hello");
//        }
//    };
//
//
//    @Override
//    public void message() {
//
//    }

}