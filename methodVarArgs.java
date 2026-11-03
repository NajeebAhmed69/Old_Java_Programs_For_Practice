public class methodVarArgs {

    /* if u wnt to add two number then its function used;
     static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[]args) {
        System.out.println("welcome to the Varargs Program!");
        System.out.println("the sum of 5 and 6 is "+sum(5,6));
    }*/
    // but when we want to pass alots of arguement then we use varargs emaple of varargs is ;
    static int sum(int... arr) {
//Availabe as int []arr its type of array which store alot of number and perform what u want to perfrom ;
        int result = 0;
        for (int a : arr) {
            result +=a;
        }
return result;
    }
    public static void main(String[]args){
        System.out.println("sum of nothing is " +sum());
        System.out.println("the sum of 5 and 6 is "+sum(5,6));
        System.out.println("the sum of 10 and 26 is "+sum(10,26));
        System.out.println("the sum of 68 and 1 is "+sum(68,1));
    }
}