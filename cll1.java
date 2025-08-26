public class cll1 {
    public static void main(String[] args) {
      //super parent inheritance and constructor
      class employee{
        String name;
        double salary;
        employee(String name, double salary){
          this.name = name;
          this.salary = salary;
        }
        void show(){
            System.out.println("Name: "+name+", Salary: "+salary);
        }
      }
      class Manager extends employee{
        String department;
        Manager(String name, double salary, String department){
          super(name, salary);
          this.department = department;
        }
        @Override
        void show(){
          super.show();
          System.out.println("Department: "+department);
        }
      }
      Manager m = new Manager("Alice", 75000, "IT");
      m.show();
    }
}
