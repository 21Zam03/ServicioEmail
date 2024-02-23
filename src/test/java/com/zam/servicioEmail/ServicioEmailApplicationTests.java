package com.zam.servicioEmail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class ServicioEmailApplicationTests {

	@Autowired
	private JavaMailSender javaMailSender;

	@Test
	void contextLoads() {
		String destinatario = "21zam03.free@gmail.com";
		String asunto = "\uD83D\uDECD\uFE0F✨ Abril, Su compra se realizo con exito!";
		String mensaje = "En hora buena abril su compra se realizo con exito! muchas gracias por confiar en nuestros productos. " +
				"Se adjunta su detalle de compra en pdf.";
		SimpleMailMessage correo = new SimpleMailMessage();
		correo.setTo(destinatario);
		correo.setSubject(asunto);
		correo.setText(mensaje);

		javaMailSender.send(correo);
		System.out.println("Correo enviado exitosamente a: "+destinatario);
	}

}
