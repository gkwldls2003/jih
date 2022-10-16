package dept.hji.control;

import java.util.ArrayList;
import java.util.Scanner;

import dept.hji.command.DeptCommand;
//공통적으로 사용해야할 추상메소드를 넣는다.
public interface DeptAction {
	//상수를 선언할 때 static final은 생략할 수 있으며 초기 용량이 10인 비어있는 크기 조정 가능한 배열의 인스턴스를 선언한다.
	ArrayList<DeptCommand> arrayList = new ArrayList<DeptCommand>();
	//추상 메소드를 선언할 때 abstract 지정어를 생략할 수 있다
	public DeptCommand execute(Scanner scanner);
		
	

}
