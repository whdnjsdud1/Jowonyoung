// 1�� �ּ���

/*
	������
	�ּ���
*/

/**
	����ȭ �ּ�
	-->javadoc �� �̿��ؼ� API ������ ���鶧 ����Ѵ�.
*/

// ==== *** CLASS(Ŭ����)�� ����*** -----
/*
	CLASS(Ŭ����)�� ��� ���ø����̼� ���۽� �ʿ��� ���赵�� �̶�� ��������.

	1.��Ű�� ����
		==>��Ű���� Ŭ������ ����Ǿ��� ���丮 ��ζ�� ���� �ȴ�.
		
		package ��Ű���� ; ==> ��Ű������ �ݵ�� �ҹ��ڷ� �����ؾ� �Ѵ�.

		��> package my.com;
	

	2.import ��

		��> import ��Ű����.Ŭ������;

		import java.lang.String;
		import java.lang.System;
		import java.lang.*;

	3.Ŭ���� ����

	4.�������ϱ�

	5.�����ϱ�
*/

import java.lang.String;
import java.lang.System;
import java.util.Date;

public class Hello
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Java!");
		System.out.println("�ȳ��ϼ���? �ݰ����ϴ�.~~^^");
		//System.out �� ����͸� ����.
		//System.out.println("���ڿ�"); �� ������ �� �ڵ������� �ٹٲ��� �Ͼ.
		
		System.out.print("hi java");
		System.out.print("������ �սô�.");
		System.out.print("\n���� �ڹٸ� �����մϴ�.");
		// \n �� ���� �ٲ��� ���Ѵ�.
		System.out.println("");

		System.out.println(new Date());
		//���糯¥�� ��Ÿ���� ����.
		// new Date() �� ���� �ý����� ��¥�ð��� ������ ���̴�.
	}
}

/*
c:\myjava\day1>javac Hello.java
(����� ������)
Hello.class �� ����
c:\myjava\day1>java Hello

*/