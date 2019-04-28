class L4_T7
{
	public static void main(String args[])
	{
		int temp=0;

		int[] DATA={13,14,35,67,34};
		  int N=DATA.length;
	
	
		
		 for(int K=1;K<N;K++)
		  {	
	       
	         int PTR=0;
		      while(PTR<N-K)
		       {
			     if(DATA[PTR]>DATA[PTR+1])
			       {
					   temp=DATA[PTR];
				     DATA[PTR]=DATA[PTR+1];
					 DATA[PTR+1]=temp;
			       }
		          PTR=PTR+1;
		       }
		  } 
		for(int K=0;K<N;K++)
		{
			System.out.println(DATA[K]+" ");
		}	
	}		
	}
		
		