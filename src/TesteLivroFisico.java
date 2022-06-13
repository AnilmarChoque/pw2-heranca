
public class TesteLivroFisico {

	public static void main(String[] args) {
		
		LivroFisico LF = new LivroFisico();
		
		LF.autor= "Thiago";
		LF.categoria = "Ação";
		LF.titulo = "Dragão branco";
		LF.valor = 50.00;
		LF.getTaxaImpressao();
		
		System.out.println(" -------------");
		System.out.println("|"+LF.titulo+"|");
		System.out.println("|    "+LF.categoria+"     |");
		System.out.println("|   "+LF.autor+"    |");
		System.out.println("|   R$"+LF.valor+"    |");
		System.out.println(" -------------");

	}

}
