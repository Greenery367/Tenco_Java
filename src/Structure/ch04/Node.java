package Structure.ch04;

public class Node {
	
	private String data;
	// 셀프 참조 = 자기 참조
    // 자기 참조는 객체가 자신과 같은 타입의 다른 객체를 
	// 가리키는 경우를 말합니다.
	// 용도 : 연결 리스트, 트리 구조에 많이 활용 됩니다.
	public Node next;


	public Node() {
		data = null;
		next = null;
	}
	
	public Node(String data) {
		this.data = data;
		next = null;
	}
	
	public Node(String data, Node link) {
		this.data = data;
		next = link;
	}
	
	public String getData() {
		return data;
	}
	
}
