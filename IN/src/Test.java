import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		User userList[] = intin();
		String userName,passWord;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<3;i++)
		{
			System.out.print("请输入账户名:\n>>");
			userName = scanner.nextLine();
			System.out.print("请输入密码:\n>>");
			passWord = scanner.nextLine();
			int j;
			for (j = 0; j < userList.length - 1; j++) {
				if (userList[j].getUserName().equals(userName)) {
					if (userList[j].logIN(passWord)) {
						System.out.println("登陆成功");
						break;
					} else {
						System.out.println("密码错误");
						break;
					}
				}
			}
			if (j < userList.length) {
				System.out.println("用户名不存在");
			}
			System.out.println("\t 你还有" + (3-i) +"次机会!");
			
		}
		scanner.close();
	}
	
	private static User[] intin()
	{
		User userList[] = new User[5];
		userList[0] = new User("user1", "password");
		userList[1] = new User("user2", "password");
		userList[2] = new User("user3", "password");
		userList[3] = new User("user4", "password");
		userList[4] = new User("user5", "password");
		return userList;
	}
}