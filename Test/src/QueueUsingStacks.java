import java.util.Stack;

public class QueueUsingStacks {

	Stack<Integer> stackleft = new Stack<Integer>();
	Stack<Integer> stackright = new Stack<Integer>();
	
	public void queue_push(int num){
		stackleft.push(num);
		
	}
	
	public Integer queue_pop(){
		if (!stackright.isEmpty()){
			return stackright.pop();
		}else{
			while(!stackleft.isEmpty()){
				stackright.push(stackleft.pop());
			}
			return stackright.pop();
		}
	}

	public static void main(String[] args) {
		
		QueueUsingStacks queue = new QueueUsingStacks();
		queue.queue_push(10);
		queue.queue_push(20);
		queue.queue_push(30);
		queue.queue_push(40);
		
		int i = queue.queue_pop();
		System.out.println(i);
		
		queue.queue_push(50);
		queue.queue_push(60);
		queue.queue_push(70);
		queue.queue_push(80);
		
		i = queue.queue_pop();
		System.out.println(i);
		
		i = queue.queue_pop();
		System.out.println(i);
		
		i = queue.queue_pop();
		System.out.println(i);
		
		i = queue.queue_pop();
		System.out.println(i);
		
		
		

	}

}
