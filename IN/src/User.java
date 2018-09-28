public class User {
	private String userName;
	private String passWord;
	
	public boolean logIN(String _passWord)
	{
		if (this.passWord != _passWord) {
			return false;
		}else {
			return true;
		}
	}
	
	public User(String _userName, String _passWord)
	{
		this.setUserName(_userName);
		this.setPassWord(_passWord);
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
