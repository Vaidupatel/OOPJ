class thisdemo
{
void display()
{
	System.out.println("hello bro!!");
}
void show()
{
	this.display();// display();   // both are same
}
public static void main(String args[])
{
	thisdemo td=new thisdemo();
	td.show();
}
}
