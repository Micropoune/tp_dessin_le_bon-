

import java.awt.Color;
import java.awt.Graphics;

import ca.csf.dfc.Dessin.Modele.Emplacement;
import ca.csf.dfc.Dessin.Modele.FormeGraphique;
/**
 * @author Sylvie
 *
 */
public class Rectangle extends FormeGraphique {
	
	private Emplacement m_emplacement;
	
	  public Rectangle(Integer p_epaisseur,Color p_couleurRemplissage, Color p_CouleurContour, int p_valX, int p_valY, int p_largeur, int p_hauteur) {
		  super.setEpaisseur(p_epaisseur);
		  super.setCouleurRemplissage(p_couleurRemplissage);
		  super.setCouleurContour(p_CouleurContour);
		  this.m_emplacement.setX(p_valX);
		  this.m_emplacement.setY(p_valY);
	  }

	  public void dessiner(Graphics p_Graphic) {
		  if(super.getCouleurRemplissage() == null) {
			  p_Graphic.drawRect(this.m_emplacement.getX(), this.getEmplacement().getY(), width, height);
		  }
	  }

	}
