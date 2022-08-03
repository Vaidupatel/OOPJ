/* code with out "this" key-word */ 
class test
{
int i;
void setValue(int i)
{
i=i;								/* with out "this" key-word, because of two "i" variable, 
								one is globle and one is local, 								
								compiler give the default value of variable . 								
								for int default value is 0. */   
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


/* program with "this" key-word */
class test
{
int i;
void setValue(int i)
{
this.i=i;

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
