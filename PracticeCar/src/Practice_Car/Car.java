package Practice_Car;

import java.util.ArrayList;
import java.util.Iterator;

public class Car{
	private ArrayList<CarPart> parts = new ArrayList<>();
	
	//Constructor
	
	public Car() {
		parts.add(new FuelLevel(14.2f));
		parts.add(new TirePressure(32));
	}
	
	//Getters
	
	public String getParts() {
		return toString(this.parts);
	}
	
	public String toString(ArrayList<CarPart> partsList) {
		String result = "";
		for (Iterator<CarPart> iter = partsList.iterator(); iter.hasNext();) {
				result += ((CarPart) iter.next()).partName + "\n";
		}
		return result;
	}
	
	public void status() {
		for (Iterator<CarPart> iter = parts.iterator(); iter.hasNext();) {
			iter.next().status(null);
		}
	}

	public void run() {		
		for (int i=0; i < parts.size(); i++) {
			parts.get(i).function();
		}
	}
}
