package ObserverPattern2;

import java.util.concurrent.atomic.AtomicInteger;

public class ATM {
    private I_AccountATM accountATM;

    public void attach(I_AccountATM accountATM){
        this.accountATM = accountATM;
    }

    public void detach(){
        this.accountATM = null;
    }


    private boolean ktSoTienRut(int sotienRut){
      return accountATM.ktSoDu(sotienRut);
    }


    public void rutTien(int soTienRut){
        if(accountATM!=null){
            if(ktSoTienRut(soTienRut)){
                accountATM.thongbao(soTienRut, true);
            }
            else
                accountATM.thongbao(soTienRut, false);
        }
        else
            System.out.println("Khong ton tai tai khoan !" );
    }
    public static  interface I_AccountATM{
        boolean ktSoDu(int soTienRut);
        void thongbao(int soTienRut, boolean thanhcong);

    }
}
