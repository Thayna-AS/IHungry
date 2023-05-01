package domain.model;

public class Produto {

	public String Nome;
    public String Descricao;
    public String Categoria;
    public double Valor;
    public int Id;

	public Produto(String nome, String descricao, String categoria, double valor, int id) {
		super();
		Nome = nome;
		Descricao = descricao;
		Categoria = categoria;
		Valor = valor;
		Id = id;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getDescricao() {
		return Descricao;
	}


	public void setDescricao(String descricao) {
		Descricao = descricao;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}


	public double getValor() {
		return Valor;
	}


	public void setValor(double valor) {
		Valor = valor;
	}
}