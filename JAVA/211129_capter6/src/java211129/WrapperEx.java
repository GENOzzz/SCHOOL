package java211129;
import java.util.Scanner;

public class WrapperEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(Character.toLowerCase('A')); //'A'�� �ҹ��ڷ� ��ȯ
		
		char c1='4',c2='F';
		if(Character.isDigit(c1))//���� c1�� �����̸� true
			System.out.println(c1+"�� ����");
		if(Character.isAlphabetic(c2))//����c2�� �������̸� true
			System.out.println(c2+"�� ������");
		
		System.out.println(Integer.parseInt("-123"));//"-123"�� 10������ ��ȯ
		System.out.println(Long.parseLong("1231213213312"));//int�� 2147483647������ ���尡��. ���� ū���� long�ʿ�
		System.out.println(Integer.toHexString(28));//���� 28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28));//���� 28�� 16���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28));//28�� ���� 2������ 1�� ����
		
		Double d=Double.valueOf(3.14);
		System.out.println(d.toString());//Double�� ���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14"));//���ڿ��� �Ǽ� 3.14�� ��ȯ
		
		boolean b=(4>3);
		System.out.println(Boolean.toString(b));//true�� ���ڿ� "true"�� ��ȯ
		System.out.println(Boolean.parseBoolean("false"));//���ڿ��� false�� ��ȯ
		
		Integer i=10;
		int ii=i;
		System.out.println(i);
		System.out.println(ii);
		
		String a="1234567890";
		System.out.println(a.substring(3));
		System.out.println(a.substring(3,7));
		System.out.println(a.substring(2).replace("6", "a"));
		a=a.replaceAll(a, "159745");
		System.out.println(a);
	}

}
