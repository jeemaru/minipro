package com.javaex.phonebook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PhonebooskApp {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		ArrayList<Person> arrayList = new ArrayList<Person>();
		Reader in = new FileReader("./PhoneDB.txt");
		BufferedReader br = new BufferedReader(in);

		while (true) {

			System.out.println("******************************");
			System.out.println("*      전화번호 관리 프로그램      *");
			System.out.println("******************************");
			System.out.println("");
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.print(">메뉴번호: ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("<1.리스트>");
				while (true) {
					Person p = new Person();
					String str = br.readLine();
					if (str == null) {
						break;
					}
					String[] strArray = str.split(",");
					p.setName(strArray[0]);
					p.setHp(strArray[1]);
					p.setOf(strArray[2]);
					arrayList.add(p);
				}
			for(int i=0; i<arrayList.size(); i++) {
				System.out.println((i+1)+". "+arrayList.get(i).toString());
			}
			
			} else if (num == 2) {
				
				while (true) {
					Person p = new Person();
					String str = br.readLine();
					if (str == null) {
						break;
					}
					String[] strArray = str.split(",");
					p.setName(strArray[0]);
					p.setHp(strArray[1]);
					p.setOf(strArray[2]);
					arrayList.add(p);
				}
				
				Person p = new Person();
				
				System.out.println("<2.등록>");
				sc.nextLine();
				System.out.println(">이름:");
			 	p.setName(sc.nextLine());

				System.out.println(">휴대전화:");
				p.setHp(sc.nextLine());

				System.out.println("회사전화:");
				p.setOf(sc.nextLine());
				
				arrayList.add(p);
				Writer wr = new FileWriter("./PhoneDB.txt");
				BufferedWriter bw = new BufferedWriter(wr);
				
				for(Person p1 : arrayList) {
					String saveStr = p1.getName() +","+ p1.getHp()+","+p1.getOf();
					System.out.println(saveStr);
					
					bw.write(saveStr);
					bw.newLine();
				}
				bw.close();
				
				
				System.out.println("<등록되었습니다.>");
				
				
			}else if (num == 3) {
				System.out.println("<3.삭제>");
				sc.nextLine();
				System.out.println(">번호 :");
				int no = sc.nextInt();
				
				arrayList.remove(no-1);
			
				System.out.println("삭제되었습니다.");
				
			}else if(num == 5) {
				System.out.println("******************************");
				System.out.println("*          감사합니다.          *");
				System.out.println("******************************");
				break;
			}else if(num == 4){
				System.out.println("<4.검색>");
				String name = sc.nextLine();
				
			}else {
				System.out.println("[다시입력해주세요.]");
			}

		}
		
		br.close();
		sc.close();

	}
}
