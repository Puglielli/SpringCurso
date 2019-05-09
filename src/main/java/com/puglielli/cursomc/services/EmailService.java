package com.puglielli.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.puglielli.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
