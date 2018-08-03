package br.com.kennycode.shoumen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.kennycode.shoumen.model.Payment;

@Controller
public class PaymentController {

	// FAKE LIST OF PAYMENTS (IT WILL COME FROM DATABASE) i don't have time XD, i am working to much :D>>>>>>
	private static List<Payment> payments = new ArrayList<Payment>();;

	public PaymentController() {

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
		payments.add(payment);
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
		model.addAttribute("payments", payments);
		return "payment/payments";
	}

}
