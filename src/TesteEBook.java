
public class TesteEBook {

	public static void main(String[] args) {
		
		EBook ebook = new EBook();
		
		ebook.autor = "Thiago";
		ebook.categoria = "Ação";
		ebook.titulo = "Dragão branco";
		ebook.valor = 50.00;
		ebook.aplicarDesconto();
		
		System.out.println(" -------------");
		System.out.println("|"+ebook.titulo+"|");
		System.out.println("|    "+ebook.categoria+"     |");
		System.out.println("|   "+ebook.autor+"    |");
		System.out.println("|   R$"+ebook.valor+"    |");
		System.out.println(" -------------");

	}

}
