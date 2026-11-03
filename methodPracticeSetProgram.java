import java.util.Scanner;
public class methodPracticeSetProgram {
//multiplication table problem 1;
  /*  static void multiplicationTable(int n) {
        for (int i = 1; i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplicationTable(7);
    }*/
    /* problem 2 pattern 1 explanation is ; when i = 0 then * will be zero but in second loop we add i+1 its
     means that when its zero then it add 1 and answer  is one and as well as below function were worked in loop */
   /*  static void pattern1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
    }}*/
/*pattern 2 problem
static void pattern2(int n){
    for(int i =n;i>=1;i--){
        for (int j = 1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        pattern2(4);
    }*/
    /*>>>>>> this is conversion of c into f;
    static double conversion(double n){
        double result= (n* 9/5) +32;
        return result;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celcius degree");
        double  n=sc.nextDouble();
        double result=(n* 9/5) +32;
        System.out.println("After the conversion of Celcius in Fahrenheit is "+result);

    }*/


}