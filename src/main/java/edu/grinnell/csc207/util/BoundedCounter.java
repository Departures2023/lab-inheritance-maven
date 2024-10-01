package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter{
  int bound;

  public BoundedCounter (int start, int bound) {
    super(start);
    this.bound = bound;
  }

  @Override
  public void increment() throws Exception{
    if (super.count > this.bound) {
      throw new Exception();
    }
    super.count++;
  }
}
