package collections;

import java.util.PriorityQueue;

public class TrabalhandoComQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Double> fila = new PriorityQueue<>();
		
		fila.offer(1D);
		fila.offer(2D);
		fila.offer(3D);
		fila.offer(4D);
		fila.offer(5D);
		
		while(!fila.isEmpty()) {
			System.out.println(fila.poll());
		}
	}
}
