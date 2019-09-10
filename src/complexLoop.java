import java.util.Scanner;

public class complexLoop {

    //Ask the user for the weather "What's the weather like?"
    //Display their input "Today is ****!"
    //Ask the user if they want to continue "Do you want to continue?"
    //
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String reply = "";
        String temp = "";

        // Using do-while loop
        do {
            System.out.println("What's the weather like?");
            temp = sc.nextLine();
            System.out.println("Today is " + temp + "!");

            System.out.println("Do you want to continue?");
            reply = sc.nextLine();
        }while (!reply.equalsIgnoreCase(("no")));


        //using while loop
        while(!reply.equalsIgnoreCase("no")){
//            if( reply.equalsIgnoreCase("no")){
//                break;
//            }
            System.out.println("What's the weather like?");
            temp = sc.nextLine();
            System.out.println("Today's " + temp);

            System.out.println("Do you want to continue?");
            reply = sc.nextLine();

        }
    }
}
