public class App {
    public static void main(String[] args) {
        Student siswa1 = new Student("Rizal", "Simpang");
        siswa1.addCourseGrade("Matematika", 90);
        siswa1.addCourseGrade("PAI", 90);
        siswa1.addCourseGrade("PKN", 90);
        siswa1.addCourseGrade("Kimia", 90);
        siswa1.addCourseGrade("Fisika", 90);
        siswa1.addCourseGrade("Biologi", 90);
        System.out.println(siswa1);
        System.out.println();
        Teacher guru1 = new Teacher("Mamat", "Citatih");
        guru1.addCourse("Matematika");
        guru1.addCourse("PAI");
        System.out.println(guru1);
    }    
}
