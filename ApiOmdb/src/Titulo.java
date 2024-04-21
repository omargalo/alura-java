import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int anioDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "Titulo:'" + nombre + '\'' +
                ", Año:" + anioDeLanzamiento;
    }
}
