package wl163202;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����ά����ߣ�cm��");
		double height=scanner.nextDouble();
		
		System.out.print("����ά�����أ�kg��");
		double weight=scanner.nextDouble();
		
		if(height>=172 && weight<=63){
			System.out.print("����");
		}
		else{
			System.out.print("������");
		}
		
	}

}
