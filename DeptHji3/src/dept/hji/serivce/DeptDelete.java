package dept.hji.serivce;

import java.util.Scanner;

import dept.hji.command.DeptCommand;
import dept.hji.control.DeptAction;
//1. 삭제할 부서 번호를 입력
//1. arrayList 부서가 있으면 참
//2. arrayList 부서크기를 반복한다.
//3. 반복했는데 부서 번호와 일치하면 입력된 부서를 삭제한다.
//4. 부서 번호를 확인을 한다.
//5. arraryList가 있으면  부서목록을 확인한다
//6. arrayList가 있으면 arrayList 크기를 반복한다
//7. Integer.ValueOf(스택은 순서대로 쌓이는데  나가야하는데 중간에 삭제할 수 있는거?)를 사용하여 삭제한다. 그리고 break
public class DeptDelete implements DeptAction{
	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	@Override
	public DeptCommand execute(Scanner scanner) {
		
		System.out.println("삭제할 부서 번호를 입력하세요");
		System.out.print("부서 번호 : ");
		int deptno = scanner.nextInt();
		//arrayList 부서 리스트가 참이면 실행한다
		if(arrayList.size() > 0) {
			int index = -1;
			//arrayList 크기를 반복한다.
			for (int i = 0; i < arrayList.size(); i++) {
				//입력된 depno와 arrayList에  DeptCommand에 있는 deptno가 같은면 실행
				if(deptno == arrayList.get(i).getDeptno()) {
					index = i;
					//부서를 삭제한다.
					arrayList.remove(i);
					System.out.println("삭제했습니다");
				}
			}
			if(index == -1) {
				System.out.println("등록된 부서 번호가 없습니다");
			}
			else {
				//arrayList 부서 리스트가 참이면 실행한다
				if(arrayList.size() > 0) {
					//arrayList 크기를 반복한다.
					for (int i = 0; i < arrayList.size(); i++) {
						//지정된 정수값을 나타내는 Integer 인스턴스를 반환하여 입력한 숫자로 반환한다.
						arrayList.remove(Integer.valueOf(i));
						System.out.println("삭제하였습니다");
						break;
					}
				}
			}
		}
		else {
			System.out.println("등록된 부서가 업습니다.");
		}
		return null;
	}

}
