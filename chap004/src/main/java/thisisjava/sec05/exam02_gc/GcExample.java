package thisisjava.sec05.exam02_gc;

public class GcExample {
    public static void main(String[] args) {

        Employee emp;
        emp = new Employee(1);
        emp = null;

        emp = new Employee(2);
        emp = new Employee(3);

        System.out.print("최종 emp 번호: " );
        System.out.println(emp.eno);

        System.gc();

    }
}
