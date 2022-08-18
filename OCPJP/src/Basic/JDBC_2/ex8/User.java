package Basic.JDBC_2.ex8;

public class User {
	private int id;
	private String account;
	private String pass;
	public User(int id,String account, String pass) {
		super();
		this.id=id;
		this.account = account;
		this.pass = pass;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", account=" + account + ", pass=" + pass + "]";
	}
	
	
}
