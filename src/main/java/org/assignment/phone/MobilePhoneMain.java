package org.assignment.phone;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Vivo", "Sonic Blue", 28569.49);
        MobilePhone mobilePhone1 = new MobilePhone("Sumsung", "Rosy Pink", 20569.49);
        mobilePhone.mobileInfo(mobilePhone1);
    }
}
