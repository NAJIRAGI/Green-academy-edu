package packages;

public class singleton {
	
	private singleton() {}
	
    private static singleton s = new singleton();
    
    public static singleton getInstance() {
    	return s;
    }
    
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
