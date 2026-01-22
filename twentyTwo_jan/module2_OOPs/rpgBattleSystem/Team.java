package twentyTwo_jan.module2_OOPs.rpgBattleSystem;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<GameCharacter> members;

    public Team(){
        members = new ArrayList<>();
    }

    public void addTeamMates(GameCharacter mem){
        members.add(mem);
    }

    public void teamAttack(GameCharacter enemy){
        for(GameCharacter character : members){
            if(character instanceof Healer){
                for(GameCharacter ch: members){
                    if(!(ch instanceof Healer)){
                        character.attack(ch);
                    }
                }
            }
            else {
                character.attack(enemy);
            }

            if(enemy.getHealth()<=0){
                break;
            }
        }

        System.out.println(enemy.toString());
    }

}
