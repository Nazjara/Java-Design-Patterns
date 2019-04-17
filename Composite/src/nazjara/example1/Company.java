package nazjara.example1;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer( "Dev1", 100, "Senior dev");
        Employee dev2 = new Developer( "Dev2", 101, "Middle dev");

        Directory engineeringDirectory = new Directory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        Employee man1 = new Manager( "Man1", 200, "CTO Manager");
        Employee man2 = new Manager( "Man2", 201, "CEO Manager");

        Directory accountDirectory = new Directory();
        accountDirectory.addEmployee(man1);
        accountDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(accountDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
