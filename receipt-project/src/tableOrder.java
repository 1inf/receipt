
public class tableOrder {

	public static int getTableNumber() {
		//test
		String tableNumber;
		tableNumber=Utilities.getUserIntorSpecificInput(MSG_TABLE_NUMBER, Q, 1, MAX_TABLE_NUMBER);
		if(tableNumber.equalsIgnoreCase(Q)) {
			System.exit(0);
		}
		return Integer.parseInt(tableNumber);
	}
}
