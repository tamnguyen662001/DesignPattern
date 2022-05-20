package TemplatePattern3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gioHangKHKC extends ThanhToan {

    List<hangHoa> HangHoa = new ArrayList<>();
    public List<hangHoa> getHangHoa() {
        return HangHoa;
    }
    public void setHangHoa(List<hangHoa> hangHoa) {
        HangHoa = hangHoa;
    }

    @Override
    public void datHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("Có bao nhiêu sản phẩm: ");
        int sSP = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < sSP; i++) {
            System.out.println("Tên sản phẩm: ");
            String tSP = scanner.nextLine();
            System.out.println("Số lượng: ");
            int sL = scanner.nextInt();
            System.out.println("Giá tiền: ");
            double gT = scanner.nextDouble();
            scanner.nextLine();
            HangHoa.add(new hangHoa(tSP, sL, gT));
        }
    }

    @Override
    public void inDS() {
        System.out.println("\n");
        System.out.println("=====================");
        System.out.println("Danh sách hàng hóa: ");
        HangHoa.forEach(hangHoa -> {
            System.out.println(hangHoa.tenHang);
            System.out.println(hangHoa.soLuong);
            System.out.println(hangHoa.giaTien);
            System.out.println("--- --- ---");
        });
        super.inDS();
    }

    @Override
    public double tinhTien() {
        double tongTien = 0;
        for (int i = 0; i < HangHoa.size(); i++){
            tongTien += HangHoa.get(i).giaTien * (double) HangHoa.get(i).soLuong;
        }
        return tongTien;
    }


    @Override
    public double tinhChiecKhau() {
        if(tinhTien() > 500000){
            if (tinhTien() > 1000000){
                if (tinhTien() > 1500000)
                    return Math.round(tinhTien() * 0.06);
                else
                    return Math.round(tinhTien() * 0.05);
            }
            else
                return Math.round(tinhTien() * 0.03);
        }
        else
        {
            return tinhTien();
        }
    }

}
