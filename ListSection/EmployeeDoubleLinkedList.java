package ListSection;

public class EmployeeDoubleLinkedList {
    private int size;
    private EmployeeNode head, tail;

    public void addToFront(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        node.setNext(head);
        if (head==null)
            tail=node;
        else
            head.setPrevious(node);
        head=node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        if (tail==null)
                head=node;
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;

    }

    public EmployeeNode addBefore(Employee employee, int id){
        if (isEmpty())
            return null;
        EmployeeNode node=new EmployeeNode(employee);
        if(head.getEmployee().getId()==id)
            addToFront(employee);
        else {
            EmployeeNode base = getNode(id);
            if (base == null) {
                System.out.println("ID not present");
                return null;
            }
            base.getPrevious().setNext(node);
            node.setNext(base);
            base.setPrevious(node);
            size++;
        }
        return null;
    }

    public void addAfter(Employee employee, int id){
        if ( isEmpty())
            return;
        EmployeeNode node = new EmployeeNode(employee);
        if(tail.getEmployee().getId()==id)
            addToEnd(employee);
        else{
            EmployeeNode base=getNode(id);
            if (base== null){
                System.out.println("Id not present.");
                return;
            }
            node.setNext(base.getNext());
            base.setNext(node);
            node.setPrevious(base);
            size++;
        }
    }

    public void remove(int id){
        if (isEmpty())
            return;
        if(head.getEmployee().getId()==id)
            removeFromFront();
        else if(tail.getEmployee().getId()==id)
            removeFromEnd();
        else{
            EmployeeNode node=getNode(id);
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
            node=null;
        }
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty())
            return null;
        EmployeeNode removedNode=head;
        if (head.getNext() == null)
            tail=null;
        else
            head.getNext().setPrevious(null);
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if (isEmpty())
            return null;
        EmployeeNode removedNode=tail;
        if (tail.getPrevious()==null)
            head=null;
        else
            tail.getPrevious().setNext(null);
        tail=tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public EmployeeNode getNode(int id){
        EmployeeNode current=head;
        while(current!=null){
            if(current.getEmployee().getId()==id)
                return current;
            current=current.getNext();
        }
        return null;
    }

    public void search(int id){
        if (isEmpty())
            return;
        EmployeeNode current=head;
        while(current!=null){
            if( current.getEmployee().getId()==id){
                System.out.println("Id "+id+ " found");
                System.out.println(current);
                return;
            }
            current=current.getNext();
        }
        System.out.println("Id "+id+" not found. ");
    }
    public void printList(){
        EmployeeNode current=head;
        System.out.println("Size of list: "+getSize());
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current.toString());
            System.out.print(" <-> ");
            current=current.getNext();
        }
        System.out.print("null");
        System.out.println();
    }

    public int getSize(){ return size; }

    public boolean isEmpty(){ return head==null; }


}
