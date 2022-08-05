class A {

    void m1() {
        System.out.println("I am in class A");
    }
}

class B extends A {

    void m1() {
        System.out.println("I am in class B");
    }

    void show() {
        m1();               //call the current class m1() method.
        super.m1();         //call the parent class m1() method, besause of "super" keywors.

    }

    public static void main(String args[]) {
        B o = new B();
        o.show();
    }
}
