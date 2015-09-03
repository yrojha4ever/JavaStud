package control;

public class CurrencyEnumTest {
	public static void main(String[] args) {
		
		Currency currency = Currency.DIME;
		
		System.out.println( currency ==  Currency.PENNY );
		
		int dimeValue = Currency.DIME.getValue();
		System.out.println("Dime Value: "+ dimeValue);
		
		System.out.println(dimeValue);
		
		
	}
}
