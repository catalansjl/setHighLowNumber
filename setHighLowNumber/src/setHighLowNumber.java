import java.util.Random;

public class setHighLowNumber {	
		
	public int GetANumber()
	{
		int game = 0 + (int) (Math.random() * 10);
		return game;		
	}
	
	public int SetLowNumber(int low)
	{
		int game = 0 + (int) (Math.random() * low);
		return game;		
	}
	
	public int SetHighNumber(int high)
	{
		int game = 0 + (int) (Math.random() * high);
		return game;		
	}		
}
	
	
	
	
	
	
	
	
	
	

