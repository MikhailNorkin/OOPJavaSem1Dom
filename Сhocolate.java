package Tasks; 

public class Сhocolate extends Product {
    private Integer calloria;

    public Сhocolate(String name) {
        super(name);
    }
    
    public Сhocolate(String name, Double price) {
        super(name, price);
        
    }
    
    public Сhocolate(String name, Double price, Integer calloria) {
        super(name, price);
        this.calloria = calloria;
    }

    public Integer getСalloria(){
        return this.calloria;
    }

    @Override
    public String toString() {
        return String.format("%s %d", super.toString(),calloria);
    }
    
}
