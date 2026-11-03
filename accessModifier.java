class MyEmployee{
    private int Id ;
   private String name;
   /*public MyEmployee(){
       Id = 45;
       name= "your_name_here";
   }*/
   public MyEmployee(String myName,int myId  ) {
       name = myName;
       Id = myId;
   }
public void setName(String n){
    name=n;
}
public String getName(){
    return name;
}
public void setId(int i){
Id = i;
}
public int getId(){
    return Id;
}
}
public class accessModifier {
    public static void main(String[] args) {
       MyEmployee najeeb = new MyEmployee("Najeeb Ahmed",166);
        /* we set parameters becoz we want to set constructor in parameter  */
       // najeeb.id =45;>>>>this get error bcoz the private access modifier
       //najeeb.name="Najeeb Ahmed";>>>>this get error bcoz the private access modifier
       /* if we dont write and set the id and name with steId or setName then its automatically default setting
       * because we declare the method with the same name of class that why its invoke automatically  */
       //najeeb.setId(166);
       //najeeb.setName("Najeeb Ahmed");
       System.out.println("My ID number is "+najeeb.getId());
       System.out.println("MY name is "+najeeb.getName());
    }
}
 