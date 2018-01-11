/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class NegativeProcessor implements Chain
{
    private Chain nextInChain;
 
    public void setNext(Chain c)
    {
        nextInChain = c;
    }
 
    public void process(Number request)
    {
        if (request.getNumber() < 0)
        {
            System.out.println("NegativeProcessor : " + request.getNumber());
        }
        else
        {
            nextInChain.process(request);
        }
    }
}