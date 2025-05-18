package KostPLE.payment.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Payment {
	public UUID getIdPayment();
	public void setIdPayment(UUID idPayment);
	public EFloat getAmount();
	public void setAmount(EFloat amount);
	public boolean getStatus();
	public void setStatus(boolean status);
	public EDate getCreatedAt();
	public void setCreatedAt(EDate createdAt);
	public PemesananImpl getPemesananimpl();
	public void setPemesananimpl(PemesananImpl pemesananimpl);
	org.eclipse.uml2.uml.internal.impl.ClassImpl@39b38e47 (name: PaymentImpl, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
	public void Pay();
	public void Cancel();
	HashMap<String, Object> toHashMap();
}
