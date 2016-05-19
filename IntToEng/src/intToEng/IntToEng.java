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
    	int s1 = n / 100;
    	int t1 = n % 100;
    	int s2 = n / 10;
    	int t2 = n % 10;
    	String hund = "";
    	String ten = "";
    	String one = "";
    	
    	if(s1 == 1){
    		hund = "one hundred ";
    	}
    	
    	if(s2 == 1){
    		if(t2 == 1){
    			ten = "eleven";
    		}else if(t2 == 2){
    			ten = "twelve";
    		}else if(t2 == 3){
    			ten = "thirteen";
    		}else if(t2 == 4){
    			ten = "fourteen";
    		}else if(t2 == 5){
    			ten = "fifteen";
    		}else if(t2 == 6){
    			ten = "sixteen";
    		}else if(t2 == 7){
    			ten = "seventeen";
    		}else if(t2 == 8){
    			ten = "eighteen";
    		}else if(t2 == 9){
    			ten = "nineteen";
    		}
    	}else if(s2==2){
    		ten = "twenty";
    	}else if(s2==3){
    		ten = "thirty";
    	}else if(s2==4){
    		ten = "fourty";
    	}else if(s2==5){
    		ten = "fifty";
    	}else if(s2==6){
    		ten = "sixty";
    	}else if(s2==7){
    		ten = "seventy";
    	}else if(s2==8){
    		ten = "eighty";
    	}else if(s2==9){
    		ten = "ninety";
    	}else if(s2==10){
    		ten = "hundred";
    	}
    	
    	if(s2 != 1 && s2 != 10){
    		if(t2 == 1){
    			one = "one";  
    		}else if(t2 == 2){
    			one = "two";
    		}else if(t2 == 3){
    			one = "three";
    		}else if(t2 == 4){
    			one = "four";
    		}else if(t2 == 5){
    			one = "five";
    		}else if(t2 == 6){
    			one = "six";
    		}else if(t2 == 7){
    			one = "seven";
    		}else if(t2 == 8){
    			one = "eight";
    		}else if(t2 == 9){
    			one = "nine";
    		}
    	}
    	
        return ten + one;
    }
}
