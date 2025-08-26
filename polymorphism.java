public class polymorphism {

    polymorphism() {
        System.out.println("Constructor overloading");
    }

    


    public static void main(String[] args) {
        System.out.println("A");
        polymorphism cc = new polymorphism();
        cc.m1();
        cc.m1(5);
        cc.m1(5, "hello");
    }
    public static void main() {
        System.out.println("M");
    }
    
    void m1(int a) {
        System.out.println("B");
    }
    void m1() {
        System.out.println("C");
    }
    void m1(int a, String s){
        System.out.println("D");
    }
}
//polymorphism have types -> Static or early Binding(Compile-time) and Dynamic or late Binding(Runtime)
// compile time polymorphism means jb method overloading hota hai jaise m1(int a) and m1(int a, String s) dono same class me hote hai 

