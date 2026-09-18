public abstract class ContenidoDigital {
    String titulo;
    int duracionMinutos;

    public ContenidoDigital(String titulo, int duracionMinutos){
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public abstract void reproducir();
}
