package com.company;
import java.util.Date;


public class MenuItem {
    private String name;
    private String category;
    private String description;
    private Date dateAdded;
    private Double price;

    public MenuItem(String name, String category, String description, Date dateAdded, Double price){
        this.name = name;
        this.category = category;
        this.description = description;
        this.dateAdded = dateAdded;
        this.price = price;

    }
    public String getName() {
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public Date getDateAdded(){
        return this.dateAdded;
    }
    public Double getPrice(){
        return this.price;
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }
    public void setDateAdded(Date aDateAdded){
        this.dateAdded = aDateAdded;
    }
    public void setPrice(Double aPrice){
        this.price = aPrice;
    }
}
