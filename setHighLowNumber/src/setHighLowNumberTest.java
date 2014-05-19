import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class setHighLowNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
	Scanner input = new Scanner(System.in);	
	
	setHighLowNumber myRandomNumber = new setHighLowNumber();
	
    //boolean jorgeWin;    
    boolean luisWin;
    boolean catalan;
     
    
    boolean userNotDone = true;		
	
	while (userNotDone)
	{
		String input2 = JOptionPane.showInputDialog(
				 "Enter 1 to continue playing\n" +
				 "Enter 2 to exit the game" );
				
		 int choice = Integer.parseInt( input2 );			
		
		
		if (choice == 1) 
		{
			
			int lost = 0;
		    int win = 0;
		    int count = 0; 
		    int low = 1;
		    int high = 1;
		    
		    do {     
	
		    	
		    	
		    	 //int game=myRandomNumber.displayMessage(); 	
		    	 
		    	int game=myRandomNumber.GetANumber();  
		    	
		    	//int game=myRandomNumber.SetLowNumber(int low); 
		    	
		    //	int game=myRandomNumber.SetHighNumber(int high); 
		    	
		    	
		    	 
		    	
		    	//int game = 0 + (int) (Math.random() * 10);
		    	
		    	String input3 = JOptionPane.showInputDialog( "Welcome to the guess a number game, please type in a number 0 and 10\n");  	
				
		    	int user = Integer.parseInt( input3 );											
				
				//jorgeWin = user == game;		
				luisWin =  user < game;
				catalan = user > game;					
				
				
				if (luisWin)
				{
				String message =
					String.format( "Congratulations, You picked a lower %d value than the computer %d. .\n\n", user, game);
					JOptionPane.showMessageDialog( null, message );
					//win++;
				}
				else if (catalan)
				{
				String message2 =
					String.format( "Congratulations, You picked a higher %d value than the computer %d. .\n\n", user, game);
					JOptionPane.showMessageDialog( null, message2 );
					//lost++;
				}
				/*else if (catalan)
				{
				String message3 =
					String.format( "Sorry but the number %d is too high, the correct number is %d, please try again by restarting program\n\n", user , game);	
					JOptionPane.showMessageDialog( null, message3 );
					lost++;
				}*/								
					count++; 			
		    }    
		    while (count < 3);    
		    
		   /* String message4 =
					String.format( "You have played this game %d\n\n", count);	
					JOptionPane.showMessageDialog( null, message4 );
					
			String message5 =
					String.format( "You have win this game %d\n\n", win);	
					JOptionPane.showMessageDialog( null, message5 );
							
			String message6 =
					String.format( "You have lost this game %d\n\n", lost);	
					JOptionPane.showMessageDialog( null, message6 );	*/	   			   					
		}		
		else if (choice == 2) 
			userNotDone = false;
	}						
	}	 
}

		
		
		
		

	