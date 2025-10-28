package cs112.ud2; // make sure this matches your folder name!

public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int hp;

    // Constructor
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hp = 50;
    }

    // Overloaded constructor
    public Pokemon(String name, String type, int level, int hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public int getLevel() { return level; }
    public int getHp() { return hp; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setLevel(int level) { this.level = level; }
    public void setHp(int hp) { this.hp = hp; }

    // toString method
    @Override
    public String toString() {
        return name + " (" + type + ") - Lv." + level + " | HP: " + hp;
    }
}
