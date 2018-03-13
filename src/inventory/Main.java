package inventory;


import inventory.items.Armor;
import inventory.items.HealthPotion;
import inventory.items.MagicPotion;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addArmor(new Armor());
        inventory.addHealthPotion(new HealthPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.addMagicPotion(new MagicPotion());
        inventory.printAllItems();
        System.out.println(inventory.getMagicPotionNumber());
        System.out.println(inventory.getHealthPotionNumber());
    }
}
