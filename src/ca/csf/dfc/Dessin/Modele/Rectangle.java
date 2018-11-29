

import java.awt.Color;
import java.awt.Graphics;
import ca.csf.dfc.Dessin.Modele.FormeGraphique;
/**
 * @author Sylvie
 *
 */
public class Rectangle extends FormeGraphique {

	  public Rectangle(Color p_couleurRemplissage, Color p_CouleurContour, int p_valX, int p_valY, int p_largeur, int p_hauteur, Graphics p_Graphic) {
		  this.setCouleurRemplissage(p_couleurRemplissage);
		  this.setCouleurContour(p_CouleurContour);
	  }

	  public void dessiner() {
		  
	  }

	}
