import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;

/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

public class AbstractPatternMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.println("Select bank :-\n1. SBI\n2. ICICI\n3. HDFC\nEnter your choice : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch = Integer.parseInt(br.readLine());
		AbstractPatternAbstractFactory factoryBank = AbstractPatternFactoryCreator.getFactory("bank");
		AbstractPatternBank b = null;
		switch (ch) {
		case 1:
			b = factoryBank.getBank("sbi");
			break;
		case 2:
			b = factoryBank.getBank("icici");
			break;
		case 3:
			b = factoryBank.getBank("hdfc");
			break;
		default:
			System.out.println("Invalid Selection");
			System.exit(0);
			break;
		}
		System.out.println("\nSelect Loan type :-\n1. Education\n2. Home\n3. Business\nEnter your choice : ");
		ch = Integer.parseInt(br.readLine());
		AbstractPatternAbstractFactory factoryLoan = AbstractPatternFactoryCreator.getFactory("loan");
		AbstractPatternLoan l = null;
		switch (ch) {
		case 1:
			l = factoryLoan.getLoan("education");
			break;
		case 2:
			l = factoryLoan.getLoan("home");
			break;
		case 3:
			l = factoryLoan.getLoan("business");
			break;
		default:
			System.out.println("Invalid Selection");
			System.exit(0);
			break;
		}
		System.out.println("\nEnter Loan Amount : ");
		Double amount = Double.parseDouble(br.readLine());
		System.out.println("Enter Loan Year : ");
		Double year = Double.parseDouble(br.readLine());
		double inter = Math.round(l.calculateLoanInterest(amount, year));
		System.out.println("\nBank name : "+b.getBankName()+"\nLoan type : "+l.getLoanType());
		System.out.println("Amount : "+amount+" Rs.\nNo of Year : "+year+"\nInterest rate : "+l.getInterestRate()+"%");
		System.out.println("Interest : "+inter+" Rs.");
		System.out.println("Total Amount : "+(inter+amount)+" Rs.");
	}
}
