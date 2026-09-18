public class Pelicula extends  ContenidoDigital{
boolean derechosVigentes;

    public Pelicula(String titulo, int duracionMinutos, boolean derechosVigentes){
        super(titulo, duracionMinutos);
        this.derechosVigentes = derechosVigentes;
    }

    @Override
    public void reproducir() {
        if(!derechosVigentes){
            System.out.println("ERROR. No se puede reproducir la pelicula. Derechos de autor expirados");
            return;
        }
System.out.println("INICIANO REPRODUCCION DE PELICULA " + titulo);
System.out.println("Duracion: " + duracionMinutos + " minutos");
System.out.println("Reproduciendo película con opción de créditos al final y Dolby Atmos activado.");
    }
}
