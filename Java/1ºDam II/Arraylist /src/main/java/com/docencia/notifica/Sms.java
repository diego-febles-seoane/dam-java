package com.docencia.notifica;

public class Sms extends Notificacion implements NotificacionInterface {

    private final String texto;


    /**
     * Constructor de la clase Sms
     * @param destino Destino del Sms
     * @param texto Texto del Sms
     */
    public Sms(String destino, String texto) {
        super(destino);
        this.texto = texto;
    }

    @Override
    public String destino() {
      return getDestino();
    }

    @Override
    public String mensaje() {
        return texto;
    }

    @Override
    public void enviar() {
         System.out.println("Enviando SMS a " + getDestino() + " -> " + mensaje());
    }

}
