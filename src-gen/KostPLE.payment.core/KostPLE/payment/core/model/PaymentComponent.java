package KostPLE.payment.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PaymentComponent implements Payment{
	@Id
	protected UUID idPayment; 
	protected EFloat amount;
	protected boolean status;
	protected EDate createdAt;
	@ManyToOne(targetEntity=KostPLE.pemesanan.core.PemesananComponent.class)
	public Pemesanan pemesananimpl;
	protected String objectName = PaymentComponent.class.getName();

	public PaymentComponent() {

	} 

	public PaymentComponent(
        UUID idPayment, EFloat amount, boolean status, EDate createdAt, PemesananImpl pemesananimpl
    ) {
        this.idPayment = idPayment;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
        this.pemesananimpl = pemesananimpl;
    }

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
	public abstract PemesananImpl getPemesananimpl();
	public abstract void setPemesananimpl(PemesananImpl pemesananimpl);
	
 
	public abstract void Pay();

	public abstract void Cancel();

	@Override
    public String toString() {
        return "{" +
            " idPayment='" + getIdPayment() + "'" +
            " amount='" + getAmount() + "'" +
            " status='" + getStatus() + "'" +
            " createdAt='" + getCreatedAt() + "'" +
            " pemesananimpl='" + getPemesananimpl() + "'" +
            "}";
    }
	
}
