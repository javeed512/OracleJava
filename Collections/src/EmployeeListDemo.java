import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {

        public static void main(String[] args) {
            

                    List<Employee>  empList  = new ArrayList<Employee>();


                    empList.add(new Employee(101, "King", 50000));
                    empList.add(new Employee(102, "Tom", 40000));
                    empList.add(new Employee(103, "Smith", 30000));
                    empList.add(new Employee(104, "Ford", 70000));
                    empList.add(new Employee(105, "Ravi", 20000));


                    for (Employee emp : empList) {
                        

                        System.out.println(emp);
                    }


        }



}
