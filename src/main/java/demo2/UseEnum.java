package demo2;



public class UseEnum {

    enum Color {

        RED(1), BLUE(2);

        private int value;

        private Color(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        int c = Color.BLUE.getValue();
    }



}
