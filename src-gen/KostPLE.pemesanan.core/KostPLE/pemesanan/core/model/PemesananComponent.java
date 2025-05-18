package KostPLE.pemesanan.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="pemesanan_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PemesananComponent implements Pemesanan{
	@Id
	protected UUID idPemesanan; 
	protected EDate startDate;
	protected EDate endDate;
	protected EFloat totalPay;
	protected String statusPemesanan;
	protected String detail;
	protected EDate createdAt;
	@ManyToOne(targetEntity=KostPLE.kamar.core.KamarComponent.class)
	public Kamar kamarimpl;
	@ManyToOne(targetEntity=KostPLE.profilpengguna.core.ProfilPenggunaComponent.class)
	public ProfilPengguna profilpenggunaimpl;
	protected String objectName = PemesananComponent.class.getName();

	public PemesananComponent() {

	} 

	public PemesananComponent(
        UUID idPemesanan, EDate startDate, EDate endDate, EFloat totalPay, String statusPemesanan, String detail, EDate createdAt, KamarImpl kamarimpl, ProfilPenggunaImpl profilpenggunaimpl
    ) {
        this.idPemesanan = idPemesanan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPay = totalPay;
        this.statusPemesanan = statusPemesanan;
        this.detail = detail;
        this.createdAt = createdAt;
        this.kamarimpl = kamarimpl;
        this.profilpenggunaimpl = profilpenggunaimpl;
    }

	public UUID getIdPemesanan() {
		return this.idPemesanan;
	}

	public void setIdPemesanan(UUID idPemesanan) {
		this.idPemesanan = idPemesanan;
	}
	public EDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(EDate startDate) {
		this.startDate = startDate;
	}
	public EDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(EDate endDate) {
		this.endDate = endDate;
	}
	public EFloat getTotalPay() {
		return this.totalPay;
	}

	public void setTotalPay(EFloat totalPay) {
		this.totalPay = totalPay;
	}
	public String getStatusPemesanan() {
		return this.statusPemesanan;
	}

	public void setStatusPemesanan(String statusPemesanan) {
		this.statusPemesanan = statusPemesanan;
	}
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public EDate getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(EDate createdAt) {
		this.createdAt = createdAt;
	}
	public abstract KamarImpl getKamarimpl();
	public abstract void setKamarimpl(KamarImpl kamarimpl);
	
	public abstract ProfilPenggunaImpl getProfilpenggunaimpl();
	public abstract void setProfilpenggunaimpl(ProfilPenggunaImpl profilpenggunaimpl);
	
 

	@Override
    public String toString() {
        return "{" +
            " idPemesanan='" + getIdPemesanan() + "'" +
            " startDate='" + getStartDate() + "'" +
            " endDate='" + getEndDate() + "'" +
            " totalPay='" + getTotalPay() + "'" +
            " statusPemesanan='" + getStatusPemesanan() + "'" +
            " detail='" + getDetail() + "'" +
            " createdAt='" + getCreatedAt() + "'" +
            " kamarimpl='" + getKamarimpl() + "'" +
            " profilpenggunaimpl='" + getProfilpenggunaimpl() + "'" +
            "}";
    }
	
}
