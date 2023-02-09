package S1_07_N1_E2.domain;

public class OnlineEmployee extends Employee {
    private static final double FLAT_RATE_INTERNET = 25.0;
    private static final double INCREMENT_SALARY = 0.3;

    public OnlineEmployee(String name,
                          String surname,
                          double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public Double calcSalary(Integer numberOfHours) {
        return numberOfHours * getPriceHour() + FLAT_RATE_INTERNET;
    }

    @Deprecated
    public String showOnlineVacances() {
        return "Las vacaciones son del 15 de julio al 15 de agosto";
    }

    @Deprecated
    public Double calcIncrement(Double salary) {
        return salary += salary * INCREMENT_SALARY;
    }

}
