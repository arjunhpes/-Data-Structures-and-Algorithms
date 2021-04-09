package Array;

public class mynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int itsThere(int input1, int[][] input2, int input3)
	{
	    int answer = INT_MAX;
	   
	    for(int i=0; i<input1; i++)
	    {
	        for(int j =0; j<input1; j++)
	        {
	            if(countDir(input1, input2, input2[i][j], i, j) >= input3)
	            {
	                if(input2[i][j] < answer)
	                {
	                    answer = input2[i][j];
	                }
	            }
	        }
	    }
	   
	    return answer;
	}
	int countDir(int n, int input2, int element, int row, int col)
	{
	    int up = 0, down = 0, left = 0, right = 0, rdiagonal = 0, ldiagonal = 0;
	   
	    int result = 0;
	   
	    for(int i=row-1; i>=0; i--)
	    {
	        if(input2[i][col] == element)
	        up++;
	       
	        else
	        break;
	    }
	   
	    result = max(result, up);
	   
	    for(int j=col-1; j>=0; j--)
	    {
	        if(input2[row][j] == element)
	        left++;
	       
	        else
	        break;
	    }
	   
	    result = max(result, left);
	   
	    for(int j=col+1; j<n; j++)
	    {
	        if(input2[row][j] == element)
	        right++;
	       
	        else
	        break;
	    }
	   
	    result = max(result, right);
	   
	    for(int i=row+1;i<n;i++)
	    {
	        if(input2[i][col] == element)
	        down++;
	       
	        else
	        break;
	    }
	   
	    result = max(result, down);
	   
	    int x = row-1, y = col-1;
	   
	    while(x<n && y>=0)
	    {
	        if(input2[x][y] == element)
	        ldiagonal++;
	       
	        else
	        break;
	       
	        x--,y--;
	       
	    }
	   
	    result = max(result, ldiagonal);
	   
	    x = row+1, y = col+1;
	   
	    while(x<n && y<n)
	    {
	        if(input2[x][y] == element)
	        rdiagonal++;
	       
	        else
	        break;
	       
	        x++, y++;
	    }
	   
	    result = max(result, rdiagonal);
	   
	   
	    return result;
	}


	
}
