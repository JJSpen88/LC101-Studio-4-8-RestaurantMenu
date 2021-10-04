package com.company;
import java.util.ArrayList;
import java.util.Date;


public class RestaurantMenu {
    private ArrayList<MenuItem> itemsOnMenu = new ArrayList<>();
    private ArrayList<MenuItem> newMenuItems = new ArrayList<>();
    private Date lastUpdated;
    //    lastUpdated private method
    private Date displayLastUpdated(){
        return lastUpdated;
    }


//    setNewMenuItems private method
    //    (if MenuItem.dateAdded is within 30 days)
//    showByCategory private method


    public RestaurantMenu(ArrayList<MenuItem> itemsOnMenu, ArrayList<MenuItem> newMenuItems, Date lastUpdated){
        this.itemsOnMenu = itemsOnMenu;
        this.newMenuItems = newMenuItems;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItemsOnMenu(){
        return this.itemsOnMenu;
    }
    public ArrayList<MenuItem> getNewMenuItems(){
        return this.newMenuItems;
    }
    public Date getLastUpdated(){
        return this.lastUpdated;
    }

    public void setItemsOnMenu(MenuItem aMenuItem){
        this.itemsOnMenu.add(aMenuItem);

    }
    public String isNewItem(MenuItem item){
        if(item.getIsNew() == true){
            return "New Item";
        } else return "Item is not new";
    }



    public void addToMenu(MenuItem item){
        for(MenuItem product : this.itemsOnMenu){
            if(item.equals(product)){
                System.out.println("Item is already on menu");
                return;
            }

        } itemsOnMenu.add(item);

    }

    public void removeFromMenu(MenuItem item){
        for(MenuItem product : this.itemsOnMenu){
            if(item.equals(product)){
                itemsOnMenu.remove(item);
                continue;
            } else {
                break;
            }
        }
        System.out.println("All instances of" + item.getName() + "are removed.");
        return;
    }
    public void printWholeMenu(){
        System.out.println(this.itemsOnMenu);
    }
    public void printMenuItem(MenuItem item){
        for(MenuItem product : this.itemsOnMenu){
            if(item.equals(product)){
                System.out.println(item);
            }
        }
    }

}
