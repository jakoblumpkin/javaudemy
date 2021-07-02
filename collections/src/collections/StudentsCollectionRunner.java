package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
    public int compare(Student student1, Student student2) {

    	return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> Students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"), new Student(10, "Jakob"));
		List<Student> studentsAl = new ArrayList<>(Students);

        System.out.println(studentsAl);
        
        Collections.sort(studentsAl);
        System.out.println("Asc" + studentsAl);
        

        
        studentsAl.sort(new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator " + studentsAl);
	}

}
