public class Student {  // Student sınıfı, öğrenci bilgilerini tutar
    private int id;  // Öğrencinin id'si
    private String name;  // Öğrencinin ismi
    private String surname;  // Öğrencinin soyismi

    // Constructor (yapıcı metod) - Öğrenciyi yaratırken id, isim ve soyisim alır
    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // Getter metotları (id, name, surname bilgilerini almak için)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Öğrenci bilgilerini düzgün bir şekilde yazdırabilmek için toString metodu
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
