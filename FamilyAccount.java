package javadome;

import java.util.Scanner;

public class FamilyAccount {

	public static void main(String[] args) {

		boolean isFalg = true;

		// 定义收支详情
		String details = "收支\t账户余额\t交易金额\t说明\n";

		// 定义一个初始金额
		int balance = 0;// 账户余额初始金额

		while (isFalg) {

			System.out.println("-------------------家庭收支记账软件-------------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退   出");
			System.out.print("                   请选择(1-4):");

			// 获取用户的选择:1-4
			char selection = Utility.readMenuSelection();// 调用Utility文件
			switch (selection) {
			/* 收支明细模块 */
			case '1':
//				System.out.println("1 收支详细");
				System.out.println("-------------------当前收支明细-------------------");
				System.out.println(details);
				System.out.println("----------------------------------------------");
				break;
			/* 登记收入模块 */
			case '2':
//				System.out.println("2 登记收入");
				System.out.print("本次收入金额:");
				int addMoney = Utility.readNumber();//调用Utility文件收入方法
				System.out.print("本次收入说明:");
				String addInfo = Utility.readString();// 调用Utility文件

				// 处理balanes
				balance += addMoney;// balance = balance + money 初始金额加上登记金额

				// 处理details变量
				details += "收入\t" + balance + "\t" + addMoney + "\t" + addInfo + "\n";
				System.out.println("-------------------登记完成-------------------");

				break;
			/* 登记支出模块 */
			case '3':
//				System.out.println("3 登记支出");
				System.out.print("本次支出金额:");
				int minusMoney = Utility.readNumber();
				System.out.print("本次支出说明:");
				String minusInfo = Utility.readString();

				// 处理balanes
				if (balance >= minusMoney) {
					balance -= minusMoney;// balance = balance - money 余额减去支出金额
					// 处理details
					details += "支出\t" + balance + "\t" + minusMoney + "\t" + minusInfo + "\n";
				} else {
					System.out.println("您的账户余额不足,支付失败");
				}
				System.out.println("-------------------登记完成-------------------");

				break;
			/* 退出模块 */
			case '4':
//				System.out.println("4 退   出");
				System.out.println("是否要退出(Y/N):");
				char isExit = Utility.readConfirmSelection();// 调用Utility
				if (isExit == 'Y') {
					isFalg = false;
				}
			}
		}
	}
}