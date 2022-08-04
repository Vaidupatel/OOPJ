class Demo {
    void m1(Demo d) {
        System.out.println("I am in m1 method");
    }

    void m2() {
        m1(this);
    }

    public static void main(String args[]) {
        Demo td = new Demo();
        td.m2();

    }

}
