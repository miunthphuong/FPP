package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> map = new HashMap<>();
		students.forEach(student -> {
			String firstName = student.getFirstName();
			String lastName = student.getLastName();

			Key key = new Key(firstName, lastName);
			map.put(key, student);
		});
		return map;
	}
}
