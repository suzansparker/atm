import java.sql.SQLOutput;

class employee{
    void  calculatepay(String name,double salary) {
        System.out.println(name + "salary is" + salary * 12);
    }
    void calculatepay(String name,double workhours,double salary) {
        System.out.println(name + "salary is" + salary * workhours);
    }
}public class emplyeersSalary {
    public static  void main(String[] args) {
        employee Salary = new employee();
        Salary.calculatepay("ram", 30000l);
        Salary.calculatepay("goku", 8l, 300l);

    }
}