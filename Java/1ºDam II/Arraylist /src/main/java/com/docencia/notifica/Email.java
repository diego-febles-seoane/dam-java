package com.docencia.notifica;

public class Email extends Notificacion implements NotificacionInterface{

  
  private final String asunto;
  private final String cuerpo;

  /**
   * Constructor de la clase email
   * @param destino destino
   * @param asunto asunto
   * @param cuerpo cuerpo
   */
  public Email(String destino, String asunto, String cuerpo) {
    super(destino);
    this.asunto = asunto;
    this.cuerpo = cuerpo;
  }

  @Override
  public String destino() {
    return getDestino();
  }

  @Override
  public String mensaje() {
    return asunto + ":" + destino();
  }

  @Override
  public void enviar() {
    System.out.println("Enviando EMAIL a " + getDestino() + " -> " + mensaje());
  }
}
