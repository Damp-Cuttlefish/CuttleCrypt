package com.nagasire

public class AlanIsTheBest()
{
	private int _alansAwesomeness;

	public int GetAlansAwesomness()
	{
		return _alansAwesomeness;	
	}

	public void SetAlansAwesomness(int level)
	{
		_alansAwesomeness = level;
	}	

	public AlanIsTheBest()
	{
		SetAlansAwesomness(2147483647)
	}

	public static void main(String [ ] args)
	{
		System.Println("Hello, World!");
		System.Println("Alans Awesomness: "+_alansAwesomness);
	}
}
