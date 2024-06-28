package ejercicioplanta;

public class Flor extends Planta {

    private String colorPetalos;
    private int cantidadPromPetalos;
    private String colorPistilo;
    private String colordePetalos;
    private String variedadDePetalos;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantidadPromPetalos, String colorPistilo, String colordePetalos, String variedadDePetalos, String estacionFlorece, String nombre, double altodelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altodelTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromPetalos = cantidadPromPetalos;
        this.colorPistilo = colorPistilo;
        this.colordePetalos = colordePetalos;
        this.variedadDePetalos = variedadDePetalos;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPromPetalos() {
        return cantidadPromPetalos;
    }

    public void setCantidadPromPetalos(int cantidadPromPetalos) {
        this.cantidadPromPetalos = cantidadPromPetalos;
    }

    public String getColorPistillo() {
        return colorPistilo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistilo = colorPistillo;
    }

    public String getColordePetalos() {
        return colordePetalos;
    }

    public void setColordePetalos(String colordePetalos) {
        this.colordePetalos = colordePetalos;
    }

    public String getVariedadDePetalos() {
        return variedadDePetalos;
    }

    public void setVariedadDePetalos(String variedadDePetalos) {
        this.variedadDePetalos = variedadDePetalos;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }

}
