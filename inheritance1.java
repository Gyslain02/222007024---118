public interface number1 {
    void show();

}

class one extends two implements number1 {
    public void n() {
        System.out.println("result is number 1");
        System.out.println("result is number 2");

    }

}

class two {
    public void show() {

    }

    class three extends four {
        public void you() {
            System.out.println("result is 3");

        }

    }

    class four extends two {
        void chall() {
            System.out.println("result is a number");
        }
    }

    public static void main(String[] args) {
        one first = new one();
        two second = new two();

        first.n();
        second.show();
        System.out.println("it's true");

    }

}