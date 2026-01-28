package module2_OOPs.rpgBattleSystem;

public abstract class GameCharacter {
    private String name;
    private int health;
    private int level;
    private int mana;

    public GameCharacter(String name, int health, int level, int mana){
        this.name = name;
        this.health = health;
        this.level = level;
        this.mana = mana;
    }

    public abstract void attack(GameCharacter target);

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = Math.min(1000, health);
        this.health = Math.max(health, 0);
    }

    public void setMana(int mana) {
        this.mana = Math.min(1000, mana);
        this.mana = Math.max(mana, 0);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "GameCharacter [name=" + name + ", health=" + health + ", level=" + level + ", mana=" + mana + "]";
    }
}
