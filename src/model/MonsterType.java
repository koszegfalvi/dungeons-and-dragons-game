package model;

import java.util.Random;

public enum MonsterType {
    GOBLIN,
    ORC,
    UNDEAD;

    public static MonsterType getRandomMonster() {
        Random random = new Random();
        MonsterType[] monsterTypes = MonsterType.values();
        return monsterTypes[random.nextInt(monsterTypes.length)];
    }
/*public static MonsterType getRandomHealth(){
        int RandomHealth;
        Random random=new Random();
        RandomHealth=random.nextInt(50,100);
        return MonsterType.getRandomHealth();*/
}





