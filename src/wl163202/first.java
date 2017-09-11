package wl163202;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("*************************************************************");
		System.out.println("warnig:学校规定，如果有5门或5门以上必修课不及格的话，就要留级。");
		System.out.println("*************************************************************");
		
		System.out.print("请输入学生姓名：");
		String name=scanner.nextLine();
		
		System.out.print("请输入该生不及格课程门数：");
		int num=scanner.nextInt();
		
		if(num>=5){
			System.out.println("不及格门数为"+num+"，"+name+"需要留级");
		}
		else{
			System.out.println("不及格门数为"+num+"，"+name+"需要留级");
		}
	}

}
