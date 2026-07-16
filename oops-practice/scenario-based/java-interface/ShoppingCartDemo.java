interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {

        // Coupon is valid if its length is 5 or more
        if (CouponValidator.isLengthValid(code)) {
            return true;
        }
        return false;
    }
}

public class ShoppingCartDemo {

    public static void main(String[] args) {

        String[] coupons = {"SAVE10", "AB12", "WELCOME", "OFF", "DISCOUNT"};

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            if (cart.validateCoupon(code)) {
                System.out.println(code + " : Valid Coupon");
            } else {
                System.out.println(code + " : Invalid Coupon");
            }
        }
    }
}