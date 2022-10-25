import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, address, course;
        int grade, a = 0;
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");
            System.out.print("Pilih menu : ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        name = input.next();
                        System.out.print("Masukkan alamat : ");
                        address = input.next();
                        Student student = new Student(name, address);
                        while (true) {
                            System.out.println("Menu : ");
                            System.out.println("1. Add Course Grade");
                            System.out.println("2. Print Grades");
                            System.out.println("3. Get Average Grade");
                            System.out.println("4. Exit");
                            System.out.print("Pilih menu : ");
                            a = input.nextInt();
                            switch (a) {
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
                                    System.out.println("Keluar dari menu student");
                                    break;
                                default:
                                    System.out.println("Menu tidak tersedia!");
                            }
                            if (a == 4) {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        name = input.next();
                        System.out.print("Masukkan alamat : ");
                        address = input.next();
                        Teacher teacher = new Teacher(name, address);
                        while (true) {
                            System.out.println("Menu : ");
                            System.out.println("1. Add Course");
                            System.out.println("2. Remove Course");
                            System.out.println("3. Exit");
                            System.out.print("Pilih menu : ");
                            a = input.nextInt();
                            switch (a) {
                                case 1:
                                    System.out.print("Masukkan mata pelajaran : ");
                                    course = input.next();
                                    System.out.println(teacher.addCourse(course));
                                    break;
                                case 2:
                                    System.out.print("Masukan mata pelajaran : ");
                                    course = input.next();
                                    System.out.println(teacher.removeCourse(course));
                                    break;
                                case 3:
                                    System.out.println("Keluar dari menu teacher");
                                    break;
                                default:
                                    System.out.println("Menu tidak tersedia!");
                            }
                            if (a == 3) {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                    case 3:
                        System.out.println("Keluar dari program");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Menu tidak tersedia!");
            }
            input.close();
        }
    }
}