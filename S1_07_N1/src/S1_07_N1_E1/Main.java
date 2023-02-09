package S1_07_N1_E1;

import S1_07_N1_E1.domain.OnlineEmployee;
import S1_07_N1_E1.domain.PresencialEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer hours = askHoursWorked();
        OnlineEmployee onlineEmployee = new OnlineEmployee("Juan", "Lopez", 50.0);

        Double salary = onlineEmployee.calcSalary(hours);
        System.out.println("Trabajador online ha hecho " + hours + " horas:\nSu salario es: " + salary);

        PresencialEmployee presencialEmployee = new PresencialEmployee("Albert", "Sanchez", 50.0);
        System.out.println("Trabajador presencial ha hecho " + hours + " horas:\nSu salario es: " + presencialEmployee.calcSalary(hours));
    }

    private static Integer askHoursWorked() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número de horas de los trabajadores");
        return Integer.parseInt(sc.nextLine());
    }
}