package useful.ch07;


	public class Spaceship {
	    
		// 배열 - 이 우주선 설계는 엔진을 최대 3개 까지 
		// 장착할 수 있다. 
		private Engine innerEngine;

	    // 정적 내부 클래스 Engine
	    public static class Engine {
	       
	    	  public static int engineCount = 0;
	        private int serialNumber;

	        public Engine() {
	            this.serialNumber = ++engineCount;
	        }

	        public void start() {
	            System.out.println("Engine " + serialNumber + " 동작 합니다. 부릉~~");
	        }
	    } // end of inner class 

	    
	    // 우주선에 엔진 추가
	    // 생성자 의존 주입
	    // 메서드 의존 주입
	    public void addEngine(Engine engine) {
	    	  innerEngine = engine;
	        System.out.println("엔진 : " + innerEngine.serialNumber + " 을 장착 합니다");
	        Engine.engineCount++; 
	    }
	    
	    public void startSpaceShip() {
	    	if (innerEngine == null) {
	    		System.out.println("엔진을 먼저 장착해주세요");
	    	} else {
	    		System.out.println("달나라로 출발 합니다 슈웅~");
	    	}
	    }
	    
	} // end of class 


