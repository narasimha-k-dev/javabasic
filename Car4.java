package java_classobjectprograms_te;

public class Car4 {
	int year;
    String make,model,color;
    void assign(String make,String model,String color,int year) {
    	this.make=make;
    	this.model=model;
    	this.color=color;
    	this.year=year;
    }
    void display() {
    	System.out.println("car make is "+make);
    	
    	System.out.println("car model is "+model);

    	System.out.println("car color is "+color);

    	System.out.println("car year is "+year);
    	System.out.println();

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 c1=new Car4();
		Car4 c2=new Car4();
		
		c1.assign("maruthi", "24f", "black", 2024);
		
		c2.assign("kia", "23cc", "red", 2023);
          
		c1.display();
		c2.display();
	}

}
