/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.ProxyDesignPattern;

public class RealInternet implements Internet
{
    @Override
    public String connectTo(String serverhost)
    {
        return "Access Granted :  "+ serverhost;
    }
}
