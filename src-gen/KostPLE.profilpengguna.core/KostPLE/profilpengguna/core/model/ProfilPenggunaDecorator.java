package KostPLE.profilpengguna.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class ProfilPenggunaDecorator extends ProfilPenggunaComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected ProfilPenggunaComponent record;

	public ProfilPenggunaDecorator () {
		super();
		this.record = record;
		this.idProfil =  idProfil.randomUUID();
		
	public ProfilPenggunaDecorator (ProfilPenggunaComponent record) {
		this.idProfil =  idProfil.randomUUID();
		this.record = record;
	}

	public ProfilPenggunaDecorator (UUID idProfil, ProfilPenggunaComponent record) {
		this.idProfil =  idProfil;
		this.record = record;
	}
	
	public ProfilPenggunaDecorator (ProfilPenggunaComponent record, String objectName) {
		this.idProfil =  idProfil.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public ProfilPenggunaDecorator() { }

	public UUID getIdProfil() {
		return record.getIdProfil();
	}
	public void setIdProfil(UUID idProfil) {
		record.setIdProfil(idProfil);
	}
	public String getFullName() {
		return record.getFullName();
	}
	public void setFullName(String fullName) {
		record.setFullName(fullName);
	}
	public String getEmail() {
		return record.getEmail();
	}
	public void setEmail(String email) {
		record.setEmail(email);
	}
	public boolean getJenisKelamin() {
		return record.getJenisKelamin();
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		record.setJenisKelamin(jenisKelamin);
	}
	public String getPekerjaan() {
		return record.getPekerjaan();
	}
	public void setPekerjaan(String pekerjaan) {
		record.setPekerjaan(pekerjaan);
	}
	public String getKotaAsal() {
		return record.getKotaAsal();
	}
	public void setKotaAsal(String kotaAsal) {
		record.setKotaAsal(kotaAsal);
	}
	public String getStatusPernikahan() {
		return record.getStatusPernikahan();
	}
	public void setStatusPernikahan(String statusPernikahan) {
		record.setStatusPernikahan(statusPernikahan);
	}
	public String getPendidikanTerakhir() {
		return record.getPendidikanTerakhir();
	}
	public void setPendidikanTerakhir(String pendidikanTerakhir) {
		record.setPendidikanTerakhir(pendidikanTerakhir);
	}
	public int getKontakDarurat() {
		return record.getKontakDarurat();
	}
	public void setKontakDarurat(int kontakDarurat) {
		record.setKontakDarurat(kontakDarurat);
	}
	public String getFotoUrlProfil() {
		return record.getFotoUrlProfil();
	}
	public void setFotoUrlProfil(String fotoUrlProfil) {
		record.setFotoUrlProfil(fotoUrlProfil);
	}
	public int getNoHP() {
		return record.getNoHP();
	}
	public void setNoHP(int noHP) {
		record.setNoHP(noHP);
	}


	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
