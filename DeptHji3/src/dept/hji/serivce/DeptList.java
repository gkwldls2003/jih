package dept.hji.serivce;

import java.util.Scanner;

import dept.hji.command.DeptCommand;
import dept.hji.control.DeptAction;
//1. arrayList 부서리스트를 확인한다
//2. 확인 후 참이면arrayList 부서리스트를 반복한다, 거짓이면 else에 내용을 적는다
//3. 부서리스트를 불러오기위해 arrayList에 있는 DepCommand의 내용을 가져온다
public class DeptList implements DeptAction{
	@Override
	public DeptCommand execute(Scanner scanner) {
				
		//arrayList에 있는 부서리스트가 참이면 실행
		if(arrayList.size() > 0 ) {
			//arrayList 부서리스트를 반복한다
			for (int i = 0; i < arrayList.size(); i++) {
				//arrayList에 있는Depcommand에서 deptno를 가져온다
				System.out.print("부서 번호 : " + arrayList.get(i).getDeptno() + ", ");
				//arrayList에 있는Depcommand에서 dname를 가져온다
				System.out.print("부서 이름 : " + arrayList.get(i).getDname() + ", ");
				//arrayList에 있는Depcommand에서 loc를 가져온다
				System.out.print("부서 지역 : " + arrayList.get(i).getLoc());
				System.out.println();
			}
		}
		else {
			//arrayList에 있는 부서리스트가 없으면 실행
			System.out.println("등록된 부서가 없습니다");
		}
		return null;
	}

}
