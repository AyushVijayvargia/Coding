package java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

        public static  void main(String arhs[])
        {

                List<Student> students = new ArrayList<>();
                Student s1 = new Student();
                s1.setAge(28);
                s1.setName("Ayush");

                Student s2 = new Student();
                s2.setAge(24);
                s2.setName("Anwesha");
                students.add(s1);
                students.add(s2);

                Student s3 = new Student();
                s3.setAge(56);
                s3.setName("Anju");
                students.add(s3);

                List<String> names = new ArrayList<>();
                names = students.stream().map(e->e.getName()).collect(Collectors.toList());
                System.out.println(names);

                List<Student> studentList2 = students.stream().map(Function.identity()).collect(Collectors.toList());

                System.out.println(studentList2);

            //    students.stream().map(Function.identity()).forEach(System.out::print);

                //frequency of names
                HashMap<String, Long> frequencyNames = (HashMap<String, Long>) students.stream().collect(Collectors.groupingBy(Student :: getName,
                       // HashMap::new,
                        Collectors.counting()));

                System.out.println(frequencyNames);

                HashMap<String, Integer> frequencyNames2 = (HashMap<String, Integer>) students.stream().collect(Collectors.toMap(Student :: getName,
                        // HashMap::new,
                        Student::getAge));

                System.out.println(frequencyNames2);

                //fibonacci

               // way -1

                Collections.sort(students,new AgeCompare());
                System.out.println("*"+students);

                //way -2
                Collections.sort(students, new Comparator<Student>(){
                        public int compare(Student item1, Student item2){
                       //         Double cpr1 = Double.valueOf ((double)item1.profit/(double)item1.weight);
                         //       Double cpr2 = Double.valueOf ((double)item2.profit/(double)item2.weight);

                                if(item1.getAge() < item2.getAge()) return 1;
                                return -1;
                        }
                });
                System.out.println("**"+students);


                //way -3
                Collections.sort(students, (item1, item2) -> {
                        if(item1.getAge() < item2.getAge()) return -1;
                        return 1;
                });
                System.out.println("***"+students);


                Student minByAge = students
                        .stream()
                        .min(Comparator.comparing(Student::getAge))
                        .orElseThrow(NoSuchElementException::new);

                System.out.println(minByAge);

                students.add(s2);
                //m4
                Collections.sort( students, (Comparator.comparing(Student::getAge)));
                System.out.print(students);

        }

}
        class AgeCompare implements Comparator<Student> {
                public int compare(Student m1, Student m2)
                {
                        if (m1.getAge() < m2.getAge())
                                return -1;
                        if (m1.getAge() > m2.getAge())
                                return 1;
                        else
                                return 0;
                }
        }
