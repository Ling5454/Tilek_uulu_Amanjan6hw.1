import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Boss lord=new Boss("Lord", 250,70, new Weapon(WeaponType.SWORD, "Groza"));
        System.out.println(lord.printInfo());

        Skeleton skeleton1 = new Skeleton("Leyla", 200, 10, new Weapon(WeaponType.MAG, "bow"), 10);
        Skeleton skeleton2 = new Skeleton("Lesly", 200, 10, new Weapon(WeaponType.GUN, "bow"), 10);


        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}