package dept.hji.serivce;

import java.util.Scanner;

import dept.hji.command.DeptCommand;
import dept.hji.control.DeptAction;
//1. 부서 번호를 입력
//2. 수정하기 위해 기존에 있는 arrayList에 부서를 불러온다
//3. arrayList크기를 불러온다
//4. arrayList 크기를 불러온 후 수정하기 위해 삭제한다.
//5. 부서 수정을 입력
//6. 부서 번호 입력
//7. 수정할 부서 이름과 부서 지역을 입력
//8. Decommand로 등록한다
//9. arrayList로 추가한다.
//10. 입력된 arrayList에 있는 Decommand 들을 반환한다
public class DeptUpadate implements DeptAction {
	@Override
	public DeptCommand execute(Scanner scanner) {
		System.out.print("부서 번호 : ");
		int deptno = scanner.nextInt();
		int index = -1;
		//arrayList 부서리스트가 참이면 실행한다.
		if(arrayList.size() > 0) {
			//arrayList 부서리스트를 반복한다.
			for (int i = 0; i < arrayList.size(); i++) {
				//index 변수는 i 변수의 값에 따라 0부터 시작하여 반복한다.
				index = i;
				//부서를 삭제한다
				arrayList.remove(i);
				
			}
		}
		//등록된 부서가 없으면 실행한다.
		if(index == -1) {
			System.out.println("등록된 부서가 업습니다");
		}
		else {
			System.out.println("부서를 수정하세요");
			System.out.println("부서 번호 : " + deptno);
			
			System.out.print("수정할 부서 이름 : ");
			String dname = scanner.next();
			
			System.out.print("수정할 부서 지역 : ");
			String loc = scanner.next();
			//DeptCommand를 불러와 deptno, dname, loc를 불러온다
			DeptCommand deptCommand = new DeptCommand();
			deptCommand.setDeptno(deptno);
			deptCommand.setDname(dname);
			deptCommand.setLoc(loc);
			System.out.println("수정되었습니다");
			//arrayList에 입력된 내용을 추가한다
			arrayList.add(deptCommand);
			//입력된 내용을 반환한다.
			return deptCommand;
			
		}
		return null;
	}

}
