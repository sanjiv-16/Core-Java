
	import java.math.*;

	class GFG {

		// function that returns correlation coefficient.
		static float correlationCoefficient(int X[],
										int Y[], int n)
		{
		
			int sum_X = 0, sum_Y = 0, sum_XY = 0;
			int squareSum_X = 0, squareSum_Y = 0;
		
			for (int i = 0; i < n; i++)
			{
				// sum of elements of array X.
				sum_X = sum_X + X[i];
		
				// sum of elements of array Y.
				sum_Y = sum_Y + Y[i];
		
				// sum of X[i] * Y[i].
				sum_XY = sum_XY + X[i] * Y[i];
		
				// sum of square of array elements.
				squareSum_X = squareSum_X + X[i] * X[i];
				squareSum_Y = squareSum_Y + Y[i] * Y[i];
			}
		
			// use formula for calculating correlation
			// coefficient.
			float corr = (float)(n * sum_XY - sum_X * sum_Y)/
						(float)(Math.sqrt((n * squareSum_X -
						sum_X * sum_X) * (n * squareSum_Y -
						sum_Y * sum_Y)));
		
			return corr;
		}
		
		// Driver function
		public static void main(String args[])
		{
		
			int X[] = {15, 18, 21, 24, 27};
			int Y[] = {25, 25, 27, 31, 32};
		
			// Find the size of array.
			int n = X.length;
		
			// Function call to correlationCoefficient.
			System.out.printf("%6f",
					correlationCoefficient(X, Y, n));
		
			
		}
	}

	/*This code is contributed by Nikita Tiwari.*/

	
	
	



