package StaticMethod;

public class Student {
    private int stt ;
    private String name;
    private static String college;
    Student(int s ,String n){
        stt=s;
        name=n;

    }
    static void chang(){
        college="CodeGym";
    }
    void display(){
        System.out.println(stt+ " " +name+" "+ college);
    }

}
