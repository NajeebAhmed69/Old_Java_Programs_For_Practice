public class method_overloading_program {
/* method overloading is the process in which name of the class is same  its work but in the parameters the value or reffrence
 change */
static void lol(){
    System.out.println("hello bharwo!");
}

    static void lol(int a){
        System.out.println("hello bharwo "+a);
    }
    static int lol(int a,int b){
        System.out.println("the value of a is"+a+"and b is"+b);
        return 0;
    }
    public static void main(String[]args){
    lol();
    lol(400);
    lol(10,2);
    }
}