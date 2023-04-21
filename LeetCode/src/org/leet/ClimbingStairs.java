package org.leet;

public class ClimbingStairs {
	public static int climbStairs(int n) {
        if(n<2){
        return n;}
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int climb=first+second;
            first=second;
            second=climb;
        }

    return second;
        
    }
	public static void main(String[] args) {
	climbStairs(5);
	}

}
