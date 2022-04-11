Author; //Yangyang Lian
import java.util.Random; //importing random class
import java.util.*; //importing util class
public class Main //main class
{
        public static void main(String[] args) { //main method
                Random random = new Random(); //creating random class object
                Scanner sc=new Scanner(System.in); //creating scanner class object
                int sum=0; //initializing sum as 0
                int a,b; //declaring the variables
                while(true){  //main loop of the game
                    sum=0; 
                    a=0; //initializing the variables as 0
                    b=0;
                    a=random.nextInt(10)+1; //generating random card value
                    b=random.nextInt(10)+1; //generating random card value
            System.out.println("First Cards:"+a+","+b); //displaying the first 2 random cards
            sum=sum+a+b; //adding the card values
            System.out.println("Total:"+sum); //printing the sum of card values
                    while(true){  //sub main loop of generating random card
                        System.out.println("Do you want another card? (y/n):");  //asking the user to continue
                        String d=sc.next();  //input of yes or no
                        if(d.equals("y")){ //if user enters yes
                           a=random.nextInt(10)+1; //generating random card value
                           System.out.println("Card:"+a); //printing the card value
                           sum=sum+a; //adding the values of card
                           if(sum>21){ //if sum exceeds 21
                               System.out.println("Total:"+sum); //printing the sum of card values
                               System.out.println("Bust."); //dsiplaying bust if sum is more than 21
                               break; //breaking the sub main loop is sum is greater than 21
                           }
                           else{
                               System.out.println("Total:"+sum);  //else displaing the total card values
                           }
                           continue;
                        }
                        else{ //if user dont want to draw another card
                            break; //breaking out of sub main loop
                        }
                    }
                    System.out.println("Would you like to play again? (y/n):");  //asking the user if he wants to play another game
                    String d=sc.next(); //asking for input
                    if(d.equals("y")){ //if input is yes
                        System.out.println("------------------------------------------------------------");
                        continue; //continuing the game
                    }
                    else{ //if input is no
                        break; //breaking out the main loop
                    }
                }
        }
}
