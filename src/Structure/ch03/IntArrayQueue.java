package Structure.ch03;

public class IntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue(int capacity) {
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
		if(isFull()) {
			System.out.println("큐 메모리 공간이 가득합니다.");
		} else {
			// rear = -1;
			rear++; // 0 <-- 첫 동작시 
			array[rear] = item; // array[0] = item;
			size++;
		}
	}
	
	// todo 2 - 데이터 꺼내기 기능 구현 
	public int dequeue() {
		int item = -9999;
		if(isEmpty()) {
			System.out.println("큐 메모리 공간이 비어있습니다.");
		} else {
			// 잠시 데이터 꺼내보기
			item = array[front]; // 0번째 요소를 접근
			//100 200 300
			// f - 0 (첫 꺼낼 시)
			for(int i=front; i<rear; i++) { // 0 < 2
				// array[0] = array[1]
				// 200, 200, 300 --> 첫번째 동작 (for)
				// 200, 300, 300 --> 두번째 동작 (for)
				array[i] = array[i+1]; 
			}
			// 200, 300, 0
			// 마지막 요소를 초기화 처리한다.
			array[rear] = 0;
			rear--;
			size--;
		}
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
			System.out.println("Peak : "+ item);
			return item;
		}
	}
	

	
	// 코드 테스트
	public static void main(String[] args) {
	
		IntArrayQueue queue = new IntArrayQueue(3);
		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 총 4개의 데이터 넣기.
		// 안 들어감.
		
		// 데이터 꺼내고 삭제 처리
		//queue.dequeue(); // 맨 처음 들어온 녀석부터 꺼내지고, 삭제처리 된다.
		queue.peek();
		queue.dequeue();
		queue.peek();
		queue.dequeue();
		
		
	} // end of main

	
	
	
} // end of class



