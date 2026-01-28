package module2_OOPs.rpgBattleSystem;

public class Mage extends GameCharacter{
    public Mage(String name, int health, int level, int mana) {
        super(name, health, level, mana);
    }

    @Override
    public void attack(GameCharacter target){
        // Mage take (level*5) damage and consumes (level*8) mana and deals (level*25) damage to the opponent and loses 40 mana.

        if(this.getHealth() >= this.getLevel()*5 && this.getMana() >= this.getLevel()*8){
            this.setHealth(this.getHealth() - this.getLevel()*10);
            this.setMana(this.getMana() - this.getLevel()*8);
            target.setHealth(target.getHealth()-this.getLevel()*25);
            target.setMana(target.getMana() - 40);
            System.out.println(this.getName() + " deals " + this.getLevel()*50 + " to the enemy");
        }
        else {
            if(!(this.getHealth() >= this.getLevel()*5) && !(this.getMana() >= this.getLevel()*8)){
                System.out.println(this.getName() + " cannot attack " + "because of both low health and mana");
            }
            else if(!(this.getHealth() >= this.getLevel()*5)){
                System.out.println(this.getName() + " cannot attack " + "because of low health.");
            }
            else{
                System.out.println(this.getName() + " cannot attack " + "because of low mana.");
            }
        }
        
    }
}
