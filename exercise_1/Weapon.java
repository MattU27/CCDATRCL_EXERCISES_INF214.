public class Weapon {
    
    int damage;
    double weight;
    int rarity;
    int description;
    public String name;


   
    public void weaponDescription() {
        System.out.println("You can one shot enemy across the map, " + name + " Damage: " +  damage + " Weight: " + weight + " Rarity: " + rarity + "" );
    }
}
