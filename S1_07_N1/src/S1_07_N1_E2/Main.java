package S1_07_N1_E2;


import S1_07_N1_E2.domain.OnlineEmployee;
import S1_07_N1_E2.domain.PresencialEmployee;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Integer hours = askHoursWorked();
        OnlineEmployee onlineEmployee = new OnlineEmployee("Juan", "Lopez", 50.0);

        Double salary = onlineEmployee.calcSalary(hours);
        System.out.println("Trabajador online ha hecho " + hours + " horas:\nSu salario es: " + salary);
        System.out.println("Ej. Deprecated. Las vacaciones son: " + onlineEmployee.showOnlineVacances());
        System.out.println("Ej. Deprecated. Nuevo sueldo con el incremento: " + onlineEmployee.calcIncrement(salary));


        PresencialEmployee presencialEmployee = new PresencialEmployee("Albert", "Sanchez", 50.0);
        System.out.println("Trabajador presencial ha hecho " + hours + " horas:\nSu salario es: " + presencialEmployee.calcSalary(hours));
        System.out.println("Las vacaciones son: " + presencialEmployee.showPresencialVacances());
    }

    private static Integer askHoursWorked() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número de horas de los trabajadores");
        return Integer.parseInt(sc.nextLine());
    }
}