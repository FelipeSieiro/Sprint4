package br.com.fiap.sprint4.controller;


public class UsuarioDTO {
		int id;
		String nome;
		String dataNascimento;
		String endereco;
		String email;
		String telefone;
		String cpf;
		
		
		
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getDataNascimento() {
			return dataNascimento;
		}



		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}



		public String getEndereco() {
			return endereco;
		}



		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getTelefone() {
			return telefone;
		}



		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}



		public String getCpf() {
			return cpf;
		}



		public void setCpf(String cpf) {
			this.cpf = cpf;
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
		
