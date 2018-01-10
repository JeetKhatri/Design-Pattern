/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;
	/***
	 * This constructor used for listing all the banned sites.
	 */
	ProxyInternet() {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	/***
	 * Check the site if it is banned site or not if it is a banned site then it throws exception otherwise grant it
	 * @return 
	 */
	@Override
	public String connectTo(String site) {
		if (bannedSites.contains(site.toLowerCase())) {
			return "Access Denied : "+site;
		}
		return internet.connectTo(site);
	}

}