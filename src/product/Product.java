package product;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Product implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity,cost=0,price=0,numEachPack=0;
    private String name,brand;
    private List<Integer> idOfPallets;

    public Product(){
        this.quantity = 0;
        this.name = "null";
        this.brand = "null";
        this.cost = 0;
        this.price = 0;
    }

    public Product( int quantity, String name, String brand) {

        this.quantity = quantity;
        this.name = name;
        this.brand = brand;
    }

    public Product( String name, String brand,int price,int quantity ) {

        this.quantity = quantity;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(int quantity, int price, int numEachPack, String name, String brand) {
        this.quantity = quantity;
        this.price = price;
        this.numEachPack = numEachPack;
        this.name = name;
        this.brand = brand;
    }

    public void removePallet(int id){
        this.idOfPallets.remove(id);
    }

    public void addPallet(int id){
        this.idOfPallets.add(id);
    }

    public List<Integer> getIdOfPallets() {
        return idOfPallets;
    }

    public int getNumEachPack() {
        return numEachPack;
    }

    public void setNumEachPack(int numEachPack) {
        this.numEachPack = numEachPack;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = Integer.parseInt(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice(String price) {
        this.price = Integer.parseInt(price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


}
