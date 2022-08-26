public class Weapon {

    int damage;
    double weight;
    int rarity;
    int description;
    public String name;


    public void vandalDescription() {
        System.out.println("Precise rifle for killing your enemies, " + name + " Damage: " +  damage + " Weight: " + weight + " Rarity: " + rarity);
    }
    public void operatorDescription(){
        System.out.println("You can one shot enemy across the map, "+ name + " Damage: " + damage + " Weight: "+ weight + " Rarity: "+ rarity);
    }
    public void odinDescription(){
        System.out.println("Spam your enemies with thousands of bullets, " + name + " Damage: " +damage + " Weight: " +weight+ " Rarity: " + rarity );
        
    }
}
