import java.io.Serializable;

public class Product implements Serializable {
    private int iD;
    private String name;
    private String manufacturer;
    private long price;
    private String note;

    public Product() {
    }

    public Product(int iD, String name, String manufacturer, long price, String note) {
        this.iD = iD;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.note = note;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                "}\n";
    }
}
