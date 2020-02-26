public class Main {


    public static void main(String[] args) {
        Person p1 = new Person("Anganathi", "Ngodwane", 23, "Male");
        Person p2 = new Person("Sinovuyo", "Lize", 22, "Female");
        Person p3 = new Person("Anganathi", "Ngodwane", 23, "Male");
        System.out.println(p1.objectEquals(p3));
    }
}
