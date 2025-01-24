package prob1.partE;

//public class D implements B, C {
//    @Override
//    public void method() {
//        // you are implementing two interfaces with the same methodName and Signature
//        // so all you have to do is write your own overridden logic here.
//        B.super.method();
//    }
//
//    public static void main(String[] args) {
//        D d = new D();
//        d.method();
//    }
//}

public interface D  extends B, C {

        public static void main(String[] args) {}

    @Override
    default void method() {
        B.super.method();
    }
}

