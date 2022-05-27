import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class problem2{

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
               
      int select_mode = 0;
      String[] voca=new String[20];
      int count = 0;
      
      for(int i = 0; i < 20; i++)
         voca[i] = "";
         
      
      while(true) {
         System.out.println("select menu");
         System.out.println("1: 오름차순 출력");
         System.out.println("2: 내림차순 출력");
         System.out.println("3:단어 추가(20개 max)");
         System.out.println("4: 프로그램 종료");
         select_mode = sc.nextInt();   
         
         switch(select_mode) {
         case 1:
            if(voca[0]=="") {
               System.out.println("저장된 값이 없습니다.");
            }
            else {
            Arrays.sort(voca);
            for(int i =0;i<voca.length;i++) {
               System.out.println(voca[i]);
            }
            }
            break;
         case 2:
            if(voca[0]=="") {
               System.out.println("저장된 값이 없습니다.");
            }
            else {
            Arrays.sort(voca,Collections.reverseOrder());
            }
            break;
         case 3:
            if(count<20) {
            System.out.print("단어를 입력해 주세요: ");
            voca[count] = sc.nextLine();
            count++;
            }
            else
               System.out.println("이미 20개가 입력되었습니다.");
            break;
         case 4:
            System.out.println("Program exit");
            System.exit(0);
            break;
         
      }
   }

}
}