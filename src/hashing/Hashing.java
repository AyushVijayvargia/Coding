package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashing {
    public static void main(String args[])
    {
        HashStudent s1 = new HashStudent();
        s1.setName("Ayush");
        s1.setRollNo(1l);

        HashStudent s2 = new HashStudent();
        s2.setName("Ayush");
        s2.setRollNo(1l);

        System.out.println("****** without overriding hashcode ******");//2
        System.out.println("equals : "+s1.equals(s2));//false
        System.out.println("hashcode : "+ (s1.hashCode()==s2.hashCode()));//false

        List<HashStudent> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        System.out.println("size after adding two students to list :"+ students.size());//2

        List<HashStudent> studentsHashing = new ArrayList<>();
        studentsHashing.add(s1);
        studentsHashing.add(s2);

        System.out.println("size after adding two students to set :"+ studentsHashing.size());//2

        // case 2
        HashStudentWithHashCode s3 = new HashStudentWithHashCode();
        s3.setName("Ayush");
        s3.setRollNo(1l);

        HashStudentWithHashCode s4 = new HashStudentWithHashCode();
        s4.setName("Ayush");
        s4.setRollNo(1l);

        System.out.println("****** with custom hashcode ******");
        System.out.println("equals : "+s3.equals(s4));//true
        System.out.println("hashcode : "+ (s3.hashCode()==s4.hashCode()));//true

        List<HashStudentWithHashCode> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(s3);
        studentsArrayList.add(s4);

        System.out.println("size after adding two students to list : "+studentsArrayList.size());//2

        Set<HashStudentWithHashCode> studentsHash = new HashSet<>();
        studentsHash.add(s3);
        studentsHash.add(s4);

        System.out.println("size after adding two students to set : "+studentsHash.size());//1

    }
}
