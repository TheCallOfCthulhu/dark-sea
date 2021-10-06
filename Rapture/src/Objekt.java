
public class Objekt extends Dedeni { /* tady probiha dedeni */
	public int vaha = 4
			;
	public int vyska = 60;
	public String material = "drevo";
	int tezkos = 1;
	
	/*konstruktor*/
	 Objekt () {
		vaha = 4;
		vyska = 60;
		material = "drevo";
	}
	
	 


	public int ziskejVahu() {
	
		return vaha;
	}
	
	public void setVahu(int vaha) {
		this.vaha = vaha; /*znamena ze promenna int vaha Z HlavniTridy a prenese do teto metody a zmeni this.vahu*/
	}
	

}
