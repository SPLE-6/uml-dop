package KostPLE.kamar.core;

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


@Entity(name="kamar_impl")
@Table(name="kamar_impl")
public class KamarImpl extends KamarComponent {

	public KamarImpl(UUID idKamar, boolean isAvailable, String tipeKamar, String deskripsiKamar, String Property6, EFloat Property7, PropertiImpl propertiimpl) {
		this.idKamar = idKamar;
		this.isAvailable = isAvailable;
		this.tipeKamar = tipeKamar;
		this.deskripsiKamar = deskripsiKamar;
		this.Property6 = Property6;
		this.Property7 = Property7;
		this.propertiimpl = propertiimpl;
	}

	public KamarImpl(boolean isAvailable, String tipeKamar, String deskripsiKamar, String Property6, EFloat Property7, PropertiImpl propertiimpl) {
		this.idKamar =  idKamar.randomUUID();;
		this.isAvailable = isAvailable;
		this.tipeKamar = tipeKamar;
		this.deskripsiKamar = deskripsiKamar;
		this.Property6 = Property6;
		this.Property7 = Property7;
		this.propertiimpl = propertiimpl;
	}

	public KamarImpl() { }

	public UUID getIdKamar() {
		return this.idKamar;
	}

	public void setIdKamar(UUID idKamar) {
		this.idKamar = idKamar;
	}
	public boolean getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getTipeKamar() {
		return this.tipeKamar;
	}

	public void setTipeKamar(String tipeKamar) {
		this.tipeKamar = tipeKamar;
	}
	public String getDeskripsiKamar() {
		return this.deskripsiKamar;
	}

	public void setDeskripsiKamar(String deskripsiKamar) {
		this.deskripsiKamar = deskripsiKamar;
	}
	public String getProperty6() {
		return this.Property6;
	}

	public void setProperty6(String Property6) {
		this.Property6 = Property6;
	}
	public EFloat getProperty7() {
		return this.Property7;
	}

	public void setProperty7(EFloat Property7) {
		this.Property7 = Property7;
	}

	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> kamarMap = new HashMap<String,Object>();
		kamarMap.put("idKamar",getIdKamar());
		kamarMap.put("isAvailable",getIsAvailable());
		kamarMap.put("tipeKamar",getTipeKamar());
		kamarMap.put("deskripsiKamar",getDeskripsiKamar());
		kamarMap.put("Property6",getProperty6());
		kamarMap.put("Property7",getProperty7());
		kamarMap.put("propertiimpl",getPropertiimpl());

        return kamarMap;
    }

}
