package StaticMethod;

public class TestStaticMethod {

    public static void main(String[] args) {
        Student.chang();
        Student s1= new Student(1,"Hung");
        Student s2= new Student(2,"Dung");
        Student s3=new Student(3,"Abc");
        s1.display();
        s2.display();
        s3.display();
    }
}
