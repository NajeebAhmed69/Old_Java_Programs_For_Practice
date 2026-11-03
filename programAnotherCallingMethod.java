import java.util.Scanner;

public class programAnotherCallingMethod {
    int Sum(int x, int y){

        return  x+y;
    }
    public static void main(String[] args){
int a = 10;
int b = 15;

        programAnotherCallingMethod obj = new programAnotherCallingMethod();
int c= obj.Sum(a,b);
        System.out.println(c);

    }
}
