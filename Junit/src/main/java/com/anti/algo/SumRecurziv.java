package com.anti.algo;

public class SumRecurziv {
	
    private static int osszegez() {
		  int sum = 0; 	
    	  for(int i = 1; i <= 3 ; i++  )
			{
				sum += i; 
			}
    	  
    	  //System.out.println(sum);
    	  return sum;
		}	
    
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
    
    
   
    public static int num(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        sum += n;
        return num(n - 1, sum);

    }
    
    private static int add(int num) {
    	if(num == 0 ) 
           return 0;		
    	
    	    return num + add(num-1);
		}	

    
    
  
    
    private static int rekurziv(int num) {
    	if(num == 0)
    	{
    		return 0;
    	}	
    	return num + rekurziv(num-1);
	}
    
    
    
    
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(osszegez());
		 System.out.println(addNumbers(3));
		 System.out.println(add(3));
		 System.out.println(num(3,0));
		 System.out.println(rekurziv(3));

	}

}
