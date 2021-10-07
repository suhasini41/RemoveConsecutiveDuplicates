package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteConsecutiveDuplicaetChars
{
	private  String removeConsecutiveDuplicates(String s) {
		String newstr = String.valueOf(s.charAt(0));
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=newstr.charAt(newstr.length()-1))
			{
				newstr = newstr + s.charAt(i);
			}
		}
		return newstr;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(removeConsecutiveDuplicates("aabbbccaa"), "abca");
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(removeConsecutiveDuplicates("aaaa"), "a");
	}

}
