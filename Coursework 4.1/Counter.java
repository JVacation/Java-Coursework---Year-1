public class Counter
{
  // Declaration of a long instance variable to hold
  //  the value of the counter
  // You need to declare this instance variable here.
  //  What should it initial value be.
  private long value = 0;

  /**
   * Return the current value of the counter
   * @return The value of the counter
   */
  public long getValue()
  {
    // Fill in code for the method
    return value;
  }

  /**
   * Reset the counter to zero
   */
  public void reset()
  {
    value = 0;
  }

  /**
   * Add 1 to the counter
   */
  public void inc()
  {
    // Fill in code for the method
    value = value + 1;
  }

  /**
   * Subtract 1 from the counter
   */
  public void dec()
  {
    // Fill in code for the method
    value = value - 1;
  }

  /**
   * Add 5 to the counter
   */
  public void add5()
  {
    // Fill in code for the method
    value = value + 5;
  }

  /**
   * Add 10 to the counter
   */
  public void add10()
  {
    // Fill in code for the method
    value = value + 10;
  }

}

