package S1_07_N1_E2.domain;

public class PresencialEmployee extends Employee{

    private static Double gasoline=10.0;

    public PresencialEmployee(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public Double calcSalary(Integer numberOfHours) {
        return numberOfHours*getPriceHour()+gasoline;
    }
    @Deprecated
    public String showPresencialVacances(){
        return "Las vacaciones son del 1 al 31 de agosto";
    }

}
