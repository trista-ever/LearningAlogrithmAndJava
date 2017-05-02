/**
 * 2017/3/30 15:33
 *
 * @author changyi yuan
 */
public class ParamTest {
    public static void main(String[] args){
        /** methods cannot modify numeric parameters
         *
         */
        System.out.println("test triplevalue");
        double percent =10;
        System.out.println("before:percent="+percent);
        tripleValue(percent);
        System.out.println("After:percent="+percent);
        /*
        methods can change the state of object parameters
         */
        System.out.println("\n test triplesalary:");
        Employee harry =new Employee("harry",50000);
        System.out.println("before: salary="+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("after:salary="+harry.getSalary());

        /* !!!important
        methods cannot attach new objects to object parameters
         */
        System.out.println("\ntest swap:");
        Employee a =new Employee("Alice",7000);
        Employee b = new Employee("Bob",6000);
        System.out.println("before:="+a.getName());
        System.out.println("befoer:="+b.getName());
        swap(a,b);
        System.out.println("after:a="+ a.getName());
        System.out.println("after:b="+ b.getName());


    }

    public static void tripleValue(double x){
        x=3*x;
        System.out.println("end of method: x="+x);
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("end of method: salary="+x.getSalary());
    }

    public static void swap(Employee x,Employee y){
        Employee temp =x;
        x=y;
        y=temp;
        System.out.println("end of method:x="+x.getName());
        System.out.println("end of method:y="+y.getName());
    }

}

class Employee{
    private String name;
    private double salary;

    public Employee(String n,double s){
        name=n;
        salary=s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }
}
