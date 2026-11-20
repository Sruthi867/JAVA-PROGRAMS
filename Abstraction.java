package com.examly;

public class Abstraction {
    public static void main(String[] args) {
        payment pay;
        pay = new gpay();
        pay.paymentdeduct();
        phonepay p = new phonepay();
        p.paymentdeduct();
        paytm pay1 = new paytm();
        pay1.paymentdeduct();
        pay1.bankname = "IDC";
        pay.holiday();
        System.out.println(p.bankname);
        System.out.println(pay1.bankname);

    }
}

abstract class payment {
    abstract void paymentdeduct();

    String bankname = "SBI";

    void holiday() {
        System.out.println("sunday is holiday");
    }

}

class gpay extends payment {

    void paymentdeduct() {
        System.out.println("payment deducted from gpay");
    }

}

class phonepay extends payment {

    void paymentdeduct() {
        System.out.println("payment deducted from phonepay");
    }

}

class paytm extends payment {

    void paymentdeduct() {
        System.out.println("payment deducted from payment");
    }

}
