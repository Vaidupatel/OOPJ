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
    static void display()
    {
        System.out.println(i);          //it gives an error
    }
    
}
