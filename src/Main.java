import java.util.Scanner;  // Import the Scanner class

/**
 * @author Admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tính Tiền Điện");
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Nhập tiền điện tháng");
			String userName = myObj.nextLine();
			System.out.println("Tiền điện: " + userName);  // Output user input
		}
	}
}
