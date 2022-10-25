import java.util.Arrays;

final class Student extends Person {
    private String[] courses = new String[10];
    private int[] grade = new int[10];
    private int numCourse = 0;

    protected Student(String name, String address) {
        super(name, address);
    }

    protected void addCourseGrade(String course, int grade) {
        boolean status = false;
        if (numCourse < 10) {
            for (int i = 0; i < this.numCourse; i++) {
                if (this.courses[i].equals(course)) {
                    System.out.println("Data nilai sudah ada!");
                    status = true;
                    break;
                }
            }
            if (!status) {
                this.courses[this.numCourse] = course;
                this.grade[this.numCourse] = grade;
                ++this.numCourse;
            }
        } else {
            System.out.println("Gagal menambahkan!");
        }
    }

    protected void printGrades() {
        if (numCourse > 0) {
            System.out.print("Print Grades : ");
            for (int i = 0; i < this.numCourse; i++) {
                System.out.print(this.courses[i] + ":" + this.grade[i] + " ");
            }
            System.out.print("\n");
        } else {
            System.out.println("Belum ada nilai\n");
        }
    }

    protected double getAverageGrade() {
        double average = 0;
        for(int i = 0; i < this.numCourse; i++){
            average += this.grade[i];
        }
        return average/this.numCourse;
    }

    public String toString() {
        return super.toString() + "\nJumlah pelajaran yang diikuti : " +
                this.numCourse + "\nNilai rata-rata : "
                + getAverageGrade() + "\nMata pelajaran yang diikuti : " +
                Arrays.toString(courses);
    }
}