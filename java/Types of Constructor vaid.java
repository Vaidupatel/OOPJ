/*Default Constructor*/
class vaid 
{
    int i;                                                          /*>No-argument constructor
                                                                    >Created by Compiler, not created by JVM.
                                                                    >if we create any one Constructor in program than compiler not create any constructor.
                                                                    > If we not create any  Constructor, than compiler create Default Constructor name Test() in the only one line super();
                                                                     */
    String s;

    vaid()       //<-- it's a Default Constructor
    {
        super();
    }

    public static void main(String[] args) {
        vaid v = new vaid();
        System.out.println(v.i + " " + v.s);
    }
}

/* No-argument Constructor*/
/*
  >user define Constructor
  >Created by user without argument
*/

class vaid 
{
    int i;
    String s;

    vaid()               // Heare is no argument in Comstructor, thus it's called as No-argument Constructor 
    {
        System.out.println("No argument Constructor");
    }

    public static void main(String[] args) {
        vaid v = new vaid();

    }
}

/*Parametrized Constructor*/
/*
>Created by user
>user have to give parameter.
*/
class vaid 
{

    vaid(String name)                  //Heare is parameter passed in COnstructor, thus it's called as Parametrized Constructor
    {
        System.out.println("Parametrized Constructor");
    }

    public static void main(String[] args) {
        vaid v = new vaid("vaidik");        

    }
}
