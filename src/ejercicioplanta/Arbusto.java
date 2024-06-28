package ejercicioplanta;

public class Arbusto extends Planta {

    private int AnchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaOno;

    public Arbusto() {
    }

    public Arbusto(int AnchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaOno, String nombre, double altodelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altodelTallo, tieneHojas, climaIdeal);
        this.AnchoArbusto = AnchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaOno = sePodaOno;
    }

    public int getAnchoArbusto() {
        return AnchoArbusto;
    }

    public void setAnchoArbusto(int AnchoArbusto) {
        this.AnchoArbusto = AnchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaOno() {
        return sePodaOno;
    }

    public void setSePodaOno(boolean sePodaOno) {
        this.sePodaOno = sePodaOno;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }

}
