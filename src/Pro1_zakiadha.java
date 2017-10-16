import java.io.*;

public class Pro1_zakiadha {

	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
         
        boolean A = true;
        while(A==true){
        System.out.println("   JAVA FIZZBUZZ PROGRAM");
        System.out.print("Enter Fizz number: ");
        int fizz = Integer.parseInt(cin.readLine());
        while(fizz<0){
            System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
            fizz = Integer.parseInt(cin.readLine());
        }
        if(fizz==0){
            break;
        }
     
         
        System.out.print("Enter Buzz number: ");
        int buzz = Integer.parseInt(cin.readLine());
        while(buzz<0){
            System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
            buzz = Integer.parseInt(cin.readLine());
        }
        if(buzz==0){
            break;
        }
       
         
        System.out.print("Enter starting number: ");
        int start = Integer.parseInt(cin.readLine());
         
        System.out.print("Enter ending number: ");
        int end = Integer.parseInt(cin.readLine());
        while(end<start){
            System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
            end = Integer.parseInt(cin.readLine());
             
        }
        System.out.print("\n");
        for(;start<end+1;start++){
            if(start % fizz==0 && start%buzz ==0){
                System.out.println(start +". FizzBuzz");
            }
            else if(start % fizz==0){
                System.out.println(start +". Fizz");
            }
            else if(start % buzz==0){
                System.out.println(start +". Buzz");
            }
            else{
                System.out.println(start + ". " + start);
            }
        }
        System.out.print("\n");
         
        }
        System.out.println("\nThe end.");
         
         
 
    }
}
