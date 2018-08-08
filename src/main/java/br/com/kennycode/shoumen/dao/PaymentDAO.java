package br.com.kennycode.shoumen.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import br.com.kennycode.shoumen.model.Payment;

public class PaymentDAO {

	private static List<Payment> payments = new ArrayList<Payment>();

	public Payment remove(Payment toRemove) {
		for (Payment payment : payments) {
			if (payment.getUuid().equals(toRemove.getUuid())) {
				payments.remove(payment);
				return payment;
			}
		}
		// if return it, there is nothing to remove.
		return toRemove;
	}

	public Payment findByUuid(Payment toFind) {
		for (Payment payment : payments) {
			if (payment.getUuid().equals(toFind.getUuid())) {
				return payment;
			}
		}
		// if return it, there is nothing to find.
		return toFind;
	}

	public List<Payment> payments() {
		return payments;
	}

	public Payment save(Payment payment) {
		payment.setUuid(UUID.randomUUID());
		payment.setCreated(Calendar.getInstance());
		payment.setUpdated(Calendar.getInstance());

		payments.add(payment);

		return payment;
	}

	public Payment pay(Payment toPay) {
		for (Payment payment : payments) {
			System.out.println(toPay.getUuid());
			System.out.println(payment.getUuid());
			if (payment.getUuid().equals(toPay.getUuid())){
				payment.setPay(true);
				payment.setPaymentDate(Calendar.getInstance());
				return payment;
			}
		}
		// if return it, there is nothing to pay or unpay.
		return toPay;
	}
}