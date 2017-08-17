public class Cancion {
    private String nombre;
    private String artista;
    private String genero;
    private double precio;
    private double duracion;
    private double tamaño;
    private double calidad;

    public Cancion(String nombre, String artista, String genero, double precio, double duracion, double tamaño, double calidad) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.precio = precio;
        this.duracion = duracion;
        this.tamaño = tamaño;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getCalidad() {
        return calidad;
    }

    public void setCalidad(double calidad) {
        this.calidad = calidad;
    }   
}
