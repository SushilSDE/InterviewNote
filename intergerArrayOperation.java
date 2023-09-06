package com.Stream.Groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class intergerArrayOperation 
{
 public static void main(String[] args) 
 {
	 int arr[]= {1,5,3,9,0,4};
	List<Integer> lst = Arrays.stream(arr).boxed().sorted((x,y)->x-y).collect(Collectors.toList());
	System.out.println("List>>"+lst.toString());
	String s1= "helo";
	String s2= "helo";
	if(s1==s2)
	{
		System.out.println("xx");
	}
	else
	{
		System.out.println("yy");
	}
 }
}
