import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        int a =0, b;
        int[] arr = new int[3];
        Scanner scan  = new Scanner(System.in);
        try{ //Hata var mı dene
            b = scan.nextInt();
            arr[4] = 10;
            a = 2/0; //Normalde bir hata programın çalışmasını engeller biz try kısmı ile denetip catch kısmı ile ekrana exception vericez
        }catch (ArithmeticException e){  // Ve yakala demek
            System.out.print("Aritmatik hata yapıldı.");
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Aritmatik hata yapıldı.");
            System.out.println(e.toString());
        }catch (Exception e){ // bu en sona yazılır ve özelleşitirmiş hata ayıklama değildir yukarıda hatalarına göre sınıf belirttik.
            System.out.print("Bir hata var.");
            System.out.println(e.toString());
        }finally { // bu kısım hata olsa da olmasa da çalışır ve en sona yazılır
            System.out.println("Ne kadar da hatasız bir kod");
        }
    }
}