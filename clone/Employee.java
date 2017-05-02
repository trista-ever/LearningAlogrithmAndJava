package clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 2017/4/3 11:53
 *
 * @author weiyu si
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s){
        name =n;
        salary =s;
        hireDay= new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        //call Object.clone()
        Employee cloned =(Employee) super.clone();

        //clone mutable fields
        cloned.hireDay =(Date) hireDay.clone();

        return cloned;

    }
    /*
    set the hire day to a given date
     */
    public void setHireDay(int year,int month,int day){
        Date newHireday = new GregorianCalendar(year,month-1,day).getTime();
        //exmaple of instance field mutation
        hireDay.setTime(newHireday.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise =salary*byPercent/100;
        salary+=raise;
    }

    public String toString(){
        return "Employee[name="+name+",salary="+salary+",hireday="+hireDay+"]";
    }

}
