/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package CreationalDesignPatterns.BuilderDesignPattern;

public class BuilderMain {

	public static void main(String args[]) {
		
		//creating object of the cdBuilder and cdType
		CDBuilder cdBuilder = new CDBuilder();
		CDType cdsSony = new CDType();
		CDType cdsSamsung = new CDType();
		
		// Call for building cd
		CDType cdType1 = cdBuilder.buildSonyCD(cdsSony);
		CDType cdType2 = cdBuilder.buildSonyCD(cdsSony);
		CDType cdType3 = cdBuilder.buildSamsungCD(cdsSamsung);
		
		cdType1.showItems();
		cdType3.showItems();
	}

}
