
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowTotal=0;
		int[][] array= 
		{
			{1,2,3,4},
			{4,1,2,3},
			{3,4,1,2},
			{2,3,4,1}
		};
		
		int sum;
		for(int i=0;i<array.length;i++) 
		{
			sum=0;
	        for (int q=0;q<array.length;q++)
	        {
	            System.out.print(array[i][q]+" "); 
	        } 
	            System.out.println();
		}
	
		
		int colTotal=0;
		for(int i=0;i<array.length;i++) 
		{
			colTotal= colTotal+array[i][2];
		}
		System.out.println("Sum of each of the columns: "+colTotal);
		
		
		
		for(int i=0;i<array[1].length;i++) 
		{
			rowTotal += array[1][i];
		}
		System.out.println("Sum of each of the rows: "+rowTotal);
		int total=sum(array); 
		System.out.println("Total: "+total);
	}
		public static int sum(int[][]values) 
		{
			int total=0;
			
			
			for(int i=0;i<values.length;i++)
			{
				for(int q=0;q<values[0].length;q++) 
				{
					total+=values[i][q];
				}
			}
				return total;
		}
	}


