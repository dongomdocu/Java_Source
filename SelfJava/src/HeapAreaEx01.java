
public class HeapAreaEx01 {
	public static void main(String[] args) {
		int[] a = null; // int형 배열 선언 및 Stack 영역 공간 할당
		//위 구문은 크게 두가지 의미를 가진다. int[] a는 주소를 담을 공간을 만드는것. 스택 영역에 공간을 할당하는것이다. 이후 그 공간에 null을 채우는 것이다. 
		//두가지 의미로 나뉘는걸 잘 생각해야된다.
		//int[] a; // 고로 이 문장을 실행하고 print 하면 출력이 안된다.	
		System.out.println(a); // 결과 : null
		a = new int[5]; // Heap 영역에 5개의 연속된 공간 할당 및 
		                // 변수 a에 참조값 할당
		System.out.println(a); // 결과 : @15db9742 (참조값)
	}
}
