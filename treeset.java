import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> course=new TreeSet<>();
        course.add("java");
        course.add("python");
        course.add("react");
        course.add("sql");
        

        System.out.println(course);

        System.out.println("Contains JAVA: "+course.contains("java"));

        course.remove("python");

        System.err.println("After Removal:"+course);
    }
}
