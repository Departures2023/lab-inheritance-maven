package edu.grinnell.csc207.util;

public class BasicCounter implements Counter{
  int count;
  int start;

  public BasicCounter(int i) {
    this.count = i;
    this.start = i;
  }

  public void increment() {
    this.count++;
  }

  public void reset() {
    this.count = this.start;
  }

  public String toString() {
    return "[" + this.count + "]";
  }

  public int get() {
    return this.count;
  }
}
