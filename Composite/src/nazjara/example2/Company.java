package nazjara.example2;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer( "Dev1", 100, "Senior dev");
        Employee dev2 = new Developer( "Dev2", 101, "Middle dev");

        Manager engineeringManager1 = new Manager("Man1", 25000);
        engineeringManager1.addEmployee(dev1);
        engineeringManager1.addEmployee(dev2);

        Employee dev3 = new Developer( "Dev3", 102, "Junior dev");
        Employee dev4 = new Developer( "Dev4", 103, "Trainee dev");

        Manager engineeringManager2 = new Manager("Man2", 12500);
        engineeringManager2.addEmployee(dev3);
        engineeringManager2.addEmployee(dev4);

        engineeringManager1.addEmployee(engineeringManager2);

        engineeringManager1.showEmployeeDetails();
    }
}
