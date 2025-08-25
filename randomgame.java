import java.util.Scanner;
public class randomgame {
    public static void main(String[] args) {
        
        int num = (int)(Math.random()*100);
        try(Scanner sc = new Scanner(System.in)){
        int i=1;
        while(i==1){
            System.out.print("Guess a number : ");
            int number = sc.nextInt();
             if(number==-1){
                System.out.println("Correct number was "+ num);
                i=-1;
            }
            else if(number<num){
                System.out.println("You guess a small number"); 
                    System.out.println("Enter -1 for exit the game");
                i=1;
            }
            else if(number>num){
                System.out.println("You guess a big number");
                    System.out.println("Enter -1 for exit the game");
                i=1;
            }
            else{
                System.out.println("Ya! you guess a correct number");
                i=-1;
            }
           

        }
    }


    }
}

// import java.util.Scanner;

// public class RandomGame {
//     public static void main(String[] args) {
        
//         int num = (int)(Math.random() * 100);  // 0-99 random number
//         Scanner sc = new Scanner(System.in);

//         System.out.println("🎯 Welcome to the Guessing Game!");
//         System.out.println("I have selected a number between 0 and 99.");
//         System.out.println("Enter -1 anytime to quit.\n");

//         while (true) {
//             System.out.print("Guess a number: ");
//             int number = sc.nextInt();

//             if (number == -1) { // Exit condition
//                 System.out.println("Game exited. The correct number was: " + num);
//                 break;
//             } else if (number < num) {
//                 System.out.println("Too small! Try again.");
//             } else if (number > num) {
//                 System.out.println("Too big! Try again.");
//             } else {
//                 System.out.println("🎉 Yaay! You guessed the correct number!");
//                 break;  // end loop
//             }
//         }

//         sc.close();
//     }
// }
