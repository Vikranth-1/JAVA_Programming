class Rectangle {
    int length, width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(int l) {
        length = l;
        width = l;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void display() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        r1.display();
        r2.display();
        r3.display();
    }
}
