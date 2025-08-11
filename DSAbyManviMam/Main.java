package DSAbyManviMam;
class Student{
    int rollNo;
    String studentName;
}
public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo=1;
        obj1.studentName="mahesh chandel";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
        Student obj2 = new Student();
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);
    }
}// two public class not exist in the code .
// only one public class is exist.
// public class name equal to file name.
// we can create multiple class in java file.
