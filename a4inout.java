//import java.util.Scanner; // hmne ise import kiya so that we can use scanner
public class a4inout {
    
    public static void main(String[] args) {
        // int age;
        // try(Scanner sc = new Scanner(System.in)){
        // System.out.println("Enter your age: ");
        //  age = sc.nextInt();
        // System.out.println("Hello, you are " + age + " years old!");
        
        // for float sc.nextFloat();
        // for double sc.nextDouble();
        // for String sc.nextLine();  // poora sentence yaa fir poora line lene ke liye 
        // sc.next jo hai vo sirf ek token ko hi leta hai (mtlb sirf ek word ko hi lega)
        // agr hme poora line yaa fir sentence lena hai to hme nextLine() use krna padega
        // sc.close(); // scanner ko close krna chahiye jb hm use kr chuke ho
        
    




// comparison operator;
// a==b
// a!=b
// a>b
// a<b
// a>=b
// a<=b







//  conditional statements
// if (age < 18) {
//     System.out.println("You are a minor.");
// } else {
//     System.out.println("You are an adult.");
// }

    


// logical operators
// && (AND)
// || (OR)
// ! (NOT)


// System.out.println("Enter price: ");
// int price = sc.nextInt();
// if(price>100){
//     System.out.println("Expensive");
// }
// else{
//     System.out.println("You can buy it.");
// }

 




// switch statement

// int day=2;
//     switch (day) {
//         case 1:
//             System.out.println("Monday");
//             break;
//         case 2:
//             System.out.println("Tuesday");
//             break;
//         case 3:
//             System.out.println("Wednesday");
//             break;
//         case 4:
//             System.out.println("Thursday");
//             break;
//         case 5:
//             System.out.println("Friday");
//             break;
//         case 6:
//             System.out.println("Saturday");
//             break;
//         case 7:
//             System.out.println("Sunday");
//             break;
//         default:
//             System.out.println("Invalid day");
//     }
        
// for loop

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Iteration " + i);
        // }


// while loop
        // int j = 1;
        // while (j <= 5) {
        //     System.out.println("Iteration " + j);
        //     j++;
        // }

        // // do-while loop
        // int k = 1;
        // do {
        //     System.out.println("Iteration " + k);
        //     k++;
        // } while (k <= 5);









        // break and continue

        // break
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         break; // exit the loop when i is 3
        //     }
        //     System.out.println("round " + i);
        // }  //1 2


        // // continue
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         continue; // skip the current iteration when i is 3
        //     }
        //     System.out.println("round " + i);
        // } // 1 2 4 5 





        // try-exception handling

// diff bw error and exception 
// error ka mtlb program ka crash hona yaa fir unexpected behavior honan , vhi pr code ruk jata hai uske baad aage ki line nhi chalti 
// exception ka mtlb hota hai ki program run hone ke dauran koi issue aata hai, lekin program crash nahi hota, balki vo try-catch block me chala jata hai
// mtlb ki exception handling ka use karke hum program ko crash hone se bacha sakte hain   // exception ko hm handle kr skte hai


int[] marks = {1,2,3,4,5};
    //System.out.println(marks[5]); // This will throw an ArrayIndexOutOfBoundsException
    try{
        System.out.println(marks[5]);
    } catch (Exception e) {
        System.out.println("Array index is out of bounds!");
    }
    System.out.println("Program continues...");





    //   METHODS  
    // ek class ke andr bahot sare methods hote hain jo alag-alag tasks perform karte hain
    // ex remote ke andr button yaha pr remote class hai aur buttons method hai o bahot sare task perform krte hai

}
}
