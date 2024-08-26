package Day13.Practice;

public class Worker extends Person{

	public Worker(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Worker ["+ this.getName() + "]";
	}

	
	

}
