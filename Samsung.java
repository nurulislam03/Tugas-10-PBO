
public class Samsung implements Phone{
    int volume;
    boolean isPower;
    String yourphone;
    
    public Samsung(){
        volume = 50;
    }

    @Override
    public void pilihHP() {
        yourphone = "Samsung";
        System.out.println("Welcome to Samsung Technologies");
    }
    
    
    @Override
    public void powerOn() {
        isPower = true;
        System.out.println("HP Menyala");
    }

    @Override
    public void powerOff() {
        isPower = false;
        System.out.println("Shutting Down");
    }

    @Override
    public void volumeUp() {
        if(isPower){
            if(volume == MAX_VOLUME){
                System.out.println("Volume is full 100%" );
            }
            else{
                volume += 5;
                System.out.println("Volume is " + getVolume() + "%");
            }
        }
        else {
            System.out.println("Turn On Your Phone");
        }
    }

    @Override
    public void volumeDown() {
        if(isPower){
            if(volume == MIN_VOLUME){
                System.out.println("Volume is 0%" );
            }
            else{
                volume -= 5;
                System.out.println("Volume is " + getVolume() + "%");
            }
        }
        else {
            System.out.println("Turn On Your Phone");
        }
    }
    
    public int getVolume(){
        return volume;
    }

}
