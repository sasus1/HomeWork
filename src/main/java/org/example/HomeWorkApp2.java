package org.example;{
    public class MainClass
    {
        public static void main(String[] args)
        {
            Employees[] employees = new Employees[5];
            employees[0] = new Employees("Ivanov0","ivanov@mailbox.com",18);
            employees[1] = new Employees("Ivanov1","ivanov@mailbox.com",45);
            employees[2] = new Employees("Ivanov2","ivanov@mailbox.com",30);
            employees[3] = new Employees("Ivanov3","ivanov@mailbox.com",62);
            employees[4] = new Employees("Ivanov4","ivanov@mailbox.com",25);
            for (int i = 0; i < employees.length; i++)
            {
                if(employees[i].getAge() > 40)
                {
                    employees[i].printInfo();
                }
            }
        }
    }
}



public class Employee
{
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}
    public void print()
    {
        System.out.println(this);
    }
    public static void main(String[] args)
    {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван Иванович", "Директор", "ii@mailbox.com", "+79000000008", 150000, 47);
        persArray[1] = new Employee("Семенов Семен Семенович", "Охранник", "cc@mailbox.com", "+79000000009", 110000, 25);
        persArray[2] = new Employee("Антонов Антон анатольевич", "Супервизор", "aa@mailbox.com", "+7900000003", 130000, 29);
        persArray[3] = new Employee("Павлов Павел Павлович", "Бухгалтер", "pp@mailbox.com", "+79000000006", 190000, 36);
        persArray[4] = new Employee("Сергеев Сергей Сергеевич", "Продавец", "CC@mailbox.com", "+79000000004", 170000, 40);
        for (int i=0; i < persArray.length; i++)
        if (persArray[i].age > 40) persArray[i].print();

    }
}





public class Park
{
    private String name;
    public Park(String name) {
        this.name = name;
    }
    public class Attraction
    {
        private String attractionName;
        private String workingHours;
        private double cost;
        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public void printInfo()
        {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost + " Руб");
        }
    }
    public static void main(String[] args)
    {
        Park park = new Park("Park");
        Attraction attractionOne = park.new Attraction("Attraction1", "10:00 - 14:00", 20);
        attractionOne.printInfo();
    }
}
