package com.iu.s4.objects1.ex1;

import java.util.Scanner;
import java.util.Arrays;
public class StudentInput {
	//findStudent = 학생 배열을 받아서 번호입력, 일치하는 학생을 리턴 없을경우 null
	public String findStudent(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 번호를 입력");
		int num = sc.nextInt();
		Student student = null;
		for(int i = 0; i < students.length; i ++) {
			if(students[i].num == num) {
				student = students[i];
//				return students[i]
			}
		}
		return student.name;
	}
	
	
	//학생의 정보를 입력
	//setStudent
	//학생한명 객체를 생성해서, 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	public Student[] setStudent(Student students[]) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학생 이름 입력");
		student.name = sc.next();
		System.out.println("학생 번호 입력");
		student.num = sc.nextInt();
		System.out.println("학생 국어 점수 입력");
		student.kor = sc.nextInt();
		System.out.println("학생 영어 점수 입력");
		student.eng = sc.nextInt();
		System.out.println("학생 수학 점수 입력");
		student.math = sc.nextInt();
		
		student.total = student.kor + student.eng + student.math;
		student.avg = student.total/3;
		
		Student addStudents[] = new Student[students.length+1];
		for(int i = 0;  i < students.length; i ++) {
			addStudents[i] = students[i];
		}
		addStudents[students.length] = student;

		return addStudents;
	}
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	public void setAllStudents(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i ++) {
			Student student = new Student();
			System.out.println("학생 이름 입력");
			student.name = sc.next();
			System.out.println("학생 번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 점수 입력");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3;
			students[i] = student;
		}
		
	}

	public void changeInfo(Student[] students) {
		Student student = new Student();
	
		int count = 0;
		int chnum = 0;
		int chList[] = {};
		boolean ch1 = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("바꿀 학생 이름 입력");
		String chname = sc.next();
	
		for(int i = 0; i < students.length; i ++) {
			if(students[i].name == chname) {
				chnum = i;
			}
		}
		
		int demo[] = new int[6];
		
		while(ch1) {
			System.out.println("바꿀 정보 선택 : 1. 이름 2. 번호 3. 국어 점수 4. 영어 점수 5. 수학 점수 6. 더 바꿀내용 없음");
			int dNum = sc.nextInt();
			if(dNum == 6) {
				demo[count] = dNum;
				count ++;
				int dChList[] = new int[count];
				for( int i = 0; i < dChList.length; i ++) {
					dChList[i] = demo[i];
				}
				chList = dChList;
				ch1 = false;
			}else {
				demo[count] = dNum;
				count ++;
				continue;
			}			
		}		
	
		for( int i = 0; i < chList.length; i ++) {
			switch(chList[i]) {
			case 1:
				System.out.println("바꿀 이름 입력");
				students[chnum].name = sc.next();
				break;
			case 2:
				System.out.println("바꿀 번호 입력");
				students[chnum].num = sc.nextInt();
				break;
			case 3:
				System.out.println("바꿀 국어 점수 입력");
				students[chnum].kor = sc.nextInt();
				break;
			case 4:
				System.out.println("바꿀 영어 점수 입력");
				students[chnum].eng = sc.nextInt();
				break;
			case 5:
				System.out.println("바꿀 수학 점수 입력");
				students[chnum].math = sc.nextInt();
				break;
			default:
				System.out.println("잘못 입력함");
			}
		}
	}
}
