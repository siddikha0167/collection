import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> course=new HashSet<>();
        course.add("java");
        course.add("python");
        course.add("React");
        course.add("java");

        System.out.println(course);

        System.out.println("Contains JAVA: "+course.contains("java"));

        course.remove("python");

        System.err.println("After Removal:"+course);
    }
}
