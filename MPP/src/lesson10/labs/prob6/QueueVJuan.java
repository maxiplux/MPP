package lesson10.labs.prob6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class QueueVJuan {
	class Node {
		Object value;
		Node next;

	}

	private Node head;
	private Node tail;

	public void add(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;
	}

	synchronized public void addThreadSafe(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;
	}

	public Object remove() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	synchronized public Object removeThreadSafe() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	public int getSize() {
		int i = 0;
		Node temp = head;
		while (temp.next != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}

	public static void multipleThreadNotSafe(QueueVJuan q) {

		for (int i = 0; i <= 100; i++) {

			// Lambda Runnable
			Runnable task3 = () -> 
			{
				try {
					q.add((int) Math.random()*10 );
				}catch (Exception e) {
					// TODO: handle exception
					System.out.printf("WE have an exception on on handle the (problem of the diner philosophers)  \n ",e.getMessage());
				}
				
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
			new Thread(task3).start();
		}

	}

	public static void multipleThreadSafe(QueueVJuan q) {

		for (int m = 0; m < 10; m++) {
			Runnable r = () -> {
				for (int i = 0; i <= 100; i++)
					q.addThreadSafe(i);
			};
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			new Thread(r).start();

		}

	}

	public static void main(String[] args) {
		QueueVJuan q1 = new QueueVJuan();
		multipleThreadNotSafe(q1);

		System.out.println(q1.getSize());

		// -> the number of element is different every time we run multithread add
		// -> the number of adds may be fewer or more than we expected when running
		// multithread
		// to add new nodes to queue

		// THREAD SAFE
		QueueVJuan q2 = new QueueVJuan();
		multipleThreadSafe(q2);

		System.out.println(q2.getSize());
	}
}
