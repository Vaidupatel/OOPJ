class test
{
int i;
void setValue(int x)
{
i=x;

}

void show()
{
	System.out.println(i);
}
}
class xyz
{
public static void main(String args[])
{
	test t=new test();
	t.setValue(10);
	t.show();

}


}
