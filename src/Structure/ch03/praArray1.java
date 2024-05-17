package Structure.ch03;

public class praArray1 {
	
	// 멤버 변수
	private String[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수
	
	// 생성자
	public praArray1 (int capacity) {
		this.capacity = capacity;
		array = new String[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	} 
	
	// 편의 기능 만들기
	// isEmpty() 메서드
	public boolean isEmpty() {
		return size == 0;
	}
	
	// isFull() 메서드
	public boolean isFull() {
		return size == capacity;
	}
	
	// 1. 데이터 넣기 기능 구현
	public void enqueue(String item) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		} else {
			rear++;
			this.array[rear]=item;
			size++;
		}
	}
	
	// 2. 데이터 꺼내기 기능
	public String dequeue() {
		String item;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			item="~~";
			return item;
		} else {
			item = array[front];
			for(int i=front; i<rear; i++) {
				array[i]=array[i+1];
			}
		array[rear] = null;
		rear--;
		size--;
		}
		return item;
	}
	
	// 3. 데이터 찾기 기능 구현 (peek)
	public String peek() {
		String item="~";
		if(isEmpty()) {
			System.out.println("this Queue is empty");
			return item;
		} else {
			item=array[front];
			return item;
		}
	}
	
}
