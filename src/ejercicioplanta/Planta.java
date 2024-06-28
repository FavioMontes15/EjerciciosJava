package ejercicioplanta;

public abstract class Planta {

    private String nombre;
    private double altodelTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, double altodelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altodelTallo = altodelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altodelTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altodelTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieenHojas(boolean tieenHojas) {
        this.tieneHojas = tieenHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    public abstract void decirLoQueSoy();
}
