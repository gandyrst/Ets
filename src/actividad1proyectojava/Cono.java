package actividad1proyectojava;

public class Cono extends Circulo {

    private Float Altura;

    private String Color;
    
    public float getAltura () {
        return Altura;
    }
    public void setAltura (float Altura){
        this.Altura=Altura;
    }
    
    
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color=Color;
    }

    public Void ImprimirCono() {
        System.out.println("Altura = " + Altura + " ; Color = " + Color + " ; Radio = " + Radio);
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
