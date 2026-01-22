package twentyTwo_jan.module2_OOPs.rpgBattleSystem;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        GameCharacter attacker1 = new Warrior("THOR", 150, 1, 0);
        GameCharacter mage1 = new Mage("OMEN", 100, 2, 100);
        GameCharacter healer1 = new Healer("SAGE", 100, 1, 150);



        GameCharacter enemy1 = new Mage("THANOS", 100, 1, 200);

        team.addTeamMates(attacker1);
        team.addTeamMates(mage1);
        team.addTeamMates(healer1);

        team.teamAttack(enemy1);

        if(enemy1.getHealth()>0){
            System.out.println("Attacker are not able to defeat the emeny : " + enemy1.getName() + " in one go");
        }
        else{
            System.out.println("Attackers deafeated the enemy in one go. Mission Successfull!!!");
        }
    }
}
