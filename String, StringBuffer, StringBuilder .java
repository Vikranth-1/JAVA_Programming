class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        sb.reverse();
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Code");
        sb2.reverse();
        System.out.println(sb2);
    }
}
