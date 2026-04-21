import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner digunakan untuk mengambil inputan dari user
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA STUDENT ===");

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        // Membuat object Student
        Student s = new Student(nama, alamat);

        System.out.print("Jumlah Mata Kuliah: ");
        int n = input.nextInt();
        input.nextLine(); // untuk membersihkan buffer

        // Input mata kuliah dan nilai
        for (int i = 0; i < n; i++) {
            System.out.print("Nama Mata Kuliah: ");
            String mk = input.nextLine();

            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();

            s.addCourseGrade(mk, nilai);
        }

        // Output data student
        System.out.println("\n" + s);
        s.printGrades();
        System.out.printf("Rata-rata: %.2f\n", s.getAverageGrade());

        System.out.println("\n=== INPUT DATA TEACHER ===");

        System.out.print("Nama: ");
        String tNama = input.nextLine();

        System.out.print("Alamat: ");
        String tAlamat = input.nextLine();

        Teacher t = new Teacher(tNama, tAlamat);

        System.out.print("Tambah Mata Kuliah: ");
        String mk = input.nextLine();


        t.addCourse(mk);

        // Output teacher
        System.out.println(t);
    }
}
