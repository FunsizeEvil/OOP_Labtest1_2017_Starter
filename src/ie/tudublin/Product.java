package ie.tudublin;

import processing.data.TableRow;

public class Product{

    private String name;
    private float price;

    public Product(String name, Float price){
        this.name = name;
        this.price = price;
    }

    public Product(TableRow tr){
        this(tr.getString("Name"), tr.getFloat("Price"));
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "PRoduct [name="+ name + ", Price= " + price + "]";
    }
}