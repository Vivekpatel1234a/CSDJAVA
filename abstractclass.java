/*
 * // if no field(or no method ) available in interface or it is blank then this interface is called marker interface
    // if there is only one method is there then this interace is called functional interface 
 */

interface inter1{
 int x=112;          // is variable ka mtlb public hai static hai aur final hai  / chahe likhe yaa na likhe 
    void method1();  // jitne bhi method honge vo by default public abstract honge   chahe likhe uske aage yaa na likhe 
    //abstraction means hiding internal details and showing only functionality to the user 

}

interface inter2{
    int x=115;
    void method2(); //aur ise niche likhna pdega nhi to ye error dega
}


public class abstractclass implements inter1,inter2 {

    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(inter1.x);// yha pr hmne inter1.x likha hai bcz inter1 ka variable hai 
       int x=133;
       System.out.println(x); // x yaha pr 133 hoga aur ye interface vala x nhi hai ye ek local variable hai

    }
    public void method1(){
        System.out.println("This is my method");
    }
    public void method2(){
        System.out.println("This is 2nd interface");
    }
}
