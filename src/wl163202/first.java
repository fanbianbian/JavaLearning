package wl163202;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("*************************************************************");
		System.out.println("warnig:ѧУ�涨�������5�Ż�5�����ϱ��޿β�����Ļ�����Ҫ������");
		System.out.println("*************************************************************");
		
		System.out.print("������ѧ��������");
		String name=scanner.nextLine();
		
		System.out.print("���������������γ�������");
		int num=scanner.nextInt();
		
		if(num>=5){
			System.out.println("����������Ϊ"+num+"��"+name+"��Ҫ����");
		}
		else{
			System.out.println("����������Ϊ"+num+"��"+name+"��Ҫ����");
		}
	}

}
