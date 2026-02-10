import java.util.Random;
import java.util.Scanner;

public class RockPapperSesor {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a User : ");
        int Userinp = inp.nextInt();

       Random random = new Random();
       int Compinp = random.nextInt(3);

       if(Userinp==Compinp){
        System.out.println("Drow");
       }else if(Userinp==1 && Compinp ==0 || Userinp==0 && Compinp==2 || Userinp==2 && Compinp==1 ){
        System.out.print("User Win");
       }else{
        System.out.println("Computer win");
       }
    }
}
