package wl163202;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("请输入学生姓名：");
		String xingming=scanner.nextLine();
		
		System.out.print("请输入Photoshop课程成绩：");
		int ps=scanner.nextInt();
		
		System.out.print("请输入思修课程成绩：");
		int sx=scanner.nextInt();
		
		System.out.print("请输入体育课程成绩：");
		int ty=scanner.nextInt();
		
		System.out.print("总分");
		int zf=ps+sx+ty;
	}

}
