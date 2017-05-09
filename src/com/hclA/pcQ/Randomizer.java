package com.hclA.pcQ;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Randomizer implements Runnable{

	Random rand = new Random();
	
    BlockingQueue<Message> isPrimeQ = new ArrayBlockingQueue<>(100);
    BlockingQueue<Integer> randomIntQ = new ArrayBlockingQueue<>(100);

	public Randomizer(BlockingQueue<Integer> randomIntQ,
			BlockingQueue<Message> isPrimeQ) {
		this.isPrimeQ = isPrimeQ;
		this.randomIntQ = randomIntQ;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100 ; i++) {

			int  n = rand.nextInt(5000) + 1;
			randomIntQ.add(n);
			//5000 is the maximum and the 1 is our minimum 


			try{
				Thread.sleep(1000);

				//consuming messages until exit message is received
				Message msg = isPrimeQ.take();
				System.out.println(msg.getMsg());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
