package KostPLE.payment.core;

import java.lang.Math;
import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name="payment_impl")
@Table(name="payment_impl")
public class PaymentImpl extends PaymentComponent {

	public PaymentImpl(UUID idPayment, EFloat amount, boolean status, EDate createdAt, PemesananImpl pemesananimpl) {
		this.idPayment = idPayment;
		this.amount = amount;
		this.status = status;
		this.createdAt = createdAt;
		this.pemesananimpl = pemesananimpl;
	}

	public PaymentImpl(EFloat amount, boolean status, EDate createdAt, PemesananImpl pemesananimpl) {
		this.idPayment =  idPayment.randomUUID();;
		this.amount = amount;
		this.status = status;
		this.createdAt = createdAt;
		this.pemesananimpl = pemesananimpl;
	}

	public PaymentImpl() { }

	public UUID getIdPayment() {
		return this.idPayment;
	}

	public void setIdPayment(UUID idPayment) {
		this.idPayment = idPayment;
	}
	public EFloat getAmount() {
		return this.amount;
	}

	public void setAmount(EFloat amount) {
		this.amount = amount;
	}
	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public EDate getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(EDate createdAt) {
		this.createdAt = createdAt;
	}

	public void Pay() {
		// TODO: implement this method
	}

	public void Cancel() {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> paymentMap = new HashMap<String,Object>();
		paymentMap.put("idPayment",getIdPayment());
		paymentMap.put("amount",getAmount());
		paymentMap.put("status",getStatus());
		paymentMap.put("createdAt",getCreatedAt());
		paymentMap.put("pemesananimpl",getPemesananimpl());

        return paymentMap;
    }

}
