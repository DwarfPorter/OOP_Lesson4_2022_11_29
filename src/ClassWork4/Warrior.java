package ClassWork4;

public abstract class Warrior<T extends Weapon> {
    private String name;
    private Integer healthPoint;
    private T weapon;


    public Warrior(String name, Integer healthPoint, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d", weapon, name, healthPoint);
    }
}
