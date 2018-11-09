import java.util.Scanner;


public class  solution 
{
	 public static void main(String []argh)
	 { 
		 int f1=0,f2=1,f3=2;
		 System.out.println("input four numbers before calculate");
		 final Scanner in = new Scanner(System.in);
	     final int t=in.nextInt();
	     final int []rec=new int[t*3];
	     
	     for(int time=0;time<rec.length;time++)
	     {
	    	rec[time]=in.nextInt();   	
	     }
	     in.close();
	     re re=new re();
	     for (int i = 0; i < t; i++) 
	     {
			re.loop(rec[f1], rec[f2], rec[f3]);
			f1=f3+1;f2=f1+1;f3=f2+1;
	     }
		       
	 }		    
}
class re{
	int all=0;
	String block="";
	
	public void loop(int a, int b, int n)
	{
		for (int i = 0; i <n; i++) 
		{
			all=i==0?a:all;
			block=i==n-1?"\n":" ";
			all+=add(i,b);
			System.out.print(all+block);
		}
			
	}
	int add(int a,int b)
	{
		if(a==0){
			return b; 
		}
		return 2*add(a-1,b);   
	}
	
	
	
	
}

