package ListSection;

public class EmployeeSingleLinkedList {
    private int size;
    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty())
            return null;
        EmployeeNode removedNode= head;
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void addToBefore(Employee employee,int id){
        if (isEmpty())
            return;
        EmployeeNode node=new EmployeeNode(employee);
        if (head.getEmployee().getId()==id){
            node.setNext(head);
            head=node;
        }
        else{
            EmployeeNode after=getNode(id);
            after.toString();
            node.setNext(after);
            getPreviousNode(id).setNext(node);
        }
        size++;
    }

    public void addAfter(Employee employee,int id){
        EmployeeNode node=new EmployeeNode(employee);
        if (isEmpty())
            return;
        if(head.getEmployee().getId()==id){
            node.setNext(head.getNext());
            head.setNext(node);
        }
        else {
            EmployeeNode found = getNode(id);
            node.setNext(found.getNext());
            found.setNext(node);
        }
        size++;
        return;
    }
    public EmployeeNode getPreviousNode(int id){
        EmployeeNode beforeCurrent=null;
        EmployeeNode current=head;
        while(current!=null){
            if( current.getEmployee().getId()==id)
                return beforeCurrent;
            beforeCurrent=current;
            current=current.getNext();
        }
        return null;
    }
    public EmployeeNode getNode(int id){
        if (isEmpty())
            return null;
        EmployeeNode current=head;
        while(current!=null){
            if( current.getEmployee().getId()==id)
                return current;
            current=current.getNext();
        }
        return current;
    }


    public void search(int id){
        if (isEmpty())
            return;
        EmployeeNode current=head;
        while( current!=null){
            if ((current.getEmployee().getId()==id)) {
                System.out.println("Id "+id+" found.");
                System.out.println(current);
                return;
            }
            current=current.getNext();
        }
        System.out.println("Id "+id+" not found.");
    }

    public int getSize(){ return size; }

    public boolean isEmpty(){ return head == null; }

    public void printList(){
        EmployeeNode current=head;
        System.out.println("Size of list: "+getSize());
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current.toString());
            System.out.print(" -> ");
            current=current.getNext();
        }
        System.out.print("null");
        System.out.println();
    }
}
