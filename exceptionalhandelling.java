public class exceptionalhandelling {
    public static void main(String[] args) {
        // System.out.println("hello sir");
        // System.out.println("hey");
        try{
        int a=1/0;
        }
        catch(Exception e){
           // System.out.println(e.toString());          2. e.toString()

                                                         // Ye exception ka type + message dono return karta hai.  
            //java.lang.ArithmeticException: / by zero



                                          //Yes do it
                                          System.out.println(e.getMessage());  //   / by zero       Sirf exception ka message deta hai (jo constructor me diya gaya hota hai).
        }
        System.out.println("Yes do it");      


        /*
         * 
         * e.printStackTrace()

Ye sabse detailed debugging info deta hai.

Batata hai ki exception kaunse class, method, line number par aaya.

Ye directly console pe print karta hai (return nahi karta).
         */


    }
 //unchecked ka hai oopar vala example

 //when compiler gives warning , that it will gives error -> so it is checked exception 

    }

