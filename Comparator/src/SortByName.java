import java.util.Comparator;

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //sorts in ascending order
        return o1.getName().compareTo(o2.getName());
    }
}