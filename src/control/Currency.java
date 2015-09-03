package control;

public enum Currency {
	
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private int value;

	private Currency(int value) {
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void printEnums(){
		for(Currency curren: values()){
			System.out.println(curren);
		}
	}

}
