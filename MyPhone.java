import java.util.Scanner;

public class MyPhone {
    
    static boolean isclosed = false;
    static String answer;
    static String pilihan;
    
    public static void main(String[] args) {
        Phone Note9 = new Samsung();
        PhoneUser rudi = new PhoneUser(Note9);
        Phone Redmi5 = new Xiaomi();
        PhoneUser dewi = new PhoneUser(Redmi5);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("---Pilih Handphone---");
        System.out.println("1. Samsung");
        System.out.println("2. Xiaomi");
        System.out.println("Pilih Handphone : ");
        pilihan = in.next();
        switch (pilihan) {
            case "1":
                System.out.println("Anda memilih HP Samsung");
                break;
            case "2":
                System.out.println("Anda memilih HP Xiaomi");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        
        while(!isclosed){
            System.out.println("---Main Menu---");
            System.out.println("1. Nyalakan Handphone");
            System.out.println("2. Matikan Handphone");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("5. Keluar Program");
            System.out.println("--------------------");
            System.out.println("Pilih Menu : ");
            answer = in.next();
            
            switch (answer){
                case "1":
                    rudi.turnOn();
                    break;
                case "2":
                    rudi.turnOff();
                    break;
                case "3":
                    rudi.makeFullVolume();
                    break;
                case "4":
                    rudi.makeSilentVolume();
                    break;
                case "5":
                    isclosed = true;
                    break;
                default :
                    System.out.println("Wrong input number");
            }
        }
    }
}
