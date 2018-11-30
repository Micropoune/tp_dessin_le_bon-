/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sylvie
 *
 */
public class ModeleDessin 
{
	private List<FormeGraphique> m_ListeFormes=new ArrayList<>();
	//private VueEspaceDeTravail m_Canvas=new VueEspaceDeTravail() ;
	public ModeleDessin()
	{
		
	}
	public void dessiner(FormeGraphique p_FormeADessiner) 
	{
	//if(super.getCouleurRemplissage() == null) {
	//  p_Graphic.drawRect(this.m_emplacement.getX(), this.getEmplacement().getY(), width, height);
	//Ici je mettrais si c'est un rectangle on dessine un rectangle, si c'est un elipse, on dessine un elipse

		this.m_ListeFormes.add(p_FormeADessiner);
	}
		
}