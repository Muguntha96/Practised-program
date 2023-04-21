package org.leet;

public class AlternatingSum {
public static void main(String[] args) {
	sum(1234);

}
	
	public static int sum(int n)  {
		int sum=0;
		int sign=1;
		for (char c : String.valueOf(n).toCharArray()) {
			int x=c-'0';
			sum+=sign*x;
			sign*=-1;
			
		}
		return sum;
		

	}

	
	

	
}
