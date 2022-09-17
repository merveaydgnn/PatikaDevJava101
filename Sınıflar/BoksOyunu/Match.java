package Sınıflar.BoksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run()
    {
        if(this.isCheck()){
            while(this.f1.health>0 && this.f2.health>0)
            {
                double sans = Math.random() * 100;
                System.out.println("======YENİ ROUND======");
                if (sans < 50) {
                    this.f2.health = this.f1.hit(f2);
                } else {
                    this.f1.health = this.f2.hit(f1);
                }

                System.out.println(this.f1.name + " sağlık  : " + this.f1.health);
                System.out.println(this.f2.name + " sağlık : " + this.f2.health);

                if(isWin()){
                    break;
                }
            }
        }
        else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    public boolean isCheck(){

        //müsabakaya girmek için;
        return (this.f1.weigth>=minWeight && this.f1.weigth<=maxWeight) &&
                (this.f2.weigth>=minWeight && this.f2.weigth<=maxWeight);
    }

    boolean isWin(){
        if(this.f1.health ==0) {
            System.out.println(this.f2.name + " kazandı.");
            return true;
       }
        if(this.f2.health ==0) {
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }

        return false;
    }
}
