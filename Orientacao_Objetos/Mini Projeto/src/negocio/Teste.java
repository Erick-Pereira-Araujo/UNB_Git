package negocio;

import java.util.*;

public class Teste {
	
	static PessoaFisica pessoaF1;
	static PessoaFisica pessoaF2;
	static PessoaJuridica pessoaJ1;
	static PessoaJuridica pessoaJ2;
	static Orcamento orcamento1;
	static Orcamento orcamento2;
	
	public static void main(String[] args) {
		
		GregorianCalendar dia = new GregorianCalendar();
		Date agora = dia.getTime();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(agora);
		calendar.add(Calendar.DAY_OF_MONTH, +10);
		Date vencimento = calendar.getTime();
		
		ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>();
		pessoaF1 = new PessoaFisica(1, "Erick", "6198888888", "asdfasdfads@gmail.com", "SIG - Capital Financial Center Bloco A loja 14, Brasilia/DF",
				agora, "123456789");
		pessoaF2 = new PessoaFisica(2, "Sabrina", "6199999999", "123456@gmail.com", "SIG - Capital Financial Center Bloco A loja 14, Brasilia/DF",
				agora, "987654321");
		pessoasFisicas.add(pessoaF1);
		pessoasFisicas.add(pessoaF2);
		
		ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<PessoaJuridica>();
		pessoaJ1 = new PessoaJuridica(1, "Adidas", "6198888888", "treigwsjngwlksd@gmail.com", "SIG - Capital Financial Center Bloco A loja 14, Brasilia/DF",
				"123456780000158", pessoaF1);
		pessoaJ2 = new PessoaJuridica(2, "Nike", "61999999999", "blablablablabla@gmail.com", "SIG - Capital Financial Center Bloco A loja 14, Brasilia/DF",
				"123456780000158", pessoaF2);
		pessoasJuridicas.add(pessoaJ1);
		pessoasJuridicas.add(pessoaJ2);
		
		ArrayList<Orcamento> orcamentos = new ArrayList<Orcamento>();
		orcamento1 = new Orcamento(1, "Orcamento site Adidas", "Criacao do site da adidas", agora, vencimento, 2, 1, 20000.00);
		orcamento2 = new Orcamento(2, "Orcamento site Sabrina", "Criacao do site da Sabrina", agora, vencimento, 1, 2, 2500.00);
		orcamentos.add(orcamento1);
		orcamentos.add(orcamento2);
		
		for(int i = 0; i < 2; ++i) {
			System.out.println(pessoasFisicas.get(i).toString());
			System.out.print("\n");
		}
		
		for(int i = 0; i < 2; ++i) {
			System.out.println(pessoasJuridicas.get(i).toString());
			System.out.print("\n");
		}
		
		for(int i = 0; i < 2; ++i) {
			System.out.println(orcamentos.get(i).toString());
			System.out.print("\n");
		}
		
	}

}
