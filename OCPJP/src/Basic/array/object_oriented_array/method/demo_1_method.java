package Basic.array.object_oriented_array.method;

public class demo_1_method {
	private String name;
	private int num;
	private String classroom;
	public demo_1_method() {
		
	}
	public demo_1_method(String name, int num, String classroom) {
		super();
		this.name = name;
		this.num = num;
		this.classroom = classroom;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getClassroom() {
		return classroom;
	}


	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}


	@Override
	public String toString() {
		return "demo_1_method [name=" + name + ", num=" + num + ", classroom=" + classroom + "]";
	}
	
}
	