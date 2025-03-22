// final class
final class FinalParent {
    // variable
}

// can't extend final class
// class Child extends FinalParent {

// }

class Parent2 {
    // final variables needs to be initialized
    final int value1 = 10;

    final void finalMethod() {
        System.out.println("this is a final method");
    }
}

class Child2 extends Parent2 {
    // can't override the final method
    // void finalMethod() {

    // }
}
