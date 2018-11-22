package demo2.enums;

public class Question108 {

    enum USCurrency {
        PENNY(1),
        NICKLE(5),
        DIME(10),
        QUARTER(25);

        private int value;

        USCurrency(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }
}

// Nest the USCurrency enumeration declaration within the Coin class
// Remove the new keyword from the instantion of usCoin.