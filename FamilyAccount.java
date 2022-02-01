package javadome;

import java.util.Scanner;

public class FamilyAccount {

	public static void main(String[] args) {

		boolean isFalg = true;

		// ������֧����
		String details = "��֧\t�˻����\t���׽��\t˵��\n";

		// ����һ����ʼ���
		int balance = 0;// �˻�����ʼ���

		while (isFalg) {

			System.out.println("-------------------��ͥ��֧�������-------------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��   ��");
			System.out.print("                   ��ѡ��(1-4):");

			// ��ȡ�û���ѡ��:1-4
			char selection = Utility.readMenuSelection();// ����Utility�ļ�
			switch (selection) {
			/* ��֧��ϸģ�� */
			case '1':
//				System.out.println("1 ��֧��ϸ");
				System.out.println("-------------------��ǰ��֧��ϸ-------------------");
				System.out.println(details);
				System.out.println("----------------------------------------------");
				break;
			/* �Ǽ�����ģ�� */
			case '2':
//				System.out.println("2 �Ǽ�����");
				System.out.print("����������:");
				int addMoney = Utility.readNumber();//����Utility�ļ����뷽��
				System.out.print("��������˵��:");
				String addInfo = Utility.readString();// ����Utility�ļ�

				// ����balanes
				balance += addMoney;// balance = balance + money ��ʼ�����ϵǼǽ��

				// ����details����
				details += "����\t" + balance + "\t" + addMoney + "\t" + addInfo + "\n";
				System.out.println("-------------------�Ǽ����-------------------");

				break;
			/* �Ǽ�֧��ģ�� */
			case '3':
//				System.out.println("3 �Ǽ�֧��");
				System.out.print("����֧�����:");
				int minusMoney = Utility.readNumber();
				System.out.print("����֧��˵��:");
				String minusInfo = Utility.readString();

				// ����balanes
				if (balance >= minusMoney) {
					balance -= minusMoney;// balance = balance - money ����ȥ֧�����
					// ����details
					details += "֧��\t" + balance + "\t" + minusMoney + "\t" + minusInfo + "\n";
				} else {
					System.out.println("�����˻�����,֧��ʧ��");
				}
				System.out.println("-------------------�Ǽ����-------------------");

				break;
			/* �˳�ģ�� */
			case '4':
//				System.out.println("4 ��   ��");
				System.out.println("�Ƿ�Ҫ�˳�(Y/N):");
				char isExit = Utility.readConfirmSelection();// ����Utility
				if (isExit == 'Y') {
					isFalg = false;
				}
			}
		}
	}
}