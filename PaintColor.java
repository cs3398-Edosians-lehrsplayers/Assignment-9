// Author: McCray, Warren

public class PaintColor implements CarOptions {
    
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