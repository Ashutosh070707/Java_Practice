package twentyTwo_jan.module2_OOPs.rpgBattleSystem;

public class Warrior extends GameCharacter{
    public Warrior(String name, int health, int level, int mana) {
        super(name, health, level, mana);
    }

    @Override
    public void attack(GameCharacter target){
        // Info : warrior takes (level*10) damage itself and deals (level*50) damage to the opponent.

        if(this.getHealth() >= this.getLevel()*10){
            this.setHealth(this.getHealth() - this.getLevel()*10);
            target.setHealth(target.getHealth() - this.getLevel()*50);
            System.out.println(this.getName() + " deals " + this.getLevel()*50 + " to the enemy");
        }
        else {
            System.out.println(this.getName() + " cannot attack because of low health");
        }
    }
}
