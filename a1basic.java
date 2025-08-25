public class a1basic {  // class ka name aur file ka name same rhega 
    public static void main(String[] args) {   // ye function hai jo kuchh kaam krke dega 
        System.out.println("Hello, World!");  // print krne se line ka space nhi deta // but println line deta hai 
        System.out.print("hello sir");
        System.out.println("hello class");
        /*
         Hello, World!
         hello sirhello class
         */
        String name = "aman";
        int age = 30;
        System.out.println(name); //aman
        System.out.println(age);  //30



        // java types
        /*
         * -->Primitive types
         * byte - 1
         * short -2(2 byte memory)
         * int - 4  ex 1 2 3 
         * long - 8
         * float - 4 
         * double - 8
         * char - 2 ex - a b c d 
         * boolean - 1 true/false
         * 
         * 
         * 
         * 
         * for phone number we not use int we use long
         * int phone = 9985938583838  error
         * lonh phone =  994827938193L  (btane ke liye ki long hai)
         



        long phone2 = 838284838483849L; //L lgayenge tbhi long lega nhi to use as a int hi leta 
        float pi = 3.14F;
        char letter = '@';
        boolean isadult = true;

        */


        /*
         * Non primitive  
         * String   - hm isko kitna bhi size de skte (jb tk memory na bhar jaye)   hai bcz iska fix size nhi hota 
         * */
         /*String name2 = "aman";
         System.out.println(name2.length());  // 4

         */
     
/*concatenation */         String name1 = "aman";
                          String name2 = "sir";
                          System.out.println(name1 + " " + name2); // aman sir
    /*char at */                      System.out.println(name1.charAt(0));//a

//replace
            String name3 = "aman";
            String name4 = name3.replace('a', 'R');
            System.out.println(name4);// RmRn   // but name3 me change nhi  hoga bcz string immutable hota hai 

          String namel = "hellosiryes";
          System.out.println(namel.substring(5, 8));  // sir


    }

}
