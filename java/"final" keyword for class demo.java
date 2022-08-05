final class test {                                    //It's give compile time error because final class can't beextends.
    void m1() {
        System.out.println("I am in class A");
    }
}

class demo extends test                               //For inharite test class
{  
    void m1() {
        super.m1();                                   //For calling parent class m1() method.
        System.out.println("I am in class B");
    }

    public static void main(String args[]) {
        demo o = new demo();
        o.m1();

    }

}
