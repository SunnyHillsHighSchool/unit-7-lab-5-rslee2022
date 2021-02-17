//Copy and paste the code from Number.java - Lab 4

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee

//header for Number class
public class Number
{

  //private instance variable (must be an Integer)
  private Integer num;

  //constructors
  public Number()
  {
    num = 0;
  }

  public Number(int n)
  {
    num = n;
  }

  //getter method
  public Integer getNum()
  {
    return num;
  }

  //setter method
  public void setNum(Integer a)
  {
    num = a;
  }
  
  //isOdd method
  public boolean isOdd()
  {
    //if the remainder of num divided by 2 equals 1 (using modulus: %)
    if(num % 2 == 1)
    {
      //return true
      return true;
    }
    //otherwise, return false
    return false;
  }

  //isPerfect method
  public boolean isPerfect()
  {
    //create integer sum, set to 0
    int sum = 0;
    //For loop: initialize loop control variable integer i to 1, condition - i is less than num, i increments by 1 each iteration
    for(int i = 1; i < num; i++)
    {
      //if the remainder of the num divided by i is equal to 0
      if(num % i == 0)
        //add i to sum
        sum += i;
    }
    //if sum is equal to num
    if(sum == num)
    {
	    //return true
      return true;
    }
    //otherwise, return false
    return false;
  }

  //toString
  public String toString()
  {
    return "" + num;
  }
}