
public class PhoneUser {
    Phone phone;
    
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    
    void pilihHP(){
        phone.pilihHP();
    }
    
    void turnOn(){
        phone.powerOn();
    }
    
    void turnOff(){
        phone.powerOff();
    }
    
    void makeFullVolume(){
        phone.volumeUp();
    }
    
    void makeSilentVolume(){
        phone.volumeDown();
    }
}
