/**
 * GB Java. Homework 5
 *
 * @author Viktor A. Volkov
 * @version 5.3.2022
 */
class HWApp5 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30),
            new Employee ("Alexandrov Alex", "Assistant", "alalex@mailbox.com", "123456789", 23000, 23),
            new Employee ("Petrov Petr", "Accountant", "petpetr@mailbox.com", "987654321", 35000, 48),
            new Employee ("Semenov Semen", "Plumber", "semsemen@mailbox.com", "321654987", 29000, 42),
            new Employee ("Volkov Viktor", "Director", "viktor-a-volkov@mail.ru", "9121410661", 49000, 31),
        };

        for (Employee employee : employees) {
            if (employee.getOld () > 40) {
                System.out.println(employee);
            }
        }
    }
}
/**
class Employee {
    private String name;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String post, String email, String phone, double salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getOld() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee" +
                "\n| Name: " + name +
                "\n| Post: " + post +
                "\n| Email: " + email +
                "\n| Shone: " + phone +
                "\n| Salary: " + salary +
                "\n| Age: " + age;
    }
}
*/