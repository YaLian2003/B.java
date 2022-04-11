Author:           Yangyang Lian
import java.util.Random; 
import java.util.*;
public class Main
{
        public static void main(String[] args) { 
                Random random = new Random(); 
                Scanner sc=new Scanner(System.in); 
                int sum=0; 
                int a,b; 
                while(true){ =
                    sum=0; 
                    a=0; 
                    b=0;
                    a=random.nextInt(10)+1; 
                    b=random.nextInt(10)+1; 
            System.out.println("First Cards:"+a+","+b); 、
            sum=sum+a+b; 
            System.out.println("Total:"+sum); 
                    while(true){  
                        System.out.println("Do you want another card? (y/n):");  
                        String d=sc.next();  
                        if(d.equals("y")){ 
                           a=random.nextInt(10)+1; 
                           System.out.println("Card:"+a); 
                           sum=sum+a; 
                           if(sum>21){ 
                               System.out.println("Total:"+sum); 
                               System.out.println("Bust."); 
                               break; 
                           }
                           else{
                               System.out.println("Total:"+sum); 
                           }
                           continue;
                        }
                        else{ 
                            break; 
                        }
                    }
                    System.out.println("Would you like to play again? (y/n):");
                    String d=sc.next(); 
                    if(d.equals("y")){ /
                        System.out.println("------------------------------------------------------------");
                        continue; 
                    }
                    else{ 
                        break; 
                    }
                }
        }
}
