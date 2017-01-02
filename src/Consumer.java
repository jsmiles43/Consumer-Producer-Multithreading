import java.util.Queue;

public class Consumer implements Runnable {
	public Queue<Integer> Buffer;
	public int itemCount;
	public int size;
	
	public Consumer(Queue<Integer> Buffer) {
		this.Buffer = Buffer;
		this.itemCount = Buffer.capacity();
	}
	
	public void run() {
		while(Buffer.isEmpty()) {
			
		}	
	}

	
	public void consumerItem(Queue<Integer> _Buffer, int i) {			//insert random in into buffer
		_Buffer.get(index)
	}
}
