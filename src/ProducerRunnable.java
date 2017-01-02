import java.util.Queue;

public class ProducerRunnable implements Runnable {
	public Queue<Integer> Buffer;
	public int size;
	
	public ProducerRunnable(Queue<Integer> _Buffer, int size) {
		this.Buffer = _Buffer;
		this.size = size;       			
		/*
		 * size is the amount of items in the queue which represents the buffer; 
		 * the buffer is thought to be fixed at the value of the constant SIZE in main() with size dictating the amount of items in it
		 * this is a simpler way to implement the buffer in java then to have a fixed capacity int[] and deal with deletions and null elements
		 */
	}
	
	public void run() {
		
		
	}
	
	public void Produce() {
		while (Buffer.size() == size) {
			int item = produceItem(Buffer);
			
			
			
		}
	}
	
	
	public int produceItem(Queue<Integer> _Buffer) {              //grab item from buffer
		return _Buffer.get();
	}
}
