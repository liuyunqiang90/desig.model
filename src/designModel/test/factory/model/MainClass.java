package designModel.test.factory.model;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("请输入参数1...");
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.nextLine();
		System.out.println("请输入操作符...");
		String oper = scanner.nextLine();
		System.out.println("请输入参数2...");
		String num2 = scanner.nextLine();
		double num11 = Double.parseDouble(num1);
		double num12 = Double.parseDouble(num2);
		double result = 0;
		/*if("+".equals(oper)){
			result = num11 + num12;
			System.out.println(num11 + "+" + num12 + "=" + result);
		}else if ("-".equals(oper)) {
			result = num11 - num12;
			System.out.println(num11 + "-" + num12 + "=" + result);
		}*/
		if("+".equals(oper)){
			AddFactory addFactory = new AddFactory();
			Operate operate = addFactory.getOperate();
			result = operate.getResult(num1,num2);
			System.out.println(num11 + "+" + num12 + "=" + result);
		}else if ("/".equals(oper)) {
			DivisionFactory divisionFactory = new DivisionFactory();
			Operate operate = divisionFactory.getOperate();
			operate.getResult(num1, num2);
			System.out.println(num11 + "/" + num12 + "=" + result);
		}
		
	}
}
