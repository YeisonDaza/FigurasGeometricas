
package Clases;

import Interfaces.IFigura;


public abstract class Figura implements IFigura {
    protected String NombreFigura;
    public abstract double calculoPerimetro();

    public String getNombreFigura() {
        return NombreFigura;
    }

    public void setNombreFigura(String NombreFigura) {
        this.NombreFigura = NombreFigura;
    }
    
    
    
    
}
