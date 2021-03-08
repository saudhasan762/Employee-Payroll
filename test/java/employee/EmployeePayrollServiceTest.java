package employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    void given3EmployeeDataWhenWrittenToFilesShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp={
                new EmployeePayrollData(1,"Jeff Bezos",10000.0),
                new EmployeePayrollData(2,"Bill Gates",20000.0),
                new EmployeePayrollData(3,"Mark",150000.0),
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        System.out.println(entries);
        Assertions.assertEquals(3,entries);
    }
}
