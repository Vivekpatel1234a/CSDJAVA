// Outer class
public class encapsulation {
    
    // Nested static class
    static class Employee {
        private double salary;
        private String name;

        // getter & setter
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // main method
    public static void main(String[] args) throws Exception {
        // Normal way (through setter & getter)
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(50000);

        System.out.println("Using getters:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        // Reflection way (directly accessing private field)
        java.lang.reflect.Field fsalary = Employee.class.getDeclaredField("salary");
        fsalary.setAccessible(true);
        System.out.println("\nUsing reflection:");
        System.out.println("Salary: " + fsalary.get(emp));
    }
}
// encapsulation means 
