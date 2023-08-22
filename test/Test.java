package test;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	private static  class Student{
		private String name;
		private int score;
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getScore() {
			return this.score;
		}
		
		public void setScore(int score) {
			this.score = score;
		}
		
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", score=" + score + "]";
		}
		
		
		
		
	}
	
	public static List<Student> getStudentsSorted(List<Student> list){
		return list.stream()
		.map((std)-> new Student(std.getName(), std.getScore() + 1))
		.filter((elem)-> elem.getScore() > 15)
		.sorted((e1, e2)-> e2.getScore() - e1.getScore())
		.collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		List<Student> list = List.of(
				new Student("Asgar", 10),
				new Student("Ali", 20),
				new Student("Rehan", 30));
		
		
		for(Student st: getStudentsSorted(list)) {
			System.out.println(st);
		}
		
	}
}
