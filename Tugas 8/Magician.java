package ExceptionHandling;

public class Magician extends Character {

    public Magician() {
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

    @Override
    public boolean attack() {
        int hit = (int) (Math.random() * 100);
        if (hit <= 35) {
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
