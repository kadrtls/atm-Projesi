import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int balance=982000,right=3,select;
        Scanner scanner=new Scanner(System.in);
        while (right>0){
            System.out.println("Kullanıcı adınızı giriniz.");
            userName= scanner.next();
            System.out.println("şifrenizi giriniz.");
            password= scanner.next();
            if (userName.equals("tonyStark")&&password.equals("mark42")){
                System.out.println("IRON bank'a hoşgeldiniz."+'\n'+"bakiyeniz:"+balance);
                do {
                    System.out.println("Yapmkak istediğiniz işlem tuşlayınız."+'\n'+
                            "1-Para çekme"+'\n'+
                            "2-Para yatırma"+'\n'+
                            "3-Bakiye sorgulama"+'\n'+
                            "4-hesaptan çıkış yap");
                    select= scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("çekmek istediğiniz miktarı girin.");
                            int price= scanner.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz!");
                            }else{
                                balance-=price;
                                System.out.println(price+"tl çekildi.");
                            }break;
                        case 2:
                            System.out.println("yatırmak istediğiniz miktarı giriniz.");
                            int price2= scanner.nextInt();
                            balance+=price2;
                            System.out.println(price2+"tl yatırıldı");
                            break;
                        case 3:
                            System.out.println("bakiyenizdeki para:"+balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("bizi tercih ettiğiniz için teşekkürler!");
                break;

               }else {
                right--;
                if (right==0){
                    System.out.println("3 defa hatalı giriş yaptınız.Kartınız bloke oldu"+'\n'+
                            "işlem yapmak için bankayla iletişime geçin.");
                }else{
                    System.out.println("kullanıcı adı veya şifre hatalı "+right+" gakkınız kaldı");
                }
            }
        }
    }
}