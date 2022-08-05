class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show(int a) {
        System.out.println(a);            //print the value of a, wich is given by argument in method call.
        System.out.println(this.a);       //print the value of a, wich is in current class because of "this" keyword it's refer to the current class instance variable.
        System.out.println(super.a);      //print the value of a, wich is in parent class because of "super" keyword it's refer to the parent class instance variable. 
    }

    public static void main(String args[]) {
        B o = new B();
        o.show(50);                       //we give hear argument, because we call that method wich have argument.
    }
}
