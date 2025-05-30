import java.util.ArrayList;
import java.util.List;

public class School {  // School sınıfı, okul yönetimini temsil eder
    private List<Student> students = new ArrayList<>();  // Öğrencileri tutacak bir liste

    // Öğrenci ekleyen metot
    public void addStudent(Student student) {
        students.add(student);
    }

    // Öğrenci silen metot (id'ye göre)
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    // Öğrencileri listeleyen metot
    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);  // Her öğrenci nesnesini yazdırıyoruz
        }
    }

    // Ana metod (main) - uygulamayı başlatan kısım
    public static void main(String[] args) {
        School school = new School();  // Yeni okul nesnesi oluşturuyoruz

        // Öğrenciler ekliyoruz
        school.addStudent(new Student(1, "Ahmet", "Yılmaz"));
        school.addStudent(new Student(2, "Ayşe", "Kara"));

        // Öğrencileri listele
        school.listStudents();

        // Ahmet'i sil
        school.removeStudent(1);

        // Öğrencileri tekrar listele
        school.listStudents();
    }
}
