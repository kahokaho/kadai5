package intToEng;

import java.util.Scanner;

//package intToEng;

public class IntToEng {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }
    
    static String translateEng(int n) {
    	String one = "";
    	String ten = "";
    	String hund = "";
    	String[] num1 = {"one", "two", "three", "four","five", "six", 
    			"seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", 
    			"fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String[] num2 = {"twenty", "thirty", "forty", "fifty", "sixty","seventy", 
    			"eighty", "ninety"};
    	
    	
    	if(n < 20){
    		one = num1[n-1];
    	}else if(20 <= n || 99 >= n){
    		int s = n / 10;
    		int t = n % 10;
    		ten = num2[s-2];
    		if(t>0){
    			one = num1[t-1];
    		}
    	}else if(100 <= n || 999 >= n){
    		int m = n / 100;
    		int j = n % 100;
    		if(j == 0){
    			hund = num1[m-1]+"hundred";
    		}else{
    			hund = num1[m-1]+"hundred and ";
    		}
    		if(j < 20){
    			one = num1[n-1];
    		}else if(20 <= n || 99 >= n){
    			int s = j / 10;
    			int t = j % 10;
    			ten = num2[s-2];
    			if(t>0){
    				one = num1[t-1];
    			}
    		}
    	}
    	
        return hund + ten + one;
    }
}
