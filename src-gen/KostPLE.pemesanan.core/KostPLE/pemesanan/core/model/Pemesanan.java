package KostPLE.pemesanan.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Pemesanan {
	public UUID getIdPemesanan();
	public void setIdPemesanan(UUID idPemesanan);
	public EDate getStartDate();
	public void setStartDate(EDate startDate);
	public EDate getEndDate();
	public void setEndDate(EDate endDate);
	public EFloat getTotalPay();
	public void setTotalPay(EFloat totalPay);
	public String getStatusPemesanan();
	public void setStatusPemesanan(String statusPemesanan);
	public String getDetail();
	public void setDetail(String detail);
	public EDate getCreatedAt();
	public void setCreatedAt(EDate createdAt);
	public KamarImpl getKamarimpl();
	public void setKamarimpl(KamarImpl kamarimpl);
	public ProfilPenggunaImpl getProfilpenggunaimpl();
	public void setProfilpenggunaimpl(ProfilPenggunaImpl profilpenggunaimpl);
	org.eclipse.uml2.uml.internal.impl.ClassImpl@31bb2d99 (name: PemesananImpl, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
	HashMap<String, Object> toHashMap();
}
