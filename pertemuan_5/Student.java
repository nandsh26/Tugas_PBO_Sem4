public class Student extends Person {

    // Menyimpan jumlah mata kuliah yang diambil
    private int numCourses = 0;

    // Array untuk menyimpan nama mata kuliah dan nilai
    private String[] courses = new String[10];
    private int[] grades = new int[10];

    // Constructor memanggil constructor parent (Person)
    public Student(String name, String address) {
        super(name, address);
    }

    // Method untuk menambahkan mata kuliah beserta nilainya
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Menampilkan semua nilai yang dimiliki mahasiswa
    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    // Menghitung rata-rata nilai
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    // Override method toString dari class Person
    public String toString() {
        return "Student: " + super.toString();
    }
}
