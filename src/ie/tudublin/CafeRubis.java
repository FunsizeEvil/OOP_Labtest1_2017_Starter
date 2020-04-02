package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class CafeRubis extends PApplet
{
    //Create array list for product that is connected to class Product in the generic
    //
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> bill = new ArrayList<Product>();

    Float border;
    float left;

    float width;
    float height;

    public void loadData(){
        Table table = loadTable("cafe.csv","header");
        for(TableRow row:table.rows()){
            Product p = new Product(row);
            products.add(p);
        }
    }

    public void printProducts()
    {
        System.out.println("products below \n");
        for(Product p:products){
            System.out.println(p);
        }
        System.out.println("products Printed");
    }

    public void settings()
    {
        size(800, 800);
    }

    //call the functions
    //
    public void setup(){
        loadData();
        printProducts();
    }
}

