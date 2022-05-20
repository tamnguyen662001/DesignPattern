package TemplatePattern3;

public abstract class ThanhToan {

    public void thanhToanChiPhi(){
        datHang();
        tinhTien();
        tinhChiecKhau();
        inDS();
    }

    public abstract void datHang();
    public void inDS(){
        System.out.println("Tổng tiền hàng (chưa chiếc khấu): " +tinhTien());
        System.out.println("Chiếc khấu: " +tinhChiecKhau());
        System.out.println("Tổng tiền cần thanh toán: " +(tinhTien() - tinhChiecKhau()));
    };
    public abstract double tinhTien();
    public abstract double tinhChiecKhau();
}
