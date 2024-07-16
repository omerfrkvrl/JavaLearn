package BoksMatch;

public class Ring {
    Figther f1;
    Figther f2;
    int minWeight;
    int maxWeight;

    public Ring(Figther f1, Figther f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public void run() {
        if (checkWeight()){
            while(this.f1.health >0 && this.f2.health > 0){
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor");
        }
    }
    public boolean isWin(){
        if(this.f1.health == 0){
            System.out.println("Maçı Kazanan: "+ this.f2.name);
            return true;
        } else if( this.f2.health == 0){
            System.out.println("Maçı Kazanan: "+ this.f1.name);
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println("----------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }
}
