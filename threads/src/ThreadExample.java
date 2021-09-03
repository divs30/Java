
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main starts!!!");
		NumberThread t1 = new NumberThread(800, 1200); // new state
		NumberThread t2 = new NumberThread(1, 500);
		NumberThread t3 = new NumberThread(9000, 29200);
		t3.setDaemon(true);
		
		t1.start(); // ready state
		t2.start(); // ready state
		t3.start(); // ready state
		
		doTask();
		System.out.println("Main ends");
	}

	private static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : "  + t.getPriority()); // 1 -> 10
		System.out.println("Daemon :" + t.isDaemon()); // Non Daemon
		System.out.println("Group : " + t.getThreadGroup().getName());
	}

}
