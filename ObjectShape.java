
public class ObjectShape {
    
    public static void main(String[] args) {
        Shape objsegitiga = new Triangle(20,4);
        Shape objlingkaran = new Circle(5);
        
        System.out.println("Luas dari segitiga adalah " + objsegitiga.getArea());
        System.out.println("Luas dari lingkaran adalah " + objlingkaran.getArea());
    }
}
