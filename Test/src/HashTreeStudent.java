import java.util.HashMap;
import java.util.TreeMap;

public class HashTreeStudent {
	public static void main(String args[]){
		HashMap<Integer, Student> hashmap = new HashMap<>();
		
		hashmap.put(1, new Student(1,"suresh",90,"dallas"));
		hashmap.put(2, new Student(2,"sneha",92,"dallas"));
		hashmap.put(3, new Student(3,"sidhu",95,"sfo"));
		
		for (Integer i:hashmap.keySet()){
			System.out.println(i);
		}
		
		for (Student i:hashmap.values()){
			System.out.println(i.rollNum + " " + i.name + " " + i.marks + " " + i.studentAddress);
		}
		
		TreeMap<Integer, Student> treemap = new TreeMap<>();
		
		treemap.put(1, new Student(1,"suresh",90,"dallas"));
		treemap.put(2, new Student(2,"sneha",92,"dallas"));
		treemap.put(3, new Student(3,"sidhu",95,"sfo"));
		
		for (Integer i:treemap.keySet()){
			System.out.println(i);
		}
		
		for (Student i:treemap.values()){
			System.out.println(i.rollNum + " " + i.name + " " + i.marks + " " + i.studentAddress);
		}
	}

}
