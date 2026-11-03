import java.util.Scanner;
// class Employee{
//     int id;
//     String name;
// }
// public class customClass {
//     public static void main(String[] args) {
//         System.out.println("this is our custom class");
//         Employee najeeb= new Employee();
//         najeeb.id=18;
//         najeeb.name="najeeb ahmed";
//         System.out.println(najeeb.id);
//         System.out.println(najeeb.name);
//     }
// }


/*class employee{
    int id  ;
    String name;
    int salary;
    public void printDetail(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My salary is "+salary);
    }
}
public class customClass {
    public static void main(String[] args) {
        employee najeeb = new employee();
        employee sajjad=new employee();
        najeeb.id=14;
        najeeb.name="Najeeb Ahmed";
        najeeb.salary=30000;
        sajjad.id=18;
        sajjad.name="Sajjad Gandu";
        sajjad.salary=32000;
        najeeb.printDetail();
        sajjad.printDetail();
    }
}*/
//practice set 8
/*class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class customClass {
    public static void main(String[] args) {
        Employee najeeb = new Employee();
        najeeb.salary=10000;
        najeeb.setName("Najeeb Ahmed");
        System.out.println("My salary is "+najeeb.getSalary());
        System.out.println(najeeb.getName());

    }
}*/
 /*class cellPhone{
   public void ring(){
       System.out.println("The phone is ringing...");
   }
   public void vibrat(){
       System.out.println(" The phone is Vibrating...");
   }
}
public class customClass {
    public static void main(String[] args) {
        cellPhone infinix = new cellPhone();
        infinix.ring();
        infinix.vibrat();
    }
}*/
/*class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
public class customClass {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side=2;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
    }
}*/
class rectangular{
    double width;
    double length;
    public double recArea(){
        return length*width;
    }
    public double parameter(){
        return 2*(length+width);
    }
}
public class customClass {
    public static void main(String[] args) {
rectangular rect = new rectangular();
rect.length=2.5;
rect.width=2.1;
        System.out.println("the area of rectangle is " +rect.recArea());
        System.out.println("the parameter is "+rect.parameter());
    }
}