package wl163202;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����һ�����֣�");
		int num1=scanner.nextInt();
		
		System.out.print("������һ�����֣�");
		int num2=scanner.nextInt();
		
		if(num1>num2){
			System.out.print(""+num1+"");
		}
		if(num1<num2){
			System.out.print(""+num2+"");
		}
	}

}
