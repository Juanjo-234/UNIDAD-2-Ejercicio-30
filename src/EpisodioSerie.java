public class EpisodioSerie extends ContenidoDigital {
    int numTemporada;
    int numEpisodio;
    boolean suscripcionActiva;


    public EpisodioSerie(String titulo, int duracionMinutos, int numTemporada, int numEpisodio, boolean suscripcionActiva){
        super(titulo, duracionMinutos);
        this.numTemporada = numTemporada;
        this.numEpisodio = numEpisodio;
        this.suscripcionActiva = suscripcionActiva;
    }

    @Override
    public void reproducir() {
        if(!suscripcionActiva){
            System.out.println("ERROR. No se puede reproducir la serie, sus suscripción ha expirado.");
            return;
        }
        System.out.println("INICIANO REPRODUCCION DE SERIE" + titulo);
        System.out.println("Duracion: " + duracionMinutos + " minutos");
        System.out.println("Temporada: " + numTemporada);
        System.out.println("Episodio: " + numEpisodio);
    }
}
