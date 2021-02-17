//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[] n)
  {
    list = new ArrayList<Number>();
    
    for(int a : n)
    {
      list.add(new Number(a));
    }
  }

	//write count odds
  public int countOdds() {
    //create int count variable called odds, set equal to 0
    int odds = 0;
    //for each loop: loop variable - Number i, loop through arraylist list
    for(Number i : list)
    {
      //if isOdd() is true
      if(i.isOdd())
      {
        //add one to odds
        odds++;
      }
    }
    //return number of odds
    return odds;
  }

	//write count evens
  public int countEvens() {
    //create int count variable called evens, set equal to 0
    int evens = 0;
    //for each loop: loop variable - Number i, loop through arraylist list
    for(Number i : list)
    {
      //if isOdd() is false
      if(i.isOdd() == false)
      {
        //add one to evens
        evens++;
      }
    }
    //return number of evens
    return evens;
  }

	//write count perfects
	public int countPerfects() {
    //create int count variable called perfects, set equal to 0
    int perfects = 0;
    //for each loop: loop variable - Number i, loop through arraylist list
    for(Number i : list)
    {
      //if isPerfect() is true
      if(i.isPerfect())
      {
        //add one to perfects
        perfects++;
      }
    }
    //return number of perfects
    return perfects;
  }

	//write a toString
  public String toString()
  {
    return "" + list;
  }
}