import java.util.Comparator;

public class SortByTotalMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //Sorts in descending order
        return o2.getTotalMarks() - o1.getTotalMarks();
    }
}
