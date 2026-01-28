package twentyTwo_jan.module2_OOPs.rpgBattleSystem;

public class Healer extends GameCharacter {
    public Healer(String name, int health, int level, int mana) {
        super(name, health, level, mana);
    }

    @Override
    public void attack(GameCharacter target) {
        // healer heals the health of other players (who are not healers) by 50 points
        // and mana by 30 points (health and mana can be maximum upto 100) and loses 30
        // mana.

        if (this.getMana() >= 30) {
            target.setHealth(target.getHealth() + 50);
            if(!(target instanceof Warrior)) target.setMana(target.getMana() + 30);

            this.setMana(this.getMana() - 30);

            System.out.println(this.getName() + " heals health and mana of other players");
        }
        else{
            System.out.println(this.getName() + " dont have enough mana");
        }
    }
}
