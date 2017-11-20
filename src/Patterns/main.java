package Patterns;

public class main {
   public static void main(String[] args){
       CarFactory c =  CarFactory.getFactory("JP");
       c.createCar().drive(10,134);

   }
}
