package projet.suiviapprenti.DAL.Entitys;
// Generated 23 f�vr. 2016 13:46:09 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * Apprenti generated by hbm2java
 */
@Entity
@Table(name = "apprenti", catalog = "suiviapprenti")
public class Apprenti implements java.io.Serializable {

	private Integer idApprenti;
	private Classe classe;
	private Coordonnees coordonnees;
	private Entreprise entreprise;
	private String nom;
	private String prenom;
	private String sexe;
	private Date dateNaissance;
	private String lieuNaissance;
	private Date dateDebutContrat;
	private Date dateFinContrat;
	private String codeRfid;
	private String motDePasse;
	private String missionPrincipale;
	private Set<ParticipationSeance> participationSeances = new HashSet<ParticipationSeance>(0);
	private Set<Cursusformation> cursusformations = new HashSet<Cursusformation>(0);
	private Set<Taxe> taxes = new HashSet<Taxe>(0);
	private Set<ParcoursPostBts> parcoursPostBtses = new HashSet<ParcoursPostBts>(0);

	public Apprenti() {
	}

	public Apprenti(Classe classe, Coordonnees coordonnees, Entreprise entreprise, String nom, String prenom,
			String sexe, Date dateNaissance, String lieuNaissance, Date dateDebutContrat, Date dateFinContrat,
			String codeRfid, String motDePasse) {
		this.classe = classe;
		this.coordonnees = coordonnees;
		this.entreprise = entreprise;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.codeRfid = codeRfid;
		this.motDePasse = motDePasse;
	}

	public Apprenti(Classe classe, Coordonnees coordonnees, Entreprise entreprise, String nom, String prenom,
			String sexe, Date dateNaissance, String lieuNaissance, Date dateDebutContrat, Date dateFinContrat,
			String codeRfid, String motDePasse, String missionPrincipale, Set<ParticipationSeance> participationSeances,
			Set<Cursusformation> cursusformations, Set<Taxe> taxes, Set<ParcoursPostBts> parcoursPostBtses) {
		this.classe = classe;
		this.coordonnees = coordonnees;
		this.entreprise = entreprise;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.codeRfid = codeRfid;
		this.motDePasse = motDePasse;
		this.missionPrincipale = missionPrincipale;
		this.participationSeances = participationSeances;
		this.cursusformations = cursusformations;
		this.taxes = taxes;
		this.parcoursPostBtses = parcoursPostBtses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idApprenti", unique = true, nullable = false)
	public Integer getIdApprenti() {
		return this.idApprenti;
	}

	public void setIdApprenti(Integer idApprenti) {
		this.idApprenti = idApprenti;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idclasse", nullable = false)
	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "idCoordonnees", nullable = false)
	public Coordonnees getCoordonnees() {
		return this.coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEntreprise", nullable = false)
	public Entreprise getEntreprise() {
		return this.entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@Column(name = "nom", nullable = false, length = 80)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 80)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "sexe", nullable = false, length = 1)
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateNaissance", nullable = false, length = 10)
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column(name = "lieuNaissance", nullable = false, length = 80)
	public String getLieuNaissance() {
		return this.lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateDebutContrat", nullable = false, length = 10)
	public Date getDateDebutContrat() {
		return this.dateDebutContrat;
	}

	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateFinContrat", nullable = false, length = 10)
	public Date getDateFinContrat() {
		return this.dateFinContrat;
	}

	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}

	@Column(name = "codeRFID", nullable = false, length = 45)
	public String getCodeRfid() {
		return this.codeRfid;
	}

	public void setCodeRfid(String codeRfid) {
		this.codeRfid = codeRfid;
	}

	@Column(name = "motDePasse", nullable = false, length = 45)
	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Column(name = "mission_principale", length = 45)
	public String getMissionPrincipale() {
		return this.missionPrincipale;
	}

	public void setMissionPrincipale(String missionPrincipale) {
		this.missionPrincipale = missionPrincipale;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apprenti")
	public Set<ParticipationSeance> getParticipationSeances() {
		return this.participationSeances;
	}

	public void setParticipationSeances(Set<ParticipationSeance> participationSeances) {
		this.participationSeances = participationSeances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apprenti")
	public Set<Cursusformation> getCursusformations() {
		return this.cursusformations;
	}

	public void setCursusformations(Set<Cursusformation> cursusformations) {
		this.cursusformations = cursusformations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apprenti")
	public Set<Taxe> getTaxes() {
		return this.taxes;
	}

	public void setTaxes(Set<Taxe> taxes) {
		this.taxes = taxes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "apprenti")
	public Set<ParcoursPostBts> getParcoursPostBtses() {
		return this.parcoursPostBtses;
	}

	public void setParcoursPostBtses(Set<ParcoursPostBts> parcoursPostBtses) {
		this.parcoursPostBtses = parcoursPostBtses;
	}

}
