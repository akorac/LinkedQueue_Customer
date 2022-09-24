public class LinkedQueue<T>
{
    protected PersonNode<T> front;
    protected PersonNode<T> rear;
    protected int numElements;

    public LinkedQueue()
    {
        front = null;
        rear = null;
        numElements = 0;
    }

    public void enqueue(T fName, T lName, T sNum)
    {
        //Complete this method as required in the homework instructions.
        PersonNode<T> node = new PersonNode<T>(fName,lName,sNum);
        numElements++;
        if(isFull())
            throw new QueueOverflowException("The queue is full");

        if(front == null){
            front = node;
            rear = node;
        }
        else {
            rear.link = node;
            rear = node;
        }
    }


    public T dequeue()
    {
        //Complete this method as required in the homework instructions.

        if(front == null){
            throw new QueueUnderflowException("The queue is empty");
        }

        if(front != null) {
            PersonNode<T> node = front;
            front = front.link;
            if(front == null)rear = null;
            numElements--;
            return (T) (node.firstName + " " + node.lastName+ " " + node.serviceNum);
        }
        return (T) "";

    }

    public CustomerITD peekFront()
    {
        //Complete this method as required in the homework instructions.
        if (front == null) return null;
        System.out.println(front.firstName + " " + front.lastName+ " " +front.serviceNum);
        return null;
    }

    public boolean contains(T lookFor)
    {
        //Complete this method as required in the homework instructions.
        PersonNode<T> node = front;
        while(node != null) {
            if(node.firstName == lookFor && node.lastName == lookFor)
                return true;
            node = node.link;
        }
        return false;
    }

    public void display()
    {
        //Complete this method as required in the homework instructions.
        PersonNode<T> node = front;
        while(node != null) {
            System.out.println(node.firstName + " " + node.lastName+ " " + node.serviceNum);
            node = node.link;
        }
    }

    public int size()
    {
        return numElements;
    }

    public boolean isFull()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return numElements == 0;
    }
}

