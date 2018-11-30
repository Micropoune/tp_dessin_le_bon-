/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.util.*;
import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public abstract class FormeGeometrique extends FormeGraphique {

	
	private Color m_CouleurRemplissage;
	private int m_ValX;
	private int m_ValY;
	private int m_Largeur;
	private int m_Hauteur;
/**
 * Constructeur d<initialisation
 * @param p_CouleurContour
 * @param p_Epaisseur
 * @param p_Emplacement
 * @param p_CouleurRemplissage
 */
	public FormeGeometrique(Color p_CouleurContour, int p_Epaisseur, Emplacement p_Emplacement, 
			Color p_CouleurRemplissage, int p_ValX, int p_ValY,
			int p_Largeur, int p_Hauteur) {
		super(p_CouleurContour, p_Epaisseur, p_Emplacement);
		this.m_CouleurRemplissage=p_CouleurRemplissage;
		this.m_ValX=p_ValX;
		this.m_ValY=p_ValY;
		this.m_Hauteur=p_Hauteur;
		this.m_Largeur=p_Hauteur;
	}
	
	//abstract void dessiner(Color p_CouleurContour, Color p_CouleurRemplissage);

	/**
	 * 
	 * @return la couleur de remplissage de la forme
	 */
	public Color getCouleurRempplissage() {
		return this.m_CouleurRemplissage;
	}
	/**
	 * fixe la couleur de remplissage de la forme
	 * @param p_Couleur
	 */
	public void setCouleurRemplissage(Color p_Couleur) {
		this.m_CouleurRemplissage = p_Couleur;
	}

}

