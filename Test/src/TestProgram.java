import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProgram {
	
	public void testFun(Student student){
		student = new Student("suresh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		int[] salary;
		
		salary = new int[10];
		
		Student student = new Student("sidhu");
		
		System.out.println(student.name);
	}

}
