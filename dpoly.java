public class dpoly {
   // dynamic polymorphism ->late binding(runtime binding)


   static class A1{
       void m1(){
           System.out.println("coming from m1 method");
       }
   }
   static class B1 extends A1{
       @Override
       void m1(){
           System.out.println("coming from m2 method");
       }
   }


   public static void main(String[] args) {
       A1 a1 = new A1();
       a1.m1();
       A1 b1 = new B1();
       b1.m1();
   }
}
   // dynamic polymorphism -> late binding (runtime binding)