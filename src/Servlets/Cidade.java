package Servlets;

public class Cidade {
	int id;
	String nome;
	void setId(int id){
		this.id=id;
	}
	void setNome(String nome){
		this.nome=nome;
	}
	int getId() {
		return id;
	}
	String getNome() {
		return nome;
	}
	
	Cidade (int id, String nome){
		setId (id);
		setNome (nome);
	
	}
}
