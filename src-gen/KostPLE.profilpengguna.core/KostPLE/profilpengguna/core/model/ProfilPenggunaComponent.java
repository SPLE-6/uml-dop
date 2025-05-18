package KostPLE.profilpengguna.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="profilpengguna_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ProfilPenggunaComponent implements ProfilPengguna{
	@Id
	protected UUID idProfil; 
	protected String fullName;
	protected String email;
	protected boolean jenisKelamin;
	protected String pekerjaan;
	protected String kotaAsal;
	protected String statusPernikahan;
	protected int kontakDarurat;
	protected String fotoUrlProfil;
	protected int noHP;
	protected String objectName = ProfilPenggunaComponent.class.getName();

	public ProfilPenggunaComponent() {

	} 

	public ProfilPenggunaComponent(
        UUID idProfil, String fullName, String email, boolean jenisKelamin, String pekerjaan, String kotaAsal, String statusPernikahan, String pendidikanTerakhir, int kontakDarurat, String fotoUrlProfil, int noHP
    ) {
        this.idProfil = idProfil;
        this.fullName = fullName;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.kotaAsal = kotaAsal;
        this.statusPernikahan = statusPernikahan;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.kontakDarurat = kontakDarurat;
        this.fotoUrlProfil = fotoUrlProfil;
        this.noHP = noHP;
    }

	public UUID getIdProfil() {
		return this.idProfil;
	}

	public void setIdProfil(UUID idProfil) {
		this.idProfil = idProfil;
	}
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getJenisKelamin() {
		return this.jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getPekerjaan() {
		return this.pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}
	public String getKotaAsal() {
		return this.kotaAsal;
	}

	public void setKotaAsal(String kotaAsal) {
		this.kotaAsal = kotaAsal;
	}
	public String getStatusPernikahan() {
		return this.statusPernikahan;
	}

	public void setStatusPernikahan(String statusPernikahan) {
		this.statusPernikahan = statusPernikahan;
	}
	public String getPendidikanTerakhir() {
		return this.pendidikanTerakhir;
	}

	public void setPendidikanTerakhir(String pendidikanTerakhir) {
		this.pendidikanTerakhir = pendidikanTerakhir;
	}
	public int getKontakDarurat() {
		return this.kontakDarurat;
	}

	public void setKontakDarurat(int kontakDarurat) {
		this.kontakDarurat = kontakDarurat;
	}
	public String getFotoUrlProfil() {
		return this.fotoUrlProfil;
	}

	public void setFotoUrlProfil(String fotoUrlProfil) {
		this.fotoUrlProfil = fotoUrlProfil;
	}
	public int getNoHP() {
		return this.noHP;
	}

	public void setNoHP(int noHP) {
		this.noHP = noHP;
	}
 

	@Override
    public String toString() {
        return "{" +
            " idProfil='" + getIdProfil() + "'" +
            " fullName='" + getFullName() + "'" +
            " email='" + getEmail() + "'" +
            " jenisKelamin='" + getJenisKelamin() + "'" +
            " pekerjaan='" + getPekerjaan() + "'" +
            " kotaAsal='" + getKotaAsal() + "'" +
            " statusPernikahan='" + getStatusPernikahan() + "'" +
            " pendidikanTerakhir='" + getPendidikanTerakhir() + "'" +
            " kontakDarurat='" + getKontakDarurat() + "'" +
            " fotoUrlProfil='" + getFotoUrlProfil() + "'" +
            " noHP='" + getNoHP() + "'" +
            "}";
    }
	
}
