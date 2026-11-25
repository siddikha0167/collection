import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> course=new LinkedHashSet<>();
        course.add("java");
        course.add("python");
        course.add("React");
        course.addFirst("sql");

        System.out.println(course);

        System.out.println("Contains JAVA: "+course.contains("java"));

        course.remove("python");

        System.err.println("After Removal:"+course);
    }
}
