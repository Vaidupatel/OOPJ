/*Ststic block executes automatically*/
class demo {

    public static void main(String[] args) {
        System.out.println("i am in main method");

    }

    static {
        System.out.println("hello world!");
    }
    static {
        System.out.println("2nd static block");
    }
}


/*Static block executes automatically when class loaded in the memory.
Static block execute first and than main method however the main method written first or after the main method.
We can create multiple static block, at that time order of static block is top to bottom and than main method will be execute. 
*/
