
public abstract class Shape {
    String color;
    void setColor(String Color){
        this.color = color;
    }
    
    String getColor(){
        return color;
    }
    
    abstract float getArea();
}
