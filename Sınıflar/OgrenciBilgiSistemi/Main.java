package Sınıflar.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "90589654", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "526398", "FZK");
        Teacher t3 = new Teacher("Merve", "05639745", "BIO");

        Course tarih = new Course("Tarih", "101",  "TRH");
        tarih.addteacher(t1);

        Course fizik = new Course("Fizik", "102",  "FZK");
        fizik.addteacher(t2);

        Course bio = new Course("Biyoloji", "103",  "BIO");
        bio.addteacher(t3);

        Student s1 = new Student("Merve Aydoğan", "5263","10", tarih, fizik, bio);
        s1.addBulkExamNote(60,100,50,90,80, 54);
        s1.isPass();
        s1.calcAvarage();
        Student s2 = new Student("Melek Aydoğan", "8596","11", tarih, fizik, bio);
        s2.addBulkExamNote(50,24,65,55, 65,85);
        s2.isPass();
        Student s3 = new Student("Sezer Aydoğan", "7412","12", tarih, fizik, bio);


    }
}
