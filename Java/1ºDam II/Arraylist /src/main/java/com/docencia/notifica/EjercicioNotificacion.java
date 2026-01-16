package com.docencia.notifica;

public class EjercicioNotificacion {

    public static void enviar(NotificacionInterface notificacion) {
        //Polimorfismo: puede ser Email, Sms o cualquier implementacion futura
    notificacion.enviar();
    }
    
    public static void main(String[] args) {
    NotificacionInterface notificacionEmail = new Email("ada@ejemplo.com", "Hola", "Bienvenida al curso");
    NotificacionInterface notificacionEmail2 = new Sms("+34123456789", "Tu código es 1234");

    enviar(notificacionEmail);
    enviar(notificacionEmail2);
    }
}
