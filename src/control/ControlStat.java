package control;

public class ControlStat {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int i = 10, j = 3, k = 8;
		int c = 30, d = 50;
		if (i == 10) {
			if (j < 20)
				a = b;
			if (k > 100)
				c = d; // this if is
			else
				a = c; // associated with this else
		} else {
			a = d; // this else refers to if(i == 10)
		}

	}
}
