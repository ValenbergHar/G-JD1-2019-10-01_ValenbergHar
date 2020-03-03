package javarush;

//1.проинициализируютс€ статические переменные класса Car
//2.ѕосле инициализации статических переменных класса-предка 
//инициализируютс€ статические переменные класса-потомка.
//3.“ретьими по счету будут инициализированы нестатические переменные класса-предка.
//4.Ќаконец, дело дошло до конструкторов! “очнее, до конструктора базового класса. 
//Ќачало его работы Ч четвертый пункт в процессе создани€ объекта.
//5.инициализации нестатических полей класса-потомка,



//1 - статик родител€
//2 - статик ребенка 
//3 - не статик родител€
//4 - конструктор родител€
//5 - не статик ребенка
//6 - конструктор ребенка


import java.io.IOException;

public class ConstructorsClildRel {
	public static class Car {

		   public static int carCounter = 10;

		   private String description = "Ќачальное значение пол€ description";

		   public Car() {
		       System.out.println(carCounter);
		       
		       System.out.println(description);
		       description = "јбстрактна€ машина";
		       System.out.println(description);
		       
		       System.out.println("ѕривет из конструктора Car!");
		   }

		   public String getDescription() {
		       return description;
		   }
		}

		public static class Truck extends Car {

		   private static int truckCount = 10000;
		   static {System.out.println(carCounter);}

		   private int yearOfManufacture;
		   private String model;
		   private int maxSpeed = 150;

		   public Truck(int yearOfManufacture, String model, int maxSpeed) {
			   //System.out.println(carCounter);
			   System.out.println("ѕривет из конструктора Truck!");
			   System.out.println("»значальное значение maxSpeed = " + this.maxSpeed);
			   
		       this.yearOfManufacture = yearOfManufacture;
		       this.model = model;
		       this.maxSpeed = maxSpeed;

		       Car.carCounter++;
		       truckCount++;
		   }
		}

   public static void main(String[] args) throws IOException {

       Truck truck = new Truck(2017, "Scania S 500 4x2", 220);
   }
}