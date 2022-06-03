import java.util.Scanner;
public class main {

    public static void main(String[] args){
         int heat;
         
        Scanner input =new Scanner(System.in);
        
        System.out.print("Hava sıcaklığını giriniz :");
        heat =input.nextInt();
        
        if(heat<5) {
            System.out.println("Kayak gidebilirsiniz . ");
        } else if (heat >= 5 && heat<=15) {
        
            System.out.println("Sinemye gidebilirsiniz . ");
        } else if (heat>15 && heat<=25) {
        
            System.out.println("Pikniğe gidebilirsiniz . ");
        } else if (heat >25) {
        
            System.out.println("Yüzme gidebilirsiniz . ");
        }

    }

    }
