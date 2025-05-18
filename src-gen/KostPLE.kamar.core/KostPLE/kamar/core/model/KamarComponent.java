package KostPLE.kamar.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="kamar_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class KamarComponent implements Kamar{
	@Id
	protected UUID idKamar; 
	protected boolean isAvailable;
	protected String tipeKamar;
	protected String deskripsiKamar;
	protected String Property6;
	protected EFloat Property7;
	@ManyToOne(targetEntity=KostPLE.properti.core.PropertiComponent.class)
	public Properti propertiimpl;
	protected String objectName = KamarComponent.class.getName();

	public KamarComponent() {

	} 

	public KamarComponent(
        UUID idKamar, boolean isAvailable, String tipeKamar, String deskripsiKamar, String Property6, EFloat Property7, PropertiImpl propertiimpl
    ) {
        this.idKamar = idKamar;
        this.isAvailable = isAvailable;
        this.tipeKamar = tipeKamar;
        this.deskripsiKamar = deskripsiKamar;
        this.Property6 = Property6;
        this.Property7 = Property7;
        this.propertiimpl = propertiimpl;
    }

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
	public abstract PropertiImpl getPropertiimpl();
	public abstract void setPropertiimpl(PropertiImpl propertiimpl);
	
 

	@Override
    public String toString() {
        return "{" +
            " idKamar='" + getIdKamar() + "'" +
            " isAvailable='" + getIsAvailable() + "'" +
            " tipeKamar='" + getTipeKamar() + "'" +
            " deskripsiKamar='" + getDeskripsiKamar() + "'" +
            " Property6='" + getProperty6() + "'" +
            " Property7='" + getProperty7() + "'" +
            " propertiimpl='" + getPropertiimpl() + "'" +
            "}";
    }
	
}
