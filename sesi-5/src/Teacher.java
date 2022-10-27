import java.util.Arrays;

final class Teacher extends Person {
    private int numCourse = 0;
    private String[] courses = new String[8];

    protected Teacher(String name, String address) {
        super(name, address);
    }

    private boolean cekCourse(String course) {
        boolean status = false;
        for (int i = 0; i < this.numCourse; i++) {
            if (this.courses[i].equals(course)) {
                status = true;
            }
        }
        return status;
    }

    protected boolean addCourse(String course) {
        boolean status = false;
        if (!cekCourse(course) && numCourse < 8) {
            this.courses[this.numCourse] = course;
            this.numCourse++;
            status = true;
        }
        return status;
    }

    protected boolean removeCourse(String course) {
        boolean status = false;
        int a = 0;
        if (cekCourse(course) && this.numCourse != 0) {
            for (int i = 0; i < this.numCourse; i++) {
                if (this.courses[i].equals(course)) {
                    a = i;
                }
            }
            for (int i = a; i < this.numCourse - 1; i++) {
                this.courses[i] = this.courses[i + 1];
            }
            this.numCourse--;
            status = true;
        }
        return status;
    }

    public String toString() {
        return super.toString() + "\nJumlah mata pelajaran yang di ampu : " + this.numCourse
                + "\nMata pelajaran yang diampu : " + Arrays.toString(courses);
    }
}
