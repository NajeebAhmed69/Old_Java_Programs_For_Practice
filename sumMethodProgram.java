import java.util.Scanner;
public class sumMethodProgram {
    public static int sum(int x,int y) {
        int add = x + y;
        return add;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number!");
    int a = sc.nextInt();
        System.out.println("enter the second number!");
    int b = sc.nextInt();
    int c=sum(a,b);
        System.out.println("final answer is:"+c);
    }
}
