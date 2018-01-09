/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package CreationalDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<Packing>();

	/***
	 * It will add new item
	 */
	public void addItem(Packing packs) {
		items.add(packs);
	}

	/***
	 * This method is used for displaying items
	 */
	public void showItems() {
		System.out.println("Item size : "+items.size());
		for (Packing packing : items) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}