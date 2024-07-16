package BoksMatch;

public class Figther {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Figther(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;

    }
    public int hit(Figther foe){
        System.out.println("--------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar vurdu");

        if (foe.isDodge()){
            System.out.println(foe.name + " Gelen hasarı savurdu." + " Kalan Can \t:" + foe.health);
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean isDodge(){
        double randomValue = Math.random()*100 ; // 0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
