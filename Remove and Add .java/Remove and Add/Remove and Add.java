/* package codechef; // don't place package name! */



import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Codechef

{

	public static void main (String[] args) throws java.lang.Exception

	{

	Scanner sc=new Scanner(System.in);

	int t=sc.nextInt();

	while(t-->0){

	int n=sc.nextInt();

	long arr[]=new long[n];

	for(int i=0;i<n;i++){

	    arr[i]=sc.nextLong();

	}

	int i=0,j=0;

	int ans=Integer.MAX_VALUE;

	HashSet<Long> set=new HashSet<>();

	for(i=0;i<n;i++){

	    if(set.contains(arr[i])){

	        while(arr[j]!=arr[i]){

	            set.remove(arr[j]);

	        j+=1;

	        }

	        j+=1;

	    }

	    else{

	        set.add(arr[i]);

	    }

	    int left=j;

	    int right=n-1-i;

	    ans=Math.min(ans,Math.min(left,right)*2+Math.max(left,right));

	}

	System.out.println(ans);

	}

	}

}

