import java.util.*;
public class TestCustomerITD {
    public static void main(String[] args) {

        Scanner ak = new Scanner(System.in);
        try {
            LinkedQueue queue = new LinkedQueue();
            int choice;
            do {


                System.out.println("\n1-Insert\n2- Remove\n3- Who is next?\n4- Check if empty\n"
                        + "5- Check the size\n6- Check if contains\n7- display the queue\n0- stop");

                System.out.print("\nEnter your choice: ");
                choice = ak.nextInt();
                switch (choice) {
                    case 1:
                    {
                        System.out.print("Enter First Name: ");
                        String firstName = ak.next();
                        System.out.print("Enter Last Name: ");
                        String lastName = ak.next();
                        CustomerITD a = new CustomerITD(firstName, lastName);
                        queue.enqueue(firstName,lastName, a.getServiceNumber());
                        break;
                    }
                    case 2:
                    {
                        CustomerITD a = (CustomerITD) queue.dequeue();
                        if(a == null)
                        {
                            System.out.println("Empty Queue");
                        }
                        else
                        {
                            System.out.println(a);
                        }
                        break;
                    }
                    case 3:
                    {
                        CustomerITD a = queue.peekFront();
                        if(a == null)
                        {
                            System.out.println("Empty Queue");
                        }
                        else
                        {
                            System.out.println(a);
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Empty? " + queue.isEmpty());
                        break;
                    }

                    case 5:
                    {
                        System.out.println("Size: " + queue.size());
                        break;
                    }
                    case 6:
                    {
                        System.out.print("Enter first name or last name: ");
                        String name = ak.next();
                        System.out.println("Queue? " +queue.contains(name));
                        break;
                    }
                    case 7:
                    {
                        queue.display();
                        break;
                    }
                    case 0:
                    {
                        System.out.println("Stop");
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong choice, try again");
                        break;
                    }
                }

            } while (choice != 0);
        }
        catch(Exception e) {
            System.out.println(e);
            ak.close();
        }

    }
}
