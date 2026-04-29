class Swap {
    static <T> void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        swap(10, 20);
        swap("Hello", "World");
        swap(1.5, 2.5);
    }
}
