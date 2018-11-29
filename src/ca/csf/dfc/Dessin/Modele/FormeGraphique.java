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
	
	public Color m_couleurContour;

	  public int m_epaisseur;

	  public Emplacement m_emplacement;

	  public void getCouleur() {
	  }

	  public void setCouleur(Color p_couleurContour, Color p_CouleurRemplissage) {
	  }

	  public void getEpaisseur() {
	  }

	  public void setEpaisseur(int p_epaisseur) {
	  }

	  public void getEmplacement() {
	  }

	  public void setEmplacement(Emplacement p_emplacement) {
	  }

	}
}
