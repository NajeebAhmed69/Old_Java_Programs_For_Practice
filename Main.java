import jdk.dynalink.StandardNamespace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// by codewthharry practice set

        //problem4
       // System.out.println("Enter the value of kilometer you want to change in miles");
        //Scanner sc = new Scanner(System.in);
        //double value = sc.nextInt();
        //double miles = value * 0.621371;
        //System.out.println("The value of kilometer is "+miles+"after convert in miles");

        //operator and expression
        //int b = 4;
        //b+=2; here its sum 2 in b.
        //System.out.println(b);
        //incremet and decrement
        //int i= 3;
      //  System.out.println(i++);
        //System.out.println(i);
        //System.out.println(++i);
        //System.out.println(i);
        //practice set 2
       // float a = 7/4f*9/2f;
        //System.out.println(a);
        //System.out.println(7*49/7+35/7);
        // String
        //String name = new String("");
        //System.out.println(name);
        //Scanner sc = new Scanner(System.in);
       // String st =sc.nextLine();
       // System.out.println("Hello babe "+st);
        //string method
    //    String name = "";
//    for finding the length of value>>>>    int value =name.length();
  //      System.out.println(value);
     //   String name = "";
       // String lowerCase=name.toLowerCase();
       // System.out.println(lowerCase);
//String name = "";
       //its use for upper case function String upperCase= name.toUpperCase();
       // System.out.println(upperCase);

        //substring for use to print that word which we are want and until the word or sentence is end
      // String name ="ahmed";
        //System.out.println(name.substring(2));
       // System.out.println(name.substring(1,4));
       //use for replacing words System.out.println(name.replace('j','e'));
      //  System.out.println(name.charAt(5));
        //practice set of 3;
        //conditions in java;
       // int age =30;
//        if (age>18){
//            System.out.println("you can drive");
//        }else {
//            System.out.println("you cannot drive!");
//        }
        //switch
       // System.out.println("Enter the age ");
        //Scanner sc = new Scanner(System.in);
        //int age = sc.nextInt();
        //switch (age){
          //  case 18:
           //     System.out.println("you are adult");
             //   break;
            //case 25:
             //   System.out.println("you are young men don't give up!");
               // break;

            //case 60:
              //      System.out.println("you want to rest !");
                //    break;
           // default:
             //   System.out.println("fuck off baby!");
        //}

/* int b = 10;
do {
    System.out.println(b);
    b++;
}while (b<5); here we describe that the do while execute atleast one time then its check condition is true or not if
   condition is true then its executed if not its will terminate from the loop; */
  /*for (int i=1;i<=10;i++){
    System.out.println(i);>>>>>> its use when we know that what is ending digit
}*/
/* it is for odd number (2*n+1) and for even is (2*n)
  System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
for (int i=0;i<a;i++){
    System.out.println(2*i+1);
}*/
        //ch#5 pattern program
    // int n= 4;
      //  for (int i=n;i>0;i--){
            //for (int j=0;j<i;j++){
            //    System.out.print("* ");
          //  }
        //    System.out.print("\n");
      //  }
      /* multiplication table
       int n = 5;
        for (int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }*/
        //ARRAYS  of Java
      /*  int [] marks= new int[5];
        marks[0]= 13;
        marks[1]= 47;
        marks[2]= 69;
        marks[3]= 78;
        marks[4]= 89;
        System.out.println(marks[3]);
*/

   /*     System.out.println("the loop start from here!");
for (int i = 0; i<10;i++){
    System.out.print(i+" ");
    if (i%2==0) continue;
        System.out.println("");

}*/
for (int i=1;i>=10;i++){
    for (int j=i; j<i;j++ ){
        System.out.print(i);
    }
    System.out.print("");
}
    }
}