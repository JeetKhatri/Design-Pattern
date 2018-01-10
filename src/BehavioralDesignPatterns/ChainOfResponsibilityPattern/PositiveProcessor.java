/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class PositiveProcessor implements Chain
{
    private Chain nextInChain;
 
    public void setNext(Chain c)
    {
        nextInChain = c;
    }
 
    public void process(Number request)
    {
        if (request.getNumber() > 0)
        {
            System.out.println("PositiveProcessor : " + request.getNumber());
        }
        else
        {
            nextInChain.process(request);
        }
    }
}