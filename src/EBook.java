
public class EBook extends Livro{
	
	private String marcaDagua;

	public String getMarcaDagua() {
		return marcaDagua;
	}

	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}
	
	public void aplicarDesconto()
	{
		valor= valor - (valor * 0.20);
	}
	
	

}
