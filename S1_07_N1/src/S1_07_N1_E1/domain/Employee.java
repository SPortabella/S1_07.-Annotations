package S1_07_N1_E1.domain;

public abstract class Employee {
    private String name;
    private String surname;
    private Double priceHour;

    public Employee(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public abstract Double calcSalary(Integer numberOfHours);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(Double priceHour) {
        this.priceHour = priceHour;
    }
}
