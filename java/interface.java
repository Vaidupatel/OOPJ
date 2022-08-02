interface I1
{
    public static final int a=10; //all variables are must be public static final
    public void show();
    default void display()   
    {
        System.out.println("hiii ");
  
    }
                                               //we can only make default types method and static types methods                 
    static void put()
    {
        System.out.println("hello");

    }
}

class test implements I1
{

public void show()
{
System.out.println("hiii vaidu");

}

public static void main(String args[])
{
test t=new test();
t.show();
t.display();



}
}
