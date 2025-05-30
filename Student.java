public class Student {
    private int id;
    private String name;
    private String surname;

    // Constructor
    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // Getter ve setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // ToString metodunu override ederek öğrenci bilgilerini yazdırıyoruz
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
