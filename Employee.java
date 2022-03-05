/**
 * GB Java. Homework 5. Employee
 *
 * @author Viktor A. Volkov
 * @version 5.3.2022
 */
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