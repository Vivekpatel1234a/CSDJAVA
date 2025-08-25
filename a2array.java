import java.util.Arrays;
public class a2array{

    public static void main(String[] args) {
        /*int age = 30;
        int physics =47;
        int maths  = 59;

        maan lo kai subject hote to kai variable likhne pdte 


        to ab ise avoid krne ke liye hm use krte  hai array
        */
         // array are non primitive
        int[] marks = new int[4]; 
        
  /*
   * int datatype hai fir [] jo ki ek list hai and then array non primitive hai to hm use krenge new keyword ka uske baad int type ka value chahiye aur 3 chahiye for p c m 
   */

   marks[0]=97;
   marks[1]=98;
   marks[2]=99;
   marks[3]=93;
   // System.out.println(marks); /// [I@7ad041f3   is array ka address print hoga marks print krane ke liye hme uska index bhi dena hoga 
    System.out.println(marks[0]); // 97
    // maan lo marks array 4 size ka bnaya aur 4th vale me koi value nhi denge to by default null or 0 store hoga 
   // bool ka by default value false hota hai 
   System.out.println(marks.length);  // isko aise nhi likhenge like marks,length()   bracket ka use nhi krte hai bcz ye array ki property hai
   // string vgerah me () use krna pdta hai bcz  vha length ek method(function) hai  
 
   Arrays.sort(marks);  // is function ko call krne ke liye java.util.array bcz is class me sort function hota hai
  // ab print krane pr 93 97 98 99 aayega 


  //agr hme pehle se pta hai ii me itne subject ke marks score krne hai to hm new ka use nhi krte hm directly marks store kra lete hai
  int []score = {12,43,99,98,97};
  System.out.println(score[1]);//43
    


    //2d ARRAYS
    int[][] finalmarks = {{1,2,3},{2,5,4}};
    System.out.println(finalmarks[1][1]); //5

    int [][]scorecard = new int[5][3];
    scorecard[0][0] = 85;
    scorecard[0][1] = 90;
    scorecard[0][2] = 95;
    System.err.println(scorecard[0][2]);//95

    }
}