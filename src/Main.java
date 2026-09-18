//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContenidoDigital peliculaInvalida = new Pelicula("Buscando a Nemo", 120, true);


    ContenidoDigital serieSinSuscripcion = new EpisodioSerie("The Last of Us", 1, 1, 1, true);


    ContenidoDigital streamFinalizado = new TransmisionEnVivo("Conferencia de Tecnología", 90, 10000, "YOUTUBE", false);

    System.out.println("=== PRUEBAS DE VALIDACIÓN EN REPRODUCCIÓN ===");
    peliculaInvalida.reproducir();
    serieSinSuscripcion.reproducir();
    streamFinalizado.reproducir();
}
