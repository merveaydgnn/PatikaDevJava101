package Sınıflar.MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //vergi
    public double tax()
    {
        double tax;
        if(this.salary < 1000){
            return 0;
        }
        else{
          tax  = this.salary*0.03;
            return tax;
        }

    }

    public double bonus(){
        int bonus=0;
        if(this.workHours>40)
        {
           bonus = (workHours - 40)*30;
        }
       return bonus;
    }

    public double raiseSalary(){

        int workYear;
        double raise;
        workYear = 2021-this.hireYear;
        if(workYear <10)
        {
            raise = this.salary*0.03;
            return raise;
        }
        else if(workYear>9 && workYear<20){
            raise = this.salary*0.10;
            return raise;
        }
        else if(workYear>19){
            raise = this.salary*0.15;
            return raise;
        }
        return 0;
    }

    public String toString()
    {
        double total = this.salary - tax() + bonus() + raiseSalary();
        double total2 = this.salary - tax() + bonus();
        System.out.println("Adı \t:" + this.name);
        System.out.println("Maaşı \t: " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi \t:" + tax());
        System.out.println("Bonus \t: " + bonus());
        System.out.println("Maaş Artışı \t:" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + total2);
        System.out.println("Toplam maaş \t: " + total);
        return null;
    }
}

