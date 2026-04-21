public class Teacher extends Person {

    // Menyimpan jumlah mata kuliah yang diajar
    private int numCourses = 0;

    // Array untuk menyimpan daftar mata kuliah
    private String[] courses = new String[10];

    // Constructor memanggil parent
    public Teacher(String name, String address) {
        super(name, address);
    }

    // Menambahkan mata kuliah (tidak boleh duplikat)
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // sudah ada
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    // Menghapus mata kuliah jika ada
    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {

                // Geser array ke kiri setelah data dihapus
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }

                numCourses--;
                return true;
            }
        }
        return false; // tidak ditemukan
    }

    // Override method toString
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
