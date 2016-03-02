import java.util.Scanner;

public class MaximumYieldDilithium {
	
	protected int dilithium[];
	public int s1,s2,s3;
	 
	//Initializing array with a zero.
	
		 public MaximumYieldDilithium()
		 {
			 dilithium = new int[5];
			 for(int i=0;i<5;i++)
				 dilithium[i]=0;
			 s1=s2=s3=0;
			 
			 }
		 
	//Getting Dilithium quantities from user.
		 
		 public void getValues()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Dilithium Quantities of five consecutive squares of the strip: ");
		for(int i=0;i<5;i++)
			dilithium[i]= input.nextInt();
		
		
	}
		 
		 public int sum(int a,int b)
		 {
			 return a+b;
			 
		 }

        public int sum(int a,int b,int c)
        {
        	return a+b+c;
        }
        public int swap(int a,int b,int c,int d)
        {if (a>b)
        	{
        	s1=c;
        	s2=d;
        	s3=0;
        	return a;
        	}
        else
        	return b;
        }
        public int maximumYield()
        {
        	int max=0,i=0,temp=0;
        	max=sum(dilithium[i],dilithium[i+2],dilithium[i+4]);
        	s1=i+1;
        	s2=i+3;
        	s3=i+5;
        	
        	temp=sum(dilithium[i],dilithium[i+3]);
        	max=swap(temp,max,i+1,i+4);
        	
        	temp=sum(dilithium[i+1],dilithium[i+3]);
        	max=swap(temp,max,i+2,i+4);
        	
        	temp=sum(dilithium[i+1],dilithium[i+4]);
        	max=swap(temp,max,i+2,i+5);
        	
        	
        	return max;
        	
        	
        }
        public void square(int a)
        {
        	
        switch (a)
              {
        case 0:
        	break;
        case 1:
        	System.out.print("first ");
        	break;
        case 2:
        	System.out.print("second ");
        	break;
        case 3:
        	System.out.print("third ");
        	break;
        case 4:
        	System.out.print("fourth ");
        	break;
        case 5:
        	System.out.print("fifth ");
        	break;
        	
              } 
        }
        
        public static void main(String args[])
        {
        	MaximumYieldDilithium strip1 = new MaximumYieldDilithium();
        	strip1.getValues();
        	    		

        	System.out.print("The total Dilithium we can mine in this strip is "+strip1.maximumYield()+ " from mining ");
        	strip1.square(strip1.s1);
        	strip1.square(strip1.s2);
        	strip1.square(strip1.s3);
        	     	
        	System.out.println(" squares.");
        	
        	
        	
        	
        }
}
