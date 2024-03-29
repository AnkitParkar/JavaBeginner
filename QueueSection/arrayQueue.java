package QueueSection;

import java.util.NoSuchElementException;

public class arrayQueue {
    private Employee[] queue;
    private int front,back;

    public arrayQueue(int capacity){ queue=new Employee[capacity]; }

    public void add(Employee employee){
        if ( back==queue.length) {
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue=newArray;
        }
        queue[back]=employee;
        back++;
    }

    public Employee remove(){
        if (size()==0)
            throw new NoSuchElementException();

        Employee employee=queue[front];
        queue[front]=null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }

        return employee;
    }

    /*public Employee peek(){
        if (size()==0)
            throw new NoSuchElementException();
        return

    }*/

    public int size(){ return back-front; }
}
