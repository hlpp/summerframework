package beans.cat;

import java.util.List;

public class Body {
    private String color;
    private List<Leg> legs;
    
    public Body() {
        System.out.println("new " + getClass().getName());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }
    
}
