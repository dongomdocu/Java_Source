package HW_interface_teacher;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable {

   String phone;
   String addr;
   
   PersonInfo()
   {
      //super(); 기술하지 않아도 자동삽입됨.
      // 따라서 부모 클래스에서 default생성자가 반드시 필요하다.
   }
   
   @Override
   public boolean Input() {
      Scanner sc = new Scanner(System.in);
      System.out.println("학번 입력 >> ");
      this.hakbun = sc.next();
      // toLowerCase() - 대문자를 소문자로 바꿔주는 메소드
      if(hakbun.toLowerCase().equals("exit"))
      {
         return true;
      }
      System.out.println("이름 입력 >> ");
      this.irum = sc.next();
      System.out.println("전화번호 입력 >> ");
      this.phone = sc.next();
      System.out.println("주소 입력 >> ");
      this.addr = sc.next();
      return false;
   }

   @Override
   public void Output() {
      System.out.printf("%s\t%s\t%s\t%s\n", 
            this.hakbun, this.irum, this.phone, this.addr);
   }

}