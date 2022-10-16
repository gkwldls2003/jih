package dept.hji.serivce;

import java.util.Scanner;

import dept.hji.command.DeptCommand;
import dept.hji.control.DeptAction;
//1. 부서 등록
//2. 부서 번호 등록
//3. 부서 이름 등록
//4. 부서 지역 등록
//5. Deptcommand 등록
//6. arrayList 추가
//7. 반환
public class DeptInsert implements DeptAction{
	@Override
	public DeptCommand execute(Scanner scanner) {
		System.out.println("부서를 등록하세요");
		System.out.print("부서 번호 : ");
		int deptno = scanner.nextInt();
		
		System.out.print("부서 이름 : ");
		String dname = scanner.next();
		
		System.out.print("부서 지역 : ");
		String loc = scanner.next();
		//DeptCommand클래스를 불러와 deptno, dname, loc를 불러온다
		DeptCommand deptCommand = new DeptCommand();
		deptCommand.setDeptno(deptno);
		deptCommand.setDname(dname);
		deptCommand.setLoc(loc);
		//arrayList에 추가한다, arrayList에 추가안하면 등록이 안된다
		arrayList.add(deptCommand);
		System.out.println("등록 되었습니다");
		//입력된 내용들을 반환한다.
		return deptCommand;
		
		
		
	}

}
