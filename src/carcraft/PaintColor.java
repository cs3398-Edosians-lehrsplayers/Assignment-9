

// Author: McCray, Warren

package carcraft;

public class PaintColor extends CarOptions {
    
    public String color;
    
    public PaintColor() {
        System.out.println("PaintColor constructor");
        color = "Colour";
    }
    
    public PaintColor(String color) {
        System.out.println("PaintColor constructor");
        this.color = color;
    }
    
    @Override
    public String GetDescription() {
        return super.GetDescription() + "; Colour: "  + color;
    }
}
