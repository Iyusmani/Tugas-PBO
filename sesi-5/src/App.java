import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, address, course;
        int grade, a = 0;
        while (a == 0) {
            System.out.println("Pilih Menu : ");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    name = input.next();
                    System.out.print("Masukkan alamat : ");
                    address = input.next();
                    Student student = new Student(name, address);
                    System.out.println("1. Add Course Grade");
                    System.out.println("2. Print Grades");
                    System.out.println("3. Get Average Grade");
                    System.out.println("4. Exit");
                    System.out.print("Pilih : ");
                    int pilih1 = input.nextInt();
                    switch (pilih1) {
                        case 1:
                            System.out.print("Masukkan mata pelajaran : ");
                            course = input.next();
                            System.out.print("Masukkan nilai : ");
                            grade = input.nextInt();
                            student.addCourseGrade(course, grade);
                            break;
                        case 2:
                            student.printGrades();
                            break;
                        case 3:
                            System.out.println("Nilai rata-rata : " + student.getAverageGrade());
                            break;
                        case 4:
                            a = 1;
                            break;
                        default:
                            System.out.println("Pilihan tidak ada!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama : ");
                    name = input.next();
                    System.out.print("Masukkan alamat : ");
                    address = input.next();
                    Teacher teacher = new Teacher(name, address);
                    System.out.println("1. Add Course");
                    System.out.println("2. Remove Course");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Masukkan mata pelajaran : ");
                            course = input.next();
                            teacher.addCourse(course);
                            break;
                        case 2:
                            System.out.println("Masukan mata pelajaran :");
                            course = input.next();
                            teacher.removeCourse(course);
                            break;
                        case 3:
                            a = 1;
                            break;
                        default:
                            System.out.println("Pilihan tidak ada!");
                            break;
                    }
                    break;
                case 3:
                    a = 1;
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }
            input.close();
        }
    }
}