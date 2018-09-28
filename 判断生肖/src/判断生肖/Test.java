package 判断生肖;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入的您的出生年份");
		int year = Integer.parseInt(scanner.nextLine());
		String shenXiao;
		int key = (year - 1900)%12; //1900年是鼠年
		key = key>=0?key:12+key; //如果小于1900年则修正偏移量
		switch (key) { 
		case 0:
			shenXiao = "鼠";
			break;
		case 1:
			shenXiao = "牛";
			break;
		case 2:
			shenXiao = "虎";
			break;
		case 3:
			shenXiao = "兔";
			break;
		case 4:
			shenXiao = "龙";
			break;
		case 5:
			shenXiao = "蛇";
			break;
		case 6:
			shenXiao = "马";
			break;
		case 7:
			shenXiao = "羊";
			break;
		case 8:
			shenXiao = "猴";
			break;
		case 9:
			shenXiao = "鸡";
			break;
		case 10:
			shenXiao = "狗";
			break;
		default:
			shenXiao = "猪";
			break;
		}
		System.out.printf("您在%d年出生属%s! key = %d", year, shenXiao, key);
		scanner.close();
	}
}
