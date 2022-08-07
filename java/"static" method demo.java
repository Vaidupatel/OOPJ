/* program of static method */
class demo {
    void display() {
        System.out.println("Without static method");

    }

    static void print() {
        System.out.println("With static method");

    }

    public static void main(String args[]) {
        demo d = new demo();    //we have to create object becaus ewe calling the non-static method
        d.display();
        demo.print();           //print();   /*both are same */
        xyz.put();              // heare we can't write put(); because it's outer class method 
    }
}
class xyz {

    static void put() {
        System.out.println("outer class method with static");

    }

}


/*Static method can only access static data, can't access non-static data i.e, instance data*/
class thisdemo
{
    int i=10;
    static void display()               // We have to creat static data to access i static methods, heare static int i=10;
    {
        System.out.println(i);          //it gives an error
    }
    
}



/*A static method can call only other static method, can't calll a non-static method*/
class thisdemo {
    static int i = 10;

    static void display() {
        show();                                               // it gives an erro              
        System.out.println("static method");
    }

    void show() {
        System.out.println("no-method");

    }

}


/*A static method can't be refer to "this" or "super" keyword in memory in anyway*/
class demo {
    int i = 10;

    static void display() {
        System.out.println(i);

    }
}

class test extends demo {
    void print() {
        super.display();
        System.out.println(super.i);

    }

    public static void main(String[] args) {
        test t = new test();
        t.print();

    }
}

