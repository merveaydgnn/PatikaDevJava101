package Sınıflar.OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String mpno;  //my phone

    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print()
    {
        System.out.println("Name   \t: " + this.name);
        System.out.println("Phone  \t: " + this.mpno);
        System.out.println("Branch \t: " + this.branch);
    }
}
