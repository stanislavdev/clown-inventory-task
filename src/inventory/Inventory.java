package inventory;

import inventory.items.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static final int INVENTORY_SIZE = 9;
    private int healthPotionNumber = 0;
    private int magicPotionNumber = 0;
    private List<Item> itemList = new ArrayList<>();

    private boolean hasInventoryEmptyPlace() {
        return itemList.size() != INVENTORY_SIZE;
    }

    public void addArmor(Armor armor) {
        if (hasInventoryEmptyPlace()) {
            itemList.add(armor);
        }
    }

    public void addWeapon(Weapon weapon){
        if (hasInventoryEmptyPlace()){
            itemList.add(weapon);
        }
    }

    public void addHealthPotion(HealthPotion healthPotion) {
        if (hasInventoryEmptyPlace()) {
            healthPotionNumber++;
            if (healthPotionNumber > 1) {
                return;
            }
            itemList.add(healthPotion);
        }
    }

    public void addMagicPotion(MagicPotion magicPotion){
        if (hasInventoryEmptyPlace()){
            magicPotionNumber++;
            if (magicPotionNumber > 1){
                return;
            }
            itemList.add(magicPotion);
        }
    }

    public int getHealthPotionNumber() {
        return healthPotionNumber;
    }

    public int getMagicPotionNumber() {
        return magicPotionNumber;
    }

    public void replaceItem(int itemIndex, int replaceIndex) {
        if (replaceIndex > itemList.size() || itemIndex > itemList.size() ||
                itemIndex < 0 || replaceIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        Item temp = itemList.get(replaceIndex);
        itemList.set(replaceIndex, itemList.get(itemIndex));
        itemList.set(itemIndex, temp);
    }

    public void printAllItems() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    public Item getItem(int index) {
        if (index < 0 || index > itemList.size()) {
            throw new IndexOutOfBoundsException();
        }
        return itemList.get(index);
    }
}
