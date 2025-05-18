package KostPLE.pemesanan.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class PemesananDecorator extends PemesananComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected PemesananComponent record;

	public PemesananDecorator () {
		super();
		this.record = record;
		this.idPemesanan =  idPemesanan.randomUUID();
		
	public PemesananDecorator (PemesananComponent record) {
		this.idPemesanan =  idPemesanan.randomUUID();
		this.record = record;
	}

	public PemesananDecorator (UUID idPemesanan, PemesananComponent record) {
		this.idPemesanan =  idPemesanan;
		this.record = record;
	}
	
	public PemesananDecorator (PemesananComponent record, String objectName) {
		this.idPemesanan =  idPemesanan.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public PemesananDecorator() { }

	public UUID getIdPemesanan() {
		return record.getIdPemesanan();
	}
	public void setIdPemesanan(UUID idPemesanan) {
		record.setIdPemesanan(idPemesanan);
	}
	public EDate getStartDate() {
		return record.getStartDate();
	}
	public void setStartDate(EDate startDate) {
		record.setStartDate(startDate);
	}
	public EDate getEndDate() {
		return record.getEndDate();
	}
	public void setEndDate(EDate endDate) {
		record.setEndDate(endDate);
	}
	public EFloat getTotalPay() {
		return record.getTotalPay();
	}
	public void setTotalPay(EFloat totalPay) {
		record.setTotalPay(totalPay);
	}
	public String getStatusPemesanan() {
		return record.getStatusPemesanan();
	}
	public void setStatusPemesanan(String statusPemesanan) {
		record.setStatusPemesanan(statusPemesanan);
	}
	public String getDetail() {
		return record.getDetail();
	}
	public void setDetail(String detail) {
		record.setDetail(detail);
	}
	public EDate getCreatedAt() {
		return record.getCreatedAt();
	}
	public void setCreatedAt(EDate createdAt) {
		record.setCreatedAt(createdAt);
	}


	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
