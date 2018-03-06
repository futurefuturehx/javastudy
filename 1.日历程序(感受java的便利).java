//java最重要的是获知状态 或者 改变状态
//其次是要知道对象能调用哪些方法来获得状态
//最后记住每个对象都有唯一的表示
package study;
import java.time.*;
public class CalendarTest {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();//先构造初始化 然后调用方法
		int month=date.getMonthValue();
		int today=date.getDayOfMonth();//获得当前月份和当前月的日
		date=date.minusDays(today-1);//用总的日减去当前月的日 将date设置到当前月的第一天
		DayOfWeek weekday=date.getDayOfWeek();//获知第一天是星期几
		int value=weekday.getValue();//获得这个值
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");//打印表头
		for(int i=1;i<value;i++){
			System.out.print(" ");
		}//“星期几”之前全是空格
		while(date.getMonthValue()==month) {//在当前月的范围里
			System.out.printf("%3d",date.getDayOfMonth());//获知日
			if(date.getDayOfMonth()==today) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}//如果是今日 打上*号 如果不是 打上空格
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue()==1)
				System.out.println();
			}//当当前日期是星期7的时候换行
		if(date.getDayOfWeek().getValue()!=1)
			System.out.println();
	}
}
