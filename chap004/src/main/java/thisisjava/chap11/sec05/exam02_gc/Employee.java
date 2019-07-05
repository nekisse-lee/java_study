package thisisjava.chap11.sec05.exam02_gc;

public class Employee {
    public int eno;

    public Employee(int eno) {
        this.eno = eno;
        System.out.println(eno + "이 메모리에 생섬됨");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee(" + eno + ")이 메모리에서 제거됨");
    }
}
