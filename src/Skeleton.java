public class Skeleton extends Boss{
    private int arrows;

    public String printInfo() {
        return "Name: " + this.getName() + " Health: " + this.getHealth() + " Damage: "
                + this.getDamage() + " Weapon: " + this.getWeapon().getWeaponType() + " Name Weapon: "
                + this.getWeapon().getWeaponName()+" Arrows: "+this.arrows;
    }

    public Skeleton(String name, int health, int damage, Weapon weapon,int arrows)  {
        super(name, health, damage, weapon);
        this.arrows=arrows;

    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
