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
         System.out.println("1: �������� ���");
         System.out.println("2: �������� ���");
         System.out.println("3:�ܾ� �߰�(20�� max)");
         System.out.println("4: ���α׷� ����");
         select_mode = sc.nextInt();   
         
         switch(select_mode) {
         case 1:
            if(voca[0]=="") {
               System.out.println("����� ���� �����ϴ�.");
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
               System.out.println("����� ���� �����ϴ�.");
            }
            else {
            Arrays.sort(voca,Collections.reverseOrder());
            }
            break;
         case 3:
            if(count<20) {
            System.out.print("�ܾ �Է��� �ּ���: ");
            voca[count] = sc.nextLine();
            count++;
            }
            else
               System.out.println("�̹� 20���� �ԷµǾ����ϴ�.");
            break;
         case 4:
            System.out.println("Program exit");
            System.exit(0);
            break;
         
      }
   }

}
}