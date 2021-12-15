
public class Triangle extends Shape{
    float base;
    float height;
    
    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    float getArea() {
        return 0.5f*base*height;
    }
    
    
}
