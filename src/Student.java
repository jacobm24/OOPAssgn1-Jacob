public class Student {
    public String student_name;
    public int a1_mark;
    public int a2_mark;

    public Student(String student_name, int a1_mark, int a2_mark) {
        this.student_name = student_name;
        this.a1_mark = a1_mark;
        this.a2_mark = a2_mark;
    }

    public void print_average_grade() {
        int mark_total = a1_mark + a2_mark;
        int average_mark = mark_total / 2;
    }
}
