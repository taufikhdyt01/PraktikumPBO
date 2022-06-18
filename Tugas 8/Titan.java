package ExceptionHandling;

public class Titan extends Character {

    public Titan() {
        setHP(200);
        setAttack(45);
    }

    @Override
    public boolean attack() {
        int hit = (int) (Math.random() * 100);
        if (hit <= 40) {
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
