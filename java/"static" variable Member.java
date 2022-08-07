// class Member {
//     int Mid;
//     String name;
//     String company;

//     Member(int Mid, String name, String company) {
//         this.Mid = Mid;
//         this.name = name;
//         this.company = company;
//     }

//     void display() {
//         System.out.println(Mid + "  " + name + " " + company);
//     }

//     public static void main(String args[]) {
//         Member m1 = new Member(101, "vaidik", "Oxyguard");
//         m1.display();
//         Member m2 = new Member(102, "jay", "Oxyguard");
//         m2.display();
//         /*
//          * Ther is thousand of member in same company
//          * for them we have to print same company name
//          * thaer for thousand of memory allocation for
//          * same variable and name.
//          * To avoid large scale of memory allocation
//          * we have tocreat static variable wich is allocated
//          * in memory ones and shared among all object at claa level
//          */
//         Member mn = new Member(103, "nikhil", "Oxyguard");
//         mn.display();
//     }
// }


/*Program after creat static variable*/

class Member {
    int Mid;
    String name;
    static String company = "Oxyguard";

    Member(int Mid, String name) {
        this.Mid = Mid;
        this.name = name;

    }

    void display() {
        System.out.println(Mid + "  " + name + " " + company);
    }

    public static void main(String args[]) {
        Member m1 = new Member(101, "vaidik");
        m1.display();
        Member m2 = new Member(102, "jay");
        m2.display();
        /*
         Heare we created company name as a static variable,
         that will shared among all object at class level.
         and because of it no need to create more object for company. 
         */
        Member mn = new Member(103, "nikhil");
        mn.display();
    }
}
