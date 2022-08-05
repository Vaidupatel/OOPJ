class animal {
    public void eat()                                     // method
    {
        System.out.println("I am eating");

    }

    public static void main(String[] args) {
        System.out.println("I am main method");
        animal a = new animal();                        // constrctor, "o" is object.
        a.eat();                                        // calling the eat method.

    }
}
