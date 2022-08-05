class A {
    A() {
        System.out.println(" I am in class A");
    }

}

class B extends A {
    B() {
      super();                                    // to call parent class constructor, if we don't write "super();" than compiler assume that there is "super();" keyword.
        System.out.println(" I am in class B");   
    }

    public static void main(String args[]) {
        B o = new B();
    }

}
