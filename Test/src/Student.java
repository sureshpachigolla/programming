
public class Student {
	public int rollNum;
	public String name;
	public int marks;
	public String studentAddress;
	
	public Student(Student student){
		this.rollNum = student.rollNum;
		this.name = student.name;
		this.marks = student.marks;
		this.studentAddress = student.studentAddress;
	}
	
	public Student(int rollNum, String name, int marks, String studentAddress){
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
		this.studentAddress = studentAddress;
	}
	
	public Student(String name){
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
