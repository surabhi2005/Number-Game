import java.util.*;
public class NumberGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        System.out.println("Number Game");
        char c='y';
        int k;
        int score=100;
        while(c=='y')
        {
            int rannum=r.nextInt(100)+1;
            k=1;
            score=100;
           while(true)
           {
            if(k==11)
            {
            System.out.println("Limit Exceeded");
            System.out.println("The number was: "+rannum);
            break;
            }
            System.out.println("Guess the Number: ");
            int num=sc.nextInt();
            if(num==rannum)
            {
            System.out.println("HOORAY! Success");
            System.out.println("Score: "+score);
            break;
            }
            else if(num<rannum)
            {
            System.out.println("Number is Too Low!");
            System.out.println("ReTry!");
            }
            else if(num>rannum)
            {
            System.out.println("Number is Too High!");
            System.out.println("ReTry!");
            }
            score-=10;
            k++;
        }
            System.out.println("Do you want to continue(y/n):");
            c=sc.next().charAt(0);
            while(c!='y' && c!='n')
            {
                System.out.print("Invalid input. Please enter 'y' to continue or 'n' to quit: ");
                c=sc.next().charAt(0);
            }
        }
        sc.close();  
        System.out.println("Thank you!");
    }
    
}
