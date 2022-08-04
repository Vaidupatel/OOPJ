class Demo {
    Demo() {
        System.out.println("no arguments constructor");
    }

    Demo(int a) {
        this();
        System.out.println("parametrized constructor");

    }

    public static void main(String args[]) {
        Demo td = new Demo(10);

    }
 
}


/////OR/////
class Demo {
    Demo() {
        this();
        System.out.println("no arguments constructor");
    }

    Demo(int a) {
        System.out.println("parametrized constructor");

    }

    public static void main(String args[]) {
        Demo td = new Demo();

    }
 
}
