package wl163202;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("������ѧ��������");
		String xingming=scanner.nextLine();
		
		System.out.print("������Photoshop�γ̳ɼ���");
		int ps=scanner.nextInt();
		
		System.out.print("������˼�޿γ̳ɼ���");
		int sx=scanner.nextInt();
		
		System.out.print("�����������γ̳ɼ���");
		int ty=scanner.nextInt();
		
		System.out.print("�ܷ�");
		int zf=ps+sx+ty;
	}

}
