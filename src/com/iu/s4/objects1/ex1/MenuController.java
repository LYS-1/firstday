package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	//
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	
	public void start() {
		StudentInput sInput = new StudentInput();
		StudentView sView = new StudentView();
		
		boolean check=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student students[] = new Student[count];
		
		
		while(check) {
			System.out.println("1.등록");
			System.out.println("2.학생 검색 정보 출력");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.학생 정보 수정");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				sInput.setAllStudents(students);
				break;
			case 2:
				System.out.println("학생 검색 정보를 출력합니다.");
				String fName = sInput.findStudent(students);
				for(int i = 0; i < students.length; i ++) {
					if( students[i].name == fName) {
						sView.view(students[i]);
						break;
					}
				}
				break;
			case 3:
				System.out.println("학생 전체 정보를 출력합니다");
				sView.view(students);
				break;
			case 4:
				System.out.println("학생 정보를 수정합니다.");
				sInput.changeInfo(students);
				break;
			case 5:
				System.out.println("학생 정보를 추가합니다.");
				students = sInput.setStudent(students);
				break;
			default:
				System.out.println("종료");
				check=false;
				break;
			}
			
		}
		
		
		
	}
	
	

}
