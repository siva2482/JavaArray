package javaassign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Limittwo {
	
	
	public static List<Integer> multwo(List<Integer> list1)
	
	{
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:list1)
		{
			int result=i*2;
			int rem=result%10;
			if(rem!=2)
				list.add(result);
				
			
		}
		System.out.println(list);
		return list;
		
	}
@Test
public void testing1()
{
	Integer[] num= {1,2,3};
	Integer[] num2= {4,6};
	List<Integer> list1=new ArrayList<Integer>(Arrays.asList(num));
	List<Integer> expectedlist=new ArrayList<Integer>(Arrays.asList(num2));
	List<Integer> actuallist=multwo(list1);
	Assert.assertEquals(expectedlist,actuallist);
    
	
}
@Test
public void testing2()
{
	Integer[] num= {2,6,11};
	Integer[] num2= {4};
	List<Integer> list1=new ArrayList<Integer>(Arrays.asList(num));
	List<Integer> expectedlist=new ArrayList<Integer>(Arrays.asList(num2));
	List<Integer> actuallist=multwo(list1);
	Assert.assertEquals(expectedlist,actuallist);
}
@Test
public void testing3()
{
	Integer[] num= {0};
	Integer[] num2= {0};
	List<Integer> list1=new ArrayList<Integer>(Arrays.asList(num));
	List<Integer> expectedlist=new ArrayList<Integer>(Arrays.asList(num2));
	List<Integer> actuallist=multwo(list1);
	Assert.assertEquals(expectedlist,actuallist);
}
}
