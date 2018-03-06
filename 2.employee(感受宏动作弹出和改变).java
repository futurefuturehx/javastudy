package study;

import java.time.LocalDate;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[]staff = new Employee[3];
    //类作为一种类型使用 因为定义一个类就相当于定义了一种新的引用数据类型
		staff[0]=new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1]=new Employee("Harry Hacker", 5000, 1989, 10, 1);
		staff[2]=new Employee("Tony Tester", 4000, 1990, 3, 15);
		for (Employee e:staff) {
			e.raiseSalary(5);
		}
		for(Employee e:staff) {
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
		}
	}
}
class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	public Employee(String n,double s,int year,int month,int day) {
		name=n;
		salary=s;
		hireDay=LocalDate.of(year, month, day);
	}//从调用处接收 输出到成员变量
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}//宏动作之弹出
	public void raiseSalary(double byPercent) {//这里设置形参为百分比 以百分比的形式修改工资
		double raise=salary*byPercent/100;
		salary+=raise;
	}//宏动作之改变
}
