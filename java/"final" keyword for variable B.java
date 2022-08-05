/* This program gives an error, besause of final keyword. 
    if we creat any final varibale, than we can't over write
    that variable. it's use for any consttant value like g=9.8 ,pi=3.14
    */
class B {

    public static void main(String args[]) {
        final int i = 10;
        i = i + 60;
        System.out.println(i);

    }
}
