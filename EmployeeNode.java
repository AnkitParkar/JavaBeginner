package ListSection;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next,previous;//For single, only next is used. For double, both are used.

    public EmployeeNode(Employee employee){ this.employee=employee; }

    public Employee getEmployee() { return employee; }

    public void setEmployee(Employee employee) { this.employee = employee; }

    public EmployeeNode getNext() { return next; }

    public void setNext(EmployeeNode next) { this.next = next; }

    public void setPrevious(EmployeeNode previous){ this.previous=previous; }

    public EmployeeNode getPrevious(){ return previous; }

    @Override
    public String toString(){
        return employee.toString();
    }
}
