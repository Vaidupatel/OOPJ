class Test {
    Test(Demo d) {
        System.out.println("test class constructor");
    }

}

class Demo {
    void m1() {
        Test t = new Test(this);
    }

    public static void main(String[] args) {
        Demo t = new Demo();
        t.m1();
    }

}
