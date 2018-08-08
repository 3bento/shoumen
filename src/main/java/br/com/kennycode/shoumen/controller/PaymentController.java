package br.com.kennycode.shoumen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.kennycode.shoumen.dao.PaymentDAO;
import br.com.kennycode.shoumen.model.Payment;

@Controller
public class PaymentController {

	private PaymentDAO dao;

	public PaymentController() {
		dao = new PaymentDAO();
	}

	/**
	 * open the form to registry a payment
	 * 
	 * @return
	 */
	@RequestMapping(value = "payment", method = RequestMethod.GET)
	public String payment() {
		return "payment/payment";
	}

	/**
	 * registry new payment.
	 * 
	 * @param payment
	 * @return
	 */
	@RequestMapping(value = "payment", method = RequestMethod.POST)
	public String payment(Payment payment) {
		dao.save(payment);
		return "redirect:payments";
	}

	/**
	 * list of all payments
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "payments", method = RequestMethod.GET)
	public String payments(Model model) {
		model.addAttribute("payments", dao.payments());
		return "payment/payments";
	}

	@RequestMapping("pay")
	public String pay(Payment payment) {
		dao.pay(payment);
		return "redirect:payments";
	}
	
	@RequestMapping("remove")
	public String remove(Payment payment) {
		dao.remove(payment);
		return "redirect:payments";
	}
}