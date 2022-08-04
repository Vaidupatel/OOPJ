class demo {
    demo d1(String s) {
        System.out.println("hii");
        return this;
    }

    public static void main(String args[]) {
        demo d = new demo();
        d.d1("a");
    }
}
