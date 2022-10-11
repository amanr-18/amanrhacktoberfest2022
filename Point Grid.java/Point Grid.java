/* package codechef; // don't place package name! */



import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Codechef

{

    static class FastScanner {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer("");

		String next() {

			while (!st.hasMoreTokens())

				try {

					st=new StringTokenizer(br.readLine());

				} catch (IOException e) {

					e.printStackTrace();

				}

			return st.nextToken();

		}

		

		int nextInt() {

			return Integer.parseInt(next());

		}

		int[] readArray(int n) {

			int[] a=new int[n];

			for (int i=0; i<n; i++) a[i]=nextInt();

			return a;

		}

		long nextLong() {

			return Long.parseLong(next());

		}

	}

	public static void main (String[] args) throws java.lang.Exception

	{

	

		FastScanner  sc = new FastScanner();

		PrintWriter out=new PrintWriter(System.out);

		int tc = sc.nextInt();

		for(int t=0; t<tc; t++){

		  // write code

		  int n= sc.nextInt();

		  long a[]= new long[n];

		  for(int i=0; i<n; i++){

		      a[i]= sc.nextLong();

		  }

		  long sum=a[n-1];

		  long cur=0; long prev=a[n-1];

		  for(int i=n-2; i>=0; i--){

		      cur=a[i];

		      if(prev==1){

		          sum+=cur;

		          prev= cur;

		      }

		      else if(cur>=prev){

		          sum+= cur-(prev-1);

		          prev=cur;

		      }

		      else{

		          prev= cur;

		      }

		  }

		

		  out.println(sum);

		  

	//	out.close();

	}

	

	out.close();

}

	// helper functions

	

	private static void printIList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++)

           System.out.print(list.get(i) + " ");

        System.out.println(" ");

    }



    private static void printLList(List<Long> list) {

        for (int i = 0; i < list.size(); i++)

            System.out.print(list.get(i) + " ");

        System.out.println(" ");

    }



    private static void printIArray(int[] arr) {

        for (int i = 0; i < arr.length; i++)

            System.out.print(arr[i] + " ");

        System.out.println(" ");

    }



    private static void printLArray(long[] arr) {

        for (int i = 0; i < arr.length; i++)

            System.out.print(arr[i] + " ");

        System.out.println(" ");

    }



    private static boolean isInteger(String s) {

        try {

            Integer.parseInt(s);

        } catch (NumberFormatException e) {

            return false;

        } catch (NullPointerException e) {

            return false;

        }

        return true;

    }



    private static void sort(int[] arr) {

        int n = arr.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)

            list.add(arr[i]);

        Collections.sort(list);

        for (int i = 0; i < n; i++)

            arr[i] = list.get(i);

    }



    private static void sort(long[] arr) {

        int n = arr.length;

        List<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++)

            list.add(arr[i]);

        Collections.sort(list);

        for (int i = 0; i < n; i++)

            arr[i] = list.get(i);

    }



    private static int gcd(int a, int b) {

        if (b == 0)

            return a;

        return gcd(b, a % b);

    }



    private static long gcd(long a, long b) {

        if (b == 0)

            return a;

        return gcd(b, a % b);

    }



    private static int lcm(int a, int b) {

        return (a / gcd(a, b)) * b;

    }



    private static long lcm(long a, long b) {

        return (a / gcd(a, b)) * b;

    }



    private static int mod_power(int a, int b, int mod) {

        if (b == 0)

            return 1;

        int temp = mod_power(a, b / 2, mod);

        temp %= mod;

        temp = (int) ((1L * temp * temp) % mod);

        if ((b & 1) == 1)

            temp = (int) ((1L * temp * a) % mod);

        return temp;

    }



    private static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j)

            if (str.charAt(i++) != str.charAt(j--))

                return false;

        return true;

    }



    private static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();

    } 

}

