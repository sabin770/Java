public class OverrideDemo {
    public static void main(String[] args) {
        Student5 s1 = new Student5(1, "Savs", 101, "CS");
        Student5 s2 = new Student5(1, "Savs", 101, "CS");
        Student5 s3 = new Student5(2, "Savs", 102, "IT");

        System.out.println("Using toString():");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\nUsing equals():");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        System.out.println("\nUsing hashCode():");
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}