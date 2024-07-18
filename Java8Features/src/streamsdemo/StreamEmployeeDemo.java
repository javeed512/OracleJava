package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEmployeeDemo {



        public static void main(String[] args) {
            

                List<Employee>  empList = new ArrayList<Employee>();

                    empList.add(new Employee(101, "King", 5000));
                    empList.add(new Employee(102, "Tom", 3000));
                    empList.add(new Employee(103, "Satish", 4000));
                    empList.add(new Employee(104, "rajendra", 2000));
                    empList.add(new Employee(105, "James Gosling", 1000));


                   Stream<Employee>  stream1 =     empList.stream();

                 // stream1.forEach(System.out::println);

                // stream1.forEach((emp)->{System.out.println(emp);});

      stream1.filter((emp)->{  return emp.getSalary() > 3000; }).forEach(System.out::println);


        }


}
