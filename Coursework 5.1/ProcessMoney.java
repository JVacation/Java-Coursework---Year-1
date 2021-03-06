/**
 * Deal with processing money entered by a customer
 * to purchase tickets.
 */
public class ProcessMoney
{
  // Instance variables to hold the state of
  //   the ticket machine
  private int theTicketPrice = 0;         // Ticket price
  private int theCredit = 0;              // Money from customer
  private int theMoneyInTheMachine = 0;
  private int pence = 0;
      int tenCount = 0;
      int twentyCount = 0;
      int fiftyCount = 0;
      int hundredCount = 0;
      int twoHundredCount = 0;
      int calc = 0;
      
  private boolean enough = false;// All the money
  
  /**
   * Set the price for the current ticket
   * @param amount Cost of ticket in pence 
   */
  public void setTicketPrice( int amount )
  {
    // Fill in code for the method
    theTicketPrice = amount;
  }

  /**
   * Return the price in pence of the current ticket
   * @return  Cost of ticket in pence
   */
  public int getTicketPrice()
  {
    // Fill in code for the method
    return theTicketPrice;
  }

  /**
   * Add a coin with value 'coin' in pence 
   *  to the ticket machine to 'partial' pay for the ticket.
   * @param coin The coin to add to the ticket machine
   */
  public void add( int coin )
  {
    // Fill in code for the method
    theCredit = theCredit + coin;
     if ( coin == 10){
          tenCount = tenCount + 1;
        } else if ( coin == 20){
          twentyCount = twentyCount + 1;
        } else if ( coin == 50){
          fiftyCount = fiftyCount + 1;
        } else if ( coin == 100){
          hundredCount = hundredCount + 1;
        } else if ( coin == 200){
          twoHundredCount = twoHundredCount + 1;
        }
            
  } 

  /**
   * Return true if sufficent money has been entered to buy
   * the ticket else return false
   * @return true if sufficient money else false
   */
  public boolean enough()
  {
    // Fill in code for the method
    
    if (theCredit < theTicketPrice){
         enough = false;
    } else {
        enough = true;
    }
    return enough;

  }
  
  /**
   * Cancel the purchase of the ticket.
   * 'Coins' are returned to the customer.
   * The amount credited so far is set to zero.
   */
  public void cancel()
  {
      theCredit  = 0;
      tenCount = 0;
      twentyCount = 0;
      fiftyCount = 0;
      hundredCount = 0;
      twoHundredCount = 0;
  }
  
  /**
   * Return the value in pence paid so far into the machine
   *  for a ticket
   * @return  In pence the amount paid so far
   */
  public int getPaidSoFar()
  {
      return theCredit;
      // Fill in code for the method
  }

  /**
   * The ticket has been bought, and money
   * entered by the user is added to the total
   * money in the machine
   */
  public void bought()
  {
    // Fill in code for the method
    theMoneyInTheMachine = theMoneyInTheMachine + theCredit;
    theCredit = 0;
  }

  /**
   * Deliver in pence the total amount of money in the machine
   *  that has been used to purchase tickets.
   * @return The total money in the machine in pence.
   */
  public int moneyInMachine()
  {
    // Fill in code for the method
    return theMoneyInTheMachine;
  }

  // This method is not required for 5.1
  // However for exercise 5.2 it is required
  /**
   * Deliver how many 'coins' are in the machine.
   * Thus if there were 63 10p coins
   *  getNumCoins( 10 ) would return 63.
   * @param  coin The coin selected
   * @return Total number of 'coin'p coins in the machine.
   */
  public int getNumCoins( int coin )
  {
      if ( coin == 10){
          calc = tenCount;
        } else if ( coin == 20){
            calc = twentyCount;
        } else if ( coin == 50){
            calc = fiftyCount;
        } else if ( coin == 100){
            calc = hundredCount;
        } else if ( coin == 200){
            calc = twoHundredCount;
        }
      
      
            
      
      return calc;
  }
}
