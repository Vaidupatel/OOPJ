/* program of static method */
class demo {
    void display() {
        System.out.println("Without static method");

    }

    static void print() {
        System.out.println("With static method");

    }

    public static void main(String args[]) {
        demo d = new demo();
        d.display();
        demo.print();
    }
}
