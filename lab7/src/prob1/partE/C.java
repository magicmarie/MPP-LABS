package prob1.partE;

public interface C extends A {
    default void method() {
        System.out.println("C method");
    };
}
