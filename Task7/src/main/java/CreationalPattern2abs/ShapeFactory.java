package CreationalPattern2abs;

public class ShapeFactory extends AbstractFactoryPattern {

	public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	          return new Rectangle();         
	       }else if(shapeType.equalsIgnoreCase("SQUARE")){
	          return new Square();
	       }	 
	       return null;
	    }

}
