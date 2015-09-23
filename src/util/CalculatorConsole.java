package util;

import java.util.Scanner;

/**
 * Sample Calculator without precedence check.
 * 
 * @author ojhay
 * 
 */
public class CalculatorConsole {
	public static void main( String[] args ) {

		Scanner sc = new Scanner( System.in );

		System.out.println( "Calculator:" );
		while ( true ) {

			System.out.print( "Type arithmetic Expression: " );
			String expression = sc.nextLine( );

			// Exit if user input: exit
			if ( expression.equalsIgnoreCase( "exit" ) ) {
				break;
			}

			double result = expre( expression );
			System.out.println( expression + "= " + result );

		}
		sc.close( );
	}

	// Recursive method to evaluate arithmetic expression.
	public static double expre( String expre ) {

		if ( ! ( expre.contains( "+" ) || expre.contains( "-" ) || expre.contains( "*" ) || expre.contains( "/" ) ) ) {
			return Integer.valueOf( expre );
		}

		double result = 0;
		for ( int i = 0; i < expre.length( ); i++ ) {

			char symbol = expre.charAt( i );
			if ( !Character.isDigit( symbol ) ) { // Symbol

				double operand1 = Integer.parseInt( expre.substring( 0, i ) );

				switch ( symbol ) {
				case '+':
					result = operand1 + expre( expre.substring( i + 1 ) );
					break;
				case '-':
					result = operand1 - expre( expre.substring( i + 1 ) );
					break;
				case '*':
					result = operand1 * expre( expre.substring( i + 1 ) );
					break;
				case '/':
					result = operand1 / expre( expre.substring( i + 1 ) );
					break;
				}

				break;
			}
		}
		return result;
	}

}
