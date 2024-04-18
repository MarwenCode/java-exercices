package employees;

public class Employee {

    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;


    public Employee(String name, double experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Years of Experience: " + experience + ", Salary: " + salary);
    }

    //getters:

    public String getName() {
        return name;
    }
    public double getExperience() {
        return experience;
    }
    public double getSalary() {
        return salary;
    }

    //setters:

    public void setName(String name) {
         this.name = name;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //update method for all properties of the object
    public void update(String name, double experience, double salary) {
        setName(name);
        setExperience(experience);
        setSalary(salary);
    }

    //calculate bonus
    public double calculateBonus(float performancePercentage) {
        double bonus = (salary * performancePercentage * 0.1);

        return bonus;

    };

    //calculate increment
    public double claculauteIncrement() {
        double increment;
        if(salary < 65000) {
            increment = 0.1;
        }else {
            increment = 0.5;
        }


        salary = salary + salary * increment;
        return increment;

    }





}
