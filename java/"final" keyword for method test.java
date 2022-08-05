class test {
    final void m1() {                                   //Compiler givs an error becayse "final" method can't be overridden  
        System.out.println("I am in class A");
    }
}

class demo extends test {
    void m1() {
        super.m1();                                     //For calling parent class method
        System.out.println("I am in class B");          

    }

    public static void main(String args[]) {
        demo o = new demo();
        o.m1();
    }

}
