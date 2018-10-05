//Implement Builder pattern to create a student object with more than 6 fields.

package DesignJava;

class Student {

    private String name;
    private Integer rollNo;
    private Integer age;
    private boolean optedForlunch;
    private boolean isOptedForShuttle;
    private Integer contributionToDonation;

    public Student(EmployeeBuilder employeeBuilder) {
        rollNo = employeeBuilder.getrollNo();
        name = employeeBuilder.getName();
        age = employeeBuilder.getage();
        optedForlunch = employeeBuilder.isOptedForlunch();
        isOptedForShuttle = employeeBuilder.isOptedForShuttle();
        contributionToDonation=employeeBuilder.getContributionToDonation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getrollNo() {
        return rollNo;
    }

    public void setrollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getage() {
        return age;
    }

    public void setage(Integer age) {
        this.age = age;
    }

    public boolean isOptedForlunch() {
        return optedForlunch;
    }

    public void setOptedForlunch(boolean optedForlunch) {
        this.optedForlunch = optedForlunch;
    }

    public boolean isOptedForShuttle() {
        return isOptedForShuttle;
    }

    public void setOptedForShuttle(boolean optedForShuttle) {
        isOptedForShuttle = optedForShuttle;
    }

    public Integer getContributionToDonation() {
        return contributionToDonation;
    }

    public void setContributionToDonation(Integer contributionToDonation) {
        this.contributionToDonation = contributionToDonation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + rollNo +
                ", salary=" + age +
                ", optedForlunch=" + optedForlunch +
                ", isOptedForshuttle=" + isOptedForShuttle +
                ", contributionToDonation=" + contributionToDonation +
                '}';
    }
}

class EmployeeBuilder {
    private String name;
    private Integer rollNo;
    private Integer age;
    private boolean optedForlunch;
    private boolean isOptedForShuttle;
    private Integer contributionToDonation;

    public EmployeeBuilder(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getrollNo() {
        return rollNo;
    }

    public EmployeeBuilder setrollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Integer getage() {
        return age;
    }

    public EmployeeBuilder withage(Integer age) {
        this.age = age;
        return this;
    }

    public boolean isOptedForlunch() {
        return optedForlunch;
    }

    public EmployeeBuilder hasOptedForlunch(boolean optedForlunch) {
        this.optedForlunch = optedForlunch;
        return this;
    }

    public boolean isOptedForShuttle() {
        return isOptedForShuttle;
    }

    public EmployeeBuilder hasOptedForShuttle(boolean optedForShuttle) {
        isOptedForShuttle = optedForShuttle;
        return this;
    }

    public Integer getContributionToDonation() {
        return contributionToDonation;
    }

    public EmployeeBuilder willContributionAmountToDonation(Integer contributionToDonation) {
        this.contributionToDonation = contributionToDonation;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

public class Builderpattern {
    public static void main(String[] args) {
        Student student = new EmployeeBuilder("Naman",24)
                .withage(22)
                .willContributionAmountToDonation(2000)
                .hasOptedForShuttle(true)
                .hasOptedForlunch(false)
                .build();

        System.out.println(student);
    }
}


