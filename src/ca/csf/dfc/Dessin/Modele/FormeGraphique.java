/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public abstract class FormeGraphique {
	
	private Color m_couleurContour;
	private Color m_couleurRemplissage;

	  private int m_epaisseur;

	  private Emplacement m_emplacement;

	  public Color getCouleurContour() {
		  return this.m_couleurContour;
	  }
	  
	  public Color getCouleurRemplissage(){
		  return this.m_couleurRemplissage;
	  }

	  public void setCouleurContour(Color p_couleurContour) {
		  this.m_couleurContour = p_couleurContour;
	  }
	  
	  public void setCouleurRemplissage(Color p_CouleurRemplissage) {
		  this.m_couleurRemplissage = p_CouleurRemplissage;
	  }

	  public int getEpaisseur() {
		  return this.m_epaisseur;
	  }

	  public void setEpaisseur(int p_epaisseur) {
		  this.m_epaisseur = p_epaisseur;
	  }

	  public Emplacement getEmplacement() {
		  return this.m_emplacement;
	  }

	  public void setEmplacement(int p_X, int p_Y) {
		  this.m_emplacement.setX(p_X);
		  this.m_emplacement.setY(p_Y);
	  }

	
}
