package model;

public class Monster {

    private String name;
    private int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    // Vegyél fel két fieldet: name (String) és health (int)

    // Írj egy két paraméteres kosntruktort ami beállítja az attribútumok értékeit!

    public void attack(Character player) {
        System.out.println(name + " attacks" + player.getName());
        // Írd ki: [szörny neve] attacks [játékos neve]!

        // Csökkentsd a játékos életét 20-szal!
        health -= 20;
        // Írd ki: Dealt 20 damage to [játékos neve]!
        System.out.println("Dealt 20 damage to " + player.getName());
        // Ha a játékos élete 0 vagy kisebb, írd ki: [játékos neve] has been defeated!
        if (health < 0) {
            System.out.println(player.getName() + " has been defeated");
        }
    }
}