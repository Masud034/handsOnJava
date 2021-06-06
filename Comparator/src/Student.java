import java.util.Comparator;

public class Student implements Comparable<Student>{

    private String name;
    private int roll;
    private int totalMarks;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public Student(){

    }
    public Student(String name, int roll, int totalMarks) {
        this.name = name;
        this.roll = roll;
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", totalMarks=" + totalMarks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotalMarks() == o.getTotalMarks()){
            //if total marks is same then sort  by roll
            return this.getRoll() - o.getRoll();
        }
        return o.getTotalMarks() - this.getTotalMarks();
    }
}
