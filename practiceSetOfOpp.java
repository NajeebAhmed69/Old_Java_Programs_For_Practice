
class cylinder{
private double Radius;
private double Height;
   public double getRadius(){
       return Radius;
   }
   public void setRadius(double Radius){
       this.Radius=Radius;
       }
public double getHeight(){
       return Height;
}
public void setHeight(double Height){
       this.Height=Height;
}
}
public class practiceSetOfOpp {
    public static void main(String[] args) {
        cylinder myClyinder = new cylinder();
             myClyinder.setHeight(19);
myClyinder.setRadius(47.4);
        System.out.println("the height of the cylinder is "+myClyinder.getHeight());
        System.out.println("the radius of the cylinder is "+myClyinder.getRadius());
    }
}
