import java.util.Scanner;

//package intToEng;

public class IntToEng {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }
    
    static String translateEng(int n) {
    	int s = n / 10;
    	int t = n % 10;
    	String ten = "";
    	String one = "";
    	
    	if(s == 1){
    		if(n == 11){
    			ten = "eleven";
    		}else if(n == 12){
    			ten = "twelve";
    		}else if(n == 13){
    			ten = "thirteen";
    		}else if(n == 14){
    			ten = "fourteen";
    		}else if(n == 15){
    			ten = "fifteen";
    		}else if(n == 16){
    			ten = "sixteen";
    		}else if(n == 17){
    			ten = "seventeen";
    		}else if(n == 18){
    			ten = "eighteen";
    		}else if(n == 19){
    			ten = "nineteen";
    		}
    	}else if(s==2){
    		ten = "twenty";
    	}else if(s==3){
    		ten = "thirty";
    	}else if(s==4){
    		ten = "fourty";
    	}else if(s==5){
    		ten = "fifty";
    	}else if(s==6){
    		ten = "sixty";
    	}else if(s==7){
    		ten = "seventy";
    	}else if(s==8){
    		ten = "eigthty";
    	}else if(s==9){
    		ten = "ninety";
    	}
    	
    	if(t == 1){
    		one = "one";
    	}else if(t == 2){
    		one = "two";
    	}else if(t == 3){
    		one = "three";
    	}else if(t == 4){
    		one = "four";
    	}else if(t == 5){
    		one = "five";
    	}else if(t == 6){
    		one = "six";
    	}else if(t == 7){
    		one = "seven";
    	}else if(t == 8){
    		one = "eight";
    	}else if(t == 9){
    		one = "nine";
    	}
    	
        return ten + one;
    }
}
