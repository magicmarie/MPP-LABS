package prob1.partE;

public interface B extends A {
    default void method() {
        System.out.println("B method");
    };
}
