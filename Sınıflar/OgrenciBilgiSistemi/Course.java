package Sınıflar.OgrenciBilgiSistemi;

public class Course {
    //sınıflar birbirinin niteliği olarak kulanılabilir.
    //Burada Teacher sınıfından teacher nesnesini nitelik olarak kullanacağız.
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addteacher(Teacher teacher)
    {
        if(teacher.branch.equals((this.prefix)))
        {
            this.teacher = teacher;
            printTeacherInfo();
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }

    public void printTeacherInfo()
    {
        this.teacher.print();
    }
}
