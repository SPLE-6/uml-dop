package KostPLE.kamar.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class KamarDecorator extends KamarComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected KamarComponent record;

	public KamarDecorator () {
		super();
		this.record = record;
		this.idKamar =  idKamar.randomUUID();
		
	public KamarDecorator (KamarComponent record) {
		this.idKamar =  idKamar.randomUUID();
		this.record = record;
	}

	public KamarDecorator (UUID idKamar, KamarComponent record) {
		this.idKamar =  idKamar;
		this.record = record;
	}
	
	public KamarDecorator (KamarComponent record, String objectName) {
		this.idKamar =  idKamar.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public KamarDecorator() { }

	public UUID getIdKamar() {
		return record.getIdKamar();
	}
	public void setIdKamar(UUID idKamar) {
		record.setIdKamar(idKamar);
	}
	public boolean getIsAvailable() {
		return record.getIsAvailable();
	}
	public void setIsAvailable(boolean isAvailable) {
		record.setIsAvailable(isAvailable);
	}
	public String getTipeKamar() {
		return record.getTipeKamar();
	}
	public void setTipeKamar(String tipeKamar) {
		record.setTipeKamar(tipeKamar);
	}
	public String getDeskripsiKamar() {
		return record.getDeskripsiKamar();
	}
	public void setDeskripsiKamar(String deskripsiKamar) {
		record.setDeskripsiKamar(deskripsiKamar);
	}
	public String getProperty6() {
		return record.getProperty6();
	}
	public void setProperty6(String Property6) {
		record.setProperty6(Property6);
	}
	public EFloat getProperty7() {
		return record.getProperty7();
	}
	public void setProperty7(EFloat Property7) {
		record.setProperty7(Property7);
	}


	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
