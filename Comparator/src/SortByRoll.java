import java.util.Comparator;

class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //Sorts in ascending order
        return o1.getRoll() - o2.getRoll();
    }
}