package KostPLE.properti.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Properti {
	public UUID getIdProperti();
	public void setIdProperti(UUID idProperti);
	public String getNamaProperti();
	public void setNamaProperti(String namaProperti);
	public String getDeskripsiProperti();
	public void setDeskripsiProperti(String deskripsiProperti);
	public String getLokasiProperti();
	public void setLokasiProperti(String lokasiProperti);
	public String getFotoUrlProperti();
	public void setFotoUrlProperti(String fotoUrlProperti);
	public ProfilPenggunaImpl getProfilpenggunaimpl();
	public void setProfilpenggunaimpl(ProfilPenggunaImpl profilpenggunaimpl);
	org.eclipse.uml2.uml.internal.impl.ClassImpl@1a0f55f7 (name: PropertiImpl, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
	HashMap<String, Object> toHashMap();
}
