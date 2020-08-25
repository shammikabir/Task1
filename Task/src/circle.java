
public class circle {
	
	
	   private double Radius;
       private String color;
	 
	   public circle() { 
	      Radius = 1.4;
	      color="Red";
	   }
	   public void setColor() {
	       
	    }
	   public String getColor(){
	       return color;
	    }
	   
	   
	   public circle(double T,String color) {  
	      Radius = T;
	      this.color=color;
	      
	   }

	   
	   
	   public double getRadius() {
	     return Radius; 
	   }
	   
	   
	   
	   public double getArea() {
	      return Radius*Radius*3.1416;
	   }
	}


