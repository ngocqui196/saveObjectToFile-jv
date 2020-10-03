import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> listProducts = new ArrayList<>();
    public static void main(String[] args) {
        ReadWriteFile readAndWrite = new ReadWriteFile();
        Method method = new Method();
        Scanner sc = new Scanner(System.in);
        int choiseProductManagement = 0;
        do {
            try {
                System.out.println("======Quản lý sản phẩm======");
                System.out.println("Xin mời nhập sự lựa chọn của bạn.");
                System.out.println("1.Thêm sản phẩm.");
                System.out.println("2. Sửa sản phẩm.");
                System.out.println("3. Xoá sản phẩm.");
                System.out.println("4. Hiển thị danh sách sản phẩm.");
                System.out.println("0.Thoát");


                choiseProductManagement = Integer.parseInt(sc.nextLine());

                switch (choiseProductManagement) {
                    case 1:
                        int id;
                        do {
                            System.out.println("Xin mời nhập id sản phẩm.");
                            id = Integer.parseInt(sc.nextLine());
                        } while (method.daTrung(id));
                        System.out.println("xin mời nhập tên");
                        String name = sc.nextLine();
                        System.out.println("Xin mời nhập hãng sản phẩm.");
                        String hang = sc.nextLine();
                        System.out.println("Xin mời nhập giá sản phẩm.");
                        long gia = Long.parseLong(sc.nextLine());
                        System.out.println("Nhập ghi chú.");
                        String ghChu = sc.nextLine();
//                        readAndWrite.readObjectFile();
                        readAndWrite.addProduct(id,name,hang,gia,ghChu);
                        readAndWrite.writeObjectToFile();
                        break;
                    case 4:
                        System.out.println("Hiển thị thông tin");
//                        method.display();
                        System.out.println(readAndWrite.readObjectFile());
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (Exception e) {
//                System.out.println("lỗi");
                e.printStackTrace();
//                choiseProductManagement=-1;
            }

        } while (choiseProductManagement != 0);
    }
}
