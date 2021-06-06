import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Smith",50, 88));
        students.add(new Student("xavier", 45, 90));
        students.add(new Student("John", 60, 88));

        students.sort(null);
        //Collections.sort(students,new SortByRoll());
        //students.sort(new SortByName());
        //Collections.sort(students,new SortByTotalMarks());

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
