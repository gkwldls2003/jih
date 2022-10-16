package dept.hji.view;

import java.util.Scanner;

import dept.hji.serivce.DeptDelete;
import dept.hji.serivce.DeptInsert;
import dept.hji.serivce.DeptList;
import dept.hji.serivce.DeptListDetail;
import dept.hji.serivce.DeptUpadate;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//참 거짓과 상관없이 do문을 실행한다.
		do {
			System.out.println();
			System.out.println("번호를 입력하세요");
			System.out.println("1. 부서 전체 조회 " + "2. 부서 등록 " + "3. 부서 수정 " + "4. 부서 식제 " + "5. 부서 상세 조회 " + "6. 종료 ");
			System.out.print("번호 입력 : ");
			String choice = scanner.next();
			
			switch (choice) {
			case "1":
				//DeptList클래스를 불러온다
				DeptList deptList = new DeptList();
				deptList.execute(scanner);
				break;
			case "2":
				//DeptInsert클래스를 불러온다
				DeptInsert deptInsert = new DeptInsert();
				deptInsert.execute(scanner);
			break;
			
			case "3":
				//DeptUpdate클래스를 불러온다
					DeptUpadate deptUpadate = new DeptUpadate();
					deptUpadate.execute(scanner);
			break;
			
			case "4":
				//DeptDelete클래스를 불러온다
					DeptDelete deptDelete = new DeptDelete();
					deptDelete.execute(scanner);
			break;
			
			case "5":
				//DeptDetail클래스를 불러온다
					DeptListDetail deptListDetail = new DeptListDetail();
					deptListDetail.execute(scanner);
			break;
			
			case "6":
				
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
			break;
			
			default:
				System.out.println("1번에서 6번 중의 번호를 선택하세요");
				break;
			}
		}while(true);
	}

}
