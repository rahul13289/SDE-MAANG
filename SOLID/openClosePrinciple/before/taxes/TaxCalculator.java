package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculator {
    private final int INCOME_TAX_PERCENTAGE = 20;
    private final int PROFESSIONAL_TAX_PERCENTAGE = 3;


    public double calculate(Employee employee) {
        return 
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

    }
}