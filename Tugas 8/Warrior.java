package ExceptionHandling;

public class Warrior extends Character {

    public Warrior() {
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

    @Override
    public boolean attack() {
        int hit = (int) (Math.random() * 100);
        if (hit <= 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
    }

}
