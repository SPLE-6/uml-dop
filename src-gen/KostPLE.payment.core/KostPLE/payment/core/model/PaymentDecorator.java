package KostPLE.payment.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class PaymentDecorator extends PaymentComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected PaymentComponent record;

	public PaymentDecorator () {
		super();
		this.record = record;
		this.idPayment =  idPayment.randomUUID();
		
	public PaymentDecorator (PaymentComponent record) {
		this.idPayment =  idPayment.randomUUID();
		this.record = record;
	}

	public PaymentDecorator (UUID idPayment, PaymentComponent record) {
		this.idPayment =  idPayment;
		this.record = record;
	}
	
	public PaymentDecorator (PaymentComponent record, String objectName) {
		this.idPayment =  idPayment.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public PaymentDecorator() { }

	public UUID getIdPayment() {
		return record.getIdPayment();
	}
	public void setIdPayment(UUID idPayment) {
		record.setIdPayment(idPayment);
	}
	public EFloat getAmount() {
		return record.getAmount();
	}
	public void setAmount(EFloat amount) {
		record.setAmount(amount);
	}
	public boolean getStatus() {
		return record.getStatus();
	}
	public void setStatus(boolean status) {
		record.setStatus(status);
	}
	public EDate getCreatedAt() {
		return record.getCreatedAt();
	}
	public void setCreatedAt(EDate createdAt) {
		record.setCreatedAt(createdAt);
	}

	public void Pay() {
		return record.Pay();
	}

	public void Cancel() {
		return record.Cancel();
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
