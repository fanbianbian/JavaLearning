package wl163202;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("刘子维的身高（cm）");
		double height=scanner.nextDouble();
		
		System.out.print("刘子维的体重（kg）");
		double weight=scanner.nextDouble();
		
		if(height>=172 && weight<=63){
			System.out.print("接受");
		}
		else{
			System.out.print("不接受");
		}
		
	}

}
