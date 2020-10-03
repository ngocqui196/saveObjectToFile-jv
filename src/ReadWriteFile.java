import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile<E> {
    private List<Product> products;

    public ReadWriteFile() {
        this.products = new ArrayList<>();
    }

    public void writeObjectToFile() throws IOException {
        ObjectOutputStream objOutputS = new ObjectOutputStream(new FileOutputStream("fileObject.csv"));
        objOutputS.writeObject(this.products);
        objOutputS.close();
    }

    public List<Product> addProduct(int id, String name, String manufacturer,long price,String note) {
        products.add(new Product(id,name,manufacturer,price,note));
      return products;
    }

    public List<Product> readObjectFile() throws IOException {
//        List<E> customer = null;
        ObjectInputStream objInputS = null;
        try {
            objInputS = new ObjectInputStream(new FileInputStream("fileObject.csv"));
            products = (List<Product>) objInputS.readObject();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            objInputS.close();
        }
        System.out.println("Thành công");

        return products;
    }
//    public boolean equalByID(int id) {
//
//        for (E a : products) {
//            if (id == a) {
//                return true;
//            }
//        }
//        return false;
//    }

}
