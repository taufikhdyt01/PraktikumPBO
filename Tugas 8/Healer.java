package ExceptionHandling;

public class Healer extends Character {

    public Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    public void heal() {
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        int hit = (int) (Math.random() * 100);
        if (hit <= 85) {
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
