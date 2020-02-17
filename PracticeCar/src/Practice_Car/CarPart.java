package Practice_Car;

public abstract class CarPart implements Functional{
	//Fields
	
	protected int condition;
	protected String partName;
	
	//Constructors 

	public CarPart(String name, int currentCondition) {
		partName = name;
		condition = currentCondition;
	}
	
	//Getters
	
	public String getPartName() {
		return partName;}
	
	public float getCondition() {
		return condition;}
	
	//Setters
	
	public void setCondition(int updatedCondition) {
		condition = updatedCondition;
		if (condition < 0) {
			System.out.println("This " + partName + " is broken!");
		}else if (condition > 100) {
			System.out.println("This " + partName + " is in excellent condition!");
		}
	}
	
	public void replacementPart() {
		//where we'll add our subclass parts
	}
	
	public void status(String dashBoardMessage) {
		System.out.println("Here is your " + partName + " : " );
		System.out.println(dashBoardMessage);
	}
	
	public void function() {
		
	}

}
