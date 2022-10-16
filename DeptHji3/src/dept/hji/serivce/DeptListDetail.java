package dept.hji.serivce;

import java.util.Scanner;

import dept.hji.command.DeptCommand;
import dept.hji.control.DeptAction;
	//1. arrayList 부서 리스트 크기를 확인한다
	//2. 부서 번호를 입력한다
	//3. arrayList 부서 리스트를 반복한다
	//4. 부서 번호와 arrayList 부서 리스트를 확인한다.
	//5. 여기서부터 세부 리스트를 나오게 해야 함
	//6. arrayList 부서리스트를 반복한다
	//7. 부서 번호와 arrayList 부서 리스트를 확인한다.
	//8. arrayList에 있는 DeptCommand 내용을 가져온다.
public class DeptListDetail implements DeptAction {
	@Override
	public DeptCommand execute(Scanner scanner) {
		//arrayList 부서 리스트가 참이면 실행한다
		if(arrayList.size() > 0) {
			System.out.print("부서 번호 입력 : ");
			int deptno = scanner.nextInt();
			int index = -1;
			//arrayList 크기를 반복한다.
			for (int i = 0; i < arrayList.size(); i++) {
				if(deptno == arrayList.get(i).getDeptno()) {
					index = i;
				}
			}
			if(index == -1) {
				System.out.println("등록된 부서가 없습니다");
			}
			else {
				for (int i = 0; i < arrayList.size(); i++) {
					//입력된 depno와 arrayList에  DeptCommand에 있는 deptno가 같은면 실행
					if(deptno == arrayList.get(i).getDeptno()) {
						//DeptCommand클래스를 불러와 deptno, dname, loc를 불러온다
						System.out.print("부서 번호 : " + deptno + ", ");
						System.out.print("부서 이름 : " + arrayList.get(i).getDname() + ", ");
						System.out.print("부서 지역 : " + arrayList.get(i).getLoc());
					}
				}
			}
		}
		
		return null;
	}

}
