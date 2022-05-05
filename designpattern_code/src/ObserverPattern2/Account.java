package ObserverPattern2;

import ObserverPattern2.ATM.I_AccountATM;

public class Account implements I_AccountATM{

    String ten;
    int soDu;
    ATM atm;

    

    public Account(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

// xay dung giao dien chuong trinh chua cac nut , cac nut laf subject, gd la observer, bam nut , no tb cho gd rang co nguoi dung bam vao nut do , 

// dang ki vao ds atm de rut tien 

    public void nhapATM(){
        atm.attach(this);
    }
    public void rutATM(){
        atm.detach();
    }
    @Override
    public boolean ktSoDu(int soTienRut) {
        if(soDu - soTienRut >= 50){
            return true;
        }
        return false;
    }

    @Override
    public void thongbao(int soTienRut, boolean thanhcong) {
        System.out.println("Tai khoan :  " + ten);
        if(thanhcong){
            System.out.println("So du ban dau : " + soDu);
            System.out.println("So tien rut : "+ soTienRut );
            soDu = soDu - soTienRut;
            System.out.println("So du con lai : " + soDu);
            System.out.println("========================");
        }
        else{
        System.out.println("Khong the thuc hien giao dich !");
        System.out.println("So du con lai : " + soDu);}

        
    }
    
}
