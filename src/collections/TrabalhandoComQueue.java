package collections;

import java.util.PriorityQueue;

public class TrabalhandoComQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Double> fila = new PriorityQueue<>();
		
		//incluindo elementos na fila
		fila.offer(1D);
		fila.offer(2D);
		fila.offer(3D);
		fila.offer(4D);
		fila.offer(5D);
		
		//imprimindo
		for (Double double1 : fila) {
			System.out.println(double1);
		}
		
		System.out.println("------------");
		
		//retirando elementos da fila
		while(!fila.isEmpty()) {
			System.out.println(fila.poll());
		}

		System.out.println("------------");
		
		//deve ser 0
		System.out.println(fila.size());
	}
}
