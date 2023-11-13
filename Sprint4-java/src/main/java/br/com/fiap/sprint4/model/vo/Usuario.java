package br.com.fiap.sprint4.model.vo;

public class Usuario {
	
	int id;
	String nome;
	String dataNascimento;
	String endereco;
	String email;
	String telefone;
	CPF cpf;
	

	public Usuario(String nome, String dataNascimento, String sexo, String endereco, String email, String telefone, CPF cpf, int id) {
		if(nome == null || nome.equals("")){
			throw new IllegalArgumentException("Nome Inválido");
		}
		if(dataNascimento == null || dataNascimento.equals("")){
			throw new IllegalArgumentException("Data de Nascimento Inválida");
		}
		if(endereco == null || endereco.equals("")){
			throw new IllegalArgumentException("Endereço Inválido");
		}
		if(email == null || email.equals("")){
			throw new IllegalArgumentException("Email Inválido");
		}
		if(cpf == null){
			throw new IllegalArgumentException("CPF Inválido");
		}
		if(telefone.length() > 9){
			throw new IllegalArgumentException("Telefone Inválido");
		}
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.id = id;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCpf() {
		String numeroCpf = cpf.toString();
		return numeroCpf;
	}

	public String toString() {
		return "Usuario: \n" +
	"['Nome': " + nome + "\n CPF: " + cpf + "\n Data de Nascimento: " + dataNascimento + "\n Endereço: "+ endereco + "\n Email: " + email + "\n Telefone: " + telefone;
	}
	
	public void getMostrarMeusDados() {
			System.out.println(" - Nome:" + this.nome);
			System.out.println(" - CPF: " + this.cpf);
			System.out.println(" - Data De Nascimento: " + this.dataNascimento);
			System.out.println(" - Endereço: " + this.endereco);
			System.out.println(" - Email: " + this.email);
			System.out.println(" - Telefone: " + this.telefone);
		}
	}
	

