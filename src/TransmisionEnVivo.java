public class TransmisionEnVivo extends ContenidoDigital{
    int espectadoresActuales;
     String plataformaOrigen;
     boolean enCurso;

     public TransmisionEnVivo(String titulo,int duracionMinutos, int espectadoresActuales, String plataformaOrigen, boolean enCurso){
         super(titulo, duracionMinutos);
         this.espectadoresActuales = espectadoresActuales;
         this.plataformaOrigen = plataformaOrigen;
         this.enCurso = enCurso;
     }

    public void reproducir() {
        if(!enCurso){
            System.out.println("ERROR. No se puede sincronizar la transmision.");
            return;
        }
        System.out.println("INICIANO TRANSMISION EN TIEMPO REAL" + titulo);
        System.out.println("Plataforma de origen: " + plataformaOrigen + ". Espectadores: " + espectadoresActuales);
        System.out.println(">> Transmisión en curso. Sincronizando búfer");
    }
}
