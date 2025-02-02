package com.zensar;

public class LinearQueue<G> 
{

		private G [] arr;
		private int size, front, rear;
		
		public LinearQueue() {
			super();
			   size=5;
			   arr=(G[]) new Object[size];
			   rear=-1;
			   front=0;
		}
	/*	public LinearQueue(G[] arr, int size, int front, int rear) {
			super();
			this.arr = arr;
			this.size = size;
			this.front = front;
			this.rear = rear;
		}*/
		 public boolean isFull() 
		   {
			   return rear==size-1;
		   }
		   public boolean isEmpty() 
		   {
			   return rear==-1;
		   }
		   
		public void insert(G data) 
		{
			 if(isFull())
			   {
				   System.out.println("Queue full");
			   }
			   else 
			   {
				   arr[++rear]=data;
			   }
		}
		 public G remove() 
		   {
			   if(isEmpty())
			   {
				   System.out.println("Queue Empty");
				   return null;
			   }
			   else {
				   return arr[front++];
			}
			   
		   }
		 public static void main(String args[]) 
		 {
			LinearQueue<Integer> linearQueue=new LinearQueue<Integer>();
			linearQueue.insert(111);
			linearQueue.insert(112);
			linearQueue.insert(113);
			linearQueue.insert(114);
			linearQueue.insert(115);
			System.out.println(linearQueue.remove());
			System.out.println(linearQueue.remove());
			System.out.println(linearQueue.remove());
		 }
		
}

