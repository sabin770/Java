public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("=== StringBuffer Operations ===");
        System.out.println("Original: " + sb);

        // append()
        sb.append(" World");
        System.out.println("1. append(\" World\"): " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("2. insert(5, \" Java\"): " + sb);

        // replace()
        sb.replace(6, 10, "Python");
        System.out.println("3. replace(6, 10, \"Python\"): " + sb);

        // delete()
        sb.delete(6, 12);
        System.out.println("4. delete(6, 12): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("5. reverse(): " + sb);

        // reverse back
        sb.reverse();

        // capacity()
        System.out.println("6. capacity(): " + sb.capacity());

        // length()
        System.out.println("7. length(): " + sb.length());

        // charAt()
        System.out.println("8. charAt(0): " + sb.charAt(0));

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(0, 'h'): " + sb);

        // substring()
        System.out.println("10. substring(6): " + sb.substring(6));
        System.out.println("11. substring(0,5): " + sb.substring(0,5));

        // deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("12. deleteCharAt(5): " + sb);

        // setLength()
        sb.setLength(5);
        System.out.println("13. setLength(5): " + sb);

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("14. ensureCapacity(50): " + sb.capacity());
    }
}