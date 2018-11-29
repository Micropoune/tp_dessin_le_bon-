/**
 * 
 */
package ca.csf.dfc.Dessin.Repository;

import ca.csf.dfc.Dessin.Modele.ModeleDessin;

/**
 * @author Sylvie
 *
 */
public abstract class Fichiers implements IFichier {
	private ModeleDessin m_dessin;
	private String m_nomFichier;
	
	/**
	 * Constructeur d'initialisation
	 * 
	 * @param p_dessin : Liste des formes à sauvegarder
	 * @param p_nomFichier : Nom du fichier 
	 */
	public Fichiers(ModeleDessin p_dessin, String p_nomFichier)
	{
		this.m_dessin = p_dessin;
		this.m_nomFichier = p_nomFichier;
	}
	
	/**
	* 
	* @return Le nom du fichier
	*/
	public String getNomFichier() 
	{
		return this.m_nomFichier;
	}

	/**
	* Fixe le nom du fichier
	* 
	* @param p_nomFichier
	*/
	public void setNomFichier(String p_nomFichier)
	{
		this.m_nomFichier = p_nomFichier;
	}
	
	/**
	* 
	* @return Le dessin (liste des formes)
	*/
	public ModeleDessin getDessin() 
	{
		return this.m_dessin;
	}

	/**
	* Fixe le modèle de dessin (liste des formes)
	* 
	* @param p_dessin
	*/
	public void setDessin(ModeleDessin p_dessin)
	{
		this.m_dessin = p_dessin;
	}
	
	
	/**
	* Ecrire les données dans le fichier
	*/
	public abstract boolean ecrireDonnees();
	
	
	/**
	* Lire les données dans le fichier
	*/
	public abstract boolean lireDonnees();
}
