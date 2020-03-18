package ro.ase.csie.cts.g1084.tema2;

public class Place {
	public int idPlace;
	public String denumire;
	public String categorie;
	public float pretIntrare;

	public Place(int idPlace, String denumire, String categorie, float pretIntrare) {
		super();
		this.idPlace = idPlace;
		this.denumire = denumire;
		this.categorie = categorie;
		this.pretIntrare = pretIntrare;
	}

	public int getIdPlace() {
		return idPlace;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public float getPretIntrare() {
		return pretIntrare;
	}

	public void setPretIntrare(float pretIntrare) {
		this.pretIntrare = pretIntrare;
	}

	@Override
	public String toString() {
		return "Place [idPlace=" + idPlace + ", denumire=" + denumire + 
				", categorie=" + categorie + ", pretIntrare="
				+ pretIntrare + "]";
	}

}
