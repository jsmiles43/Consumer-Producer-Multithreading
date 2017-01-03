import java.util.Queue;

public class ConsumerRunnable implements Runnable {
	public Queue<Integer> Buffer;
	public int itemCount;
	public int size;
	
	public ConsumerRunnable(Queue<Integer> Buffer, int size) {
		this.Buffer = Buffer;
		this.size = size;
	}
	
	public void run() {
		while(Buffer.isEmpty()) {
			try {
				
			}
			catch(InterruptedException ex) {
				
			}
		}	
	}

	public void Consume() throws InterruptedException {
		
	}
	
	public void consumerItem(Queue<Integer> _Buffer, int i) {			//insert random in into buffer
		_Buffer.get(index)
	}
}
