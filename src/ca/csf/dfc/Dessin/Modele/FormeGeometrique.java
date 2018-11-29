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

	private Color m_CouleurContour;
	private Color m_CouleurRemplissage;
	private int m_Epaisseur;
	private Emplacement m_emplacement;

	public FormeGeometrique() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void dessiner(Color p_CouleurContour, Color p_CouleurRemplissage);
	
	public Color get_CouleurContour() {
		return this.m_CouleurContour;
	}
	
	public void setCouleurContour(Color p_Couleur) {
		this.m_CouleurContour = p_Couleur;
	}
	
	public Color getCouleurRempplissage() {
		return this.m_CouleurRemplissage;
	}
	
	public void setCouleurRemplissage(Color p_Couleur) {
		this.m_CouleurRemplissage = p_Couleur;
	}
	
	public int getEpaisseur() {
		return this.m_Epaisseur;
	}
	
	public void setEpaisseur(int p_Epaisseur) {
		this.m_Epaisseur = p_Epaisseur;
	}
	
	public Emplacement getEmplacement() {
		return this.m_emplacement;
	}
	
	public void setEmplacement(	int p_X, int p_Y) {
		this.m_emplacement.setX(p_X);
		this.m_emplacement.setY(p_Y);
	}
}
