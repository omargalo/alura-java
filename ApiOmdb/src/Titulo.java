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

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.anioDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,2));
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
                ", Año:" + anioDeLanzamiento +
                ", Duración:" + duracionEnMinutos;
    }
}
