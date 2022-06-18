package ExceptionHandling;

public abstract class Character {

    private int defense;
    private int attack;
    private int HP = 0;

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        if (damage > defense) {
            int sisa = damage - defense;
            setHP(getHP() - sisa);
        }
    }

    public void info() {
        System.out.println("------------ STATUS ------------");
        System.out.println("Role\t\t: " +getClass().getSimpleName());
        System.out.println("HP\t\t\t: " +getHP());
        System.out.println("Attack\t\t: " +getAttack());
        System.out.println("Defense\t\t: " +getDefense());
    }

}
