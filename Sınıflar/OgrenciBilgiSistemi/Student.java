package Sınıflar.OgrenciBilgiSistemi;

public class Student {
    String name;
    String stuNo;
    String classes;
    //nitelik olarak nesne tanımladık.
    Course course1;
    Course course2;
    Course course3;
    //
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3, int verbalNote1, int verbalNote2, int verbalNote3)
    {
        if(note1>=0 && note1<=100) {
            this.course1.note = note1;
        }
        if(note2>=0 && note2<=100) {
            this.course2.note = note2;
        }
        if(note3>=0 && note3<=100) {
            this.course3.note = note3;
        }
        if(verbalNote1>=0 && verbalNote1<=100){
            this.course1.verbalNote = verbalNote1;
        }
        if(verbalNote2>=0 && verbalNote2<=100){
            this.course2.verbalNote = verbalNote2;
        }
        if(verbalNote3>=0 && verbalNote3<=100){
            this.course3.verbalNote = verbalNote3;
        }

    }


    public void isPass(){
            this.avarage = (this.course1.note + this.course2.note + this.course3.note)/3.0;
          System.out.println("========================");
            if(this.avarage > 55){
                System.out.println("Hababam sınıfı uyanıyor ! ");
                isPass = true;
            }
            else {
                System.out.println("Habamam sınıfı sınıfta kaldı !");
                isPass = false;
            }

            printNote();

    }

    public void printNote(){

        System.out.println(course1.name + " Notu \t: " + course1.note);
        System.out.println(course2.name + " Notu \t: " + course2.note);
        System.out.println(course2.name + " Notu \t: " + course3.note);
        System.out.println("Ortalamanız : " + this.avarage);

    }
    public void calcAvarage(){

        this.avarage = (course1.note*0.80) + (course1.verbalNote*0.20);

        System.out.println(course1.name + " dersinin ortalaması " + this.avarage);

        this.avarage = (course2.note*0.80) + (course2.verbalNote*0.20);

        System.out.println(course2.name + " dersinin ortalaması " + this.avarage);

        this.avarage = (course3.note*0.80) + (course3.verbalNote*0.20);

        System.out.println(course3.name + " dersinin ortalaması " + this.avarage);

    }


}
