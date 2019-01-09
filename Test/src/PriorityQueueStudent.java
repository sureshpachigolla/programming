import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStudent {

	public static void main(String[] args) {
		
		PriorityQueue<Student> pQueueStudent = new PriorityQueue<Student>(10, new StudentComparator()); 
		
		pQueueStudent.add(new Student(1,"suresh",90,"dallas"));
		pQueueStudent.add(new Student(2,"sneha",92,"dallas"));
		pQueueStudent.add(new Student(4,"sidhu",95,"sfo"));
		pQueueStudent.add(new Student(3,"steve",80,"sfo"));
		pQueueStudent.add(new Student(5,"john",70,"sfo"));
		pQueueStudent.add(new Student(9,"raju",98,"sfo"));
        
		while(!pQueueStudent.isEmpty()){
			System.out.println(pQueueStudent.poll().getRollNum());
			
		}
		
		

	}
	
	public static class StudentComparator implements Comparator<Student>{
		public int compare(Student s1, Student s2) { 
            if (s1.marks < s2.marks) 
                return 1; 
            else if (s1.marks > s2.marks) 
                return -1; 
            return 0; 
            } 
	}
	

}
