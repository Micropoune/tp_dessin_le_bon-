/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

/**
 * @author Sylvie
 *
 */
public class Emplacement {

	  public int m_X;

	  public int m_Y;

	  

	  public Emplacement() {
			this.m_X = 0;
			this.m_Y = 0;
		}
		
		public int getX() {
			return this.m_X;
		}
		
		public int getY() {
			return this.m_Y;
		}
		
		public void setX(int p_X) {
			this.m_X = p_X;
		}
		
		public void setY(int p_Y) {
			this.m_Y = p_Y;
		}

	}
