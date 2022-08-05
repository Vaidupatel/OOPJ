/* initialization by Reference variable */
class vaid {
    int age;
    String surname;

    public static void main(String args[]) {
        vaid v = new vaid();
        v.surname = "Ghelani";                    //Initialization by reference variable
        v.age = 19;                               //Initialization by reference variable
        System.out.println(v.surname + "  " + v.age);

    }
}

/*Initialization by Method */
class vaid {
    int age;
    String surname;

    void obj(String s, int a) {
        surname = s;
        age = a;

    }

    void display() {
        System.out.println(surname + "  " + age);
    }

    public static void main(String args[]) {
        vaid v = new vaid();
        v.obj("Ghelani", 19);               //Initialization  by method
        v.display();

    }
  
  
}
/*Initialization by Constructor*/
class vaid {
    int age;
    String surname;

    vaid(String surname, int age) {
        this.surname = surname;
        this.age = age;

    }

    public static void main(String args[]) {
        vaid v = new vaid("Ghelani", 19);                     //Initialization by Constructor

        System.out.println(v.surname + "   " + v.age);

    }
}
