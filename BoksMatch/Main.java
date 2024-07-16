package BoksMatch;

public class Main {
    public static void main(String[] args) {
        Figther marc = new Figther("Marc", 15,100,90,0);
        Figther alex = new Figther("Alex", 10,95,100,40);

        Ring r = new Ring(marc, alex, 90, 100);
        r.run();

    }
}
