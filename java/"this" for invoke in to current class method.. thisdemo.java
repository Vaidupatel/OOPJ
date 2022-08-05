class thisdemo
{
void display()
{
	System.out.println("hello bro!!");
}
void show()
{
	this.display();// display();   // it's print "hello bro!!" because of "this" keyword, if we don't write this keyword than compiler assume that it self that ther is elrady this keyword.
}
public static void main(String args[])
{
	thisdemo td=new thisdemo();
	td.show();
}
}
