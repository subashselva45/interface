package io.pragra.learning;

public class HRMS {
    public void hireAEmployee(IEmployee employee){
        employee.hire();
    }
    public void terminateEmployee(IEmployee employee){
        employee.release();
    }
}
