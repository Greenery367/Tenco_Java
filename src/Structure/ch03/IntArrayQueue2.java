package Structure.ch03;

public class IntArrayQueue2 {

	private int[] array;
	private int front; // 큐의 시작 점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0; // 시작점이 0이다
		this.rear = -1; //
		this.size = 0;  
	} // 생성자
	
	// 편의 기능 만들어보기
	public boolean isEmpty() {
		return size == 0; // 비어있다면 true, 아니라면 false
	}
	
	public boolean isFull() {
		return size == capacity; // 가득 찼다면 true, 아니라면 false
	}
	
	// todo 1 - 데이터 넣기 기능 구현
	public void enqueue(int item) {
			// 코드 수정
			// [10] [20] [30]
			// 나머지 연산자를 활용한다.
			// 1 = 1 % 5; 
			// 몫 0, 나머지 1
			// 2 = 2 % 5;
			// 몫 0, 나머지 2
			
			// x =   0  %  3 (임시값 3), rear = 0
			// x =   1  %  3  --> rear = 1
			// x =   2  %  3  --> rear = 2
			// x =   3  %  3  --> rear = 0
			// x =   1  %  3  --> rear = 1
			rear = (rear+1) % capacity;
			array[rear] = item;
			size++;
	}
	
	// todo 2 - 데이터 꺼내기 기능 구현 
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -9999;
		}
		int item = array[front];
		// [10] [20] [30]
		front = (front+1)%capacity;
		return item;
	}
	
	
	// todo 3 - 데이터 찾기 기능 구현 (peek)
	public int peek() {
		int item;
		if(isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			item=-9999;
			return item;
		} else {
			item=array[front];
			return item;
		}
	}
	
	//
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	
	// 코드 테스트
	public static void main(String[] args) {
	
		IntArrayQueue2 queue = new IntArrayQueue2(3);
		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); 
		queue.enqueue(500); 
		// 안 들어감.
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
	} // end of main

	
	
	
} // end of class



