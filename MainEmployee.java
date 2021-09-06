package ListSection;

public class MainEmployee {
    public static void main(String[] args) {
        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe= new Employee("John","Doe",4567);
        Employee marySmith= new Employee("Mary","Smith",22);
        Employee mikeWilson= new Employee("Mike","Wilson",3245);

        /*EmployeeSingleLinkedList list=new EmployeeSingleLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("Printing single linked list:");
        list.printList();

        list.search(22);

        Employee georgeRus=new Employee("George","Rus",63);
        list.addToBefore(georgeRus,3245);

        list.printList();

        list.search(5);
        Employee sebVettel=new Employee("Seb","Vettel",5);
        list.addAfter(sebVettel,63);

        list.printList();

        list.search(5);*/
        System.out.println("Printing double linked list: ");
        EmployeeDoubleLinkedList dlist=new EmployeeDoubleLinkedList();

        dlist.addToFront(janeJones);
        dlist.addToFront(johnDoe);
        dlist.addToFront(marySmith);
        dlist.addToFront(mikeWilson);
        dlist.printList();

        //dlist.search(22);

        Employee sebVettel=new Employee("Seb","Vettel",5);
        dlist.addBefore(sebVettel,123);

        dlist.printList();

        Employee geRus=new Employee("George","Rus",63);
        dlist.addAfter(geRus,3245);

        dlist.printList();

        dlist.remove(63);
        dlist.printList();

        /*Employee billEnd=new Employee("Bill","End", 78);
        dlist.addToEnd(billEnd);
        dlist.printList();

        dlist.removeFromFront();
        dlist.printList();

        dlist.removeFromEnd();
        dlist.printList();*/
    }
}
