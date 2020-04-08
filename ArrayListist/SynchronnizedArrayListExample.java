package ArrayListist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronnizedArrayListExample {
public static void main(String[] args) throws InterruptedException{
	List<Integer> safeArList = Collections.synchronizedList(new ArrayList<>());
	safeArList.add(1);
	safeArList.add(2);
	safeArList.add(3);
	
	// Create a thread pool of size 10
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	//Create a Runnable task that increments each element of the Arraylist bu one
	Runnable task = () ->{
		incrementArrayList(safeArList);
	};
	//Submit the task to the executor service 100 time
	// All the tasks will modify the ArrayList concurrently
	for (int i = 0; i < 100; i++) {
		executorService.submit(task);
	}
	executorService.submit(task);
	executorService.awaitTermination(60, TimeUnit.SECONDS);
	System.out.println(safeArList);
}

private static void incrementArrayList(List<Integer> safeArList) {
	synchronized (safeArList) {
		for (int i = 0; i < safeArList.size(); i++) {
			Integer value = safeArList.get(i);
			safeArList.set(i, value +1);
		}
	}
	
}


}
