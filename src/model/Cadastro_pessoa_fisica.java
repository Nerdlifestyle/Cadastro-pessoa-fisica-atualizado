package model;

public class Cadastro_pessoa_fisica {
	private String name;
	private String Endereço;
	private String Bairro;
	private String CEP;
	private String Cidade;
	private String Estado;
	private String Telefone;
	private String Celular;
	private String RG;
	private String CPF;
	private char masculino;
	private char feminino;

	public String getNome(){
		return name;
	}
	public void setNome(String Name){
		this.name = name;
	}
	public String getEnde(){
		return Endereço;
	}
	public void setEnde(String Endereço){
		this.Endereço = Endereço;
	}
	public String getBairro(){
		return Bairro;
	}
	public void setBairro(String Bairro){
		this.Bairro = Bairro;
	}
	public String getCep(){
		return CEP;
	}
	public void setCep(String CEP){
		this.CEP = CEP;
	}
	public String getCidade(){
		return Cidade;
	}
	public void setCidade(String Cidade){
		this.Cidade = Cidade;
	}
	public String getEstado(){
		return Estado;
	}
	public void setEstado(String Estado){
		this.Estado = Estado;
	}
	public String getTel(){
		return Telefone;
	}
	public void setTel(String Telefone){
		this.Telefone = Telefone;
	}
	public String getCel(){
		return Celular;
	}
	public void setCel(String Celular){
		this.Celular = Celular;
	}
	public String getRG(){
		return RG;
	}
	public void setRG(String RG){
		this.RG = RG;
	}
	public String getCPF(){
		return CPF;
	}
	public void setCPF(String CPF){
		this.CPF = CPF;
	}
	public char getMasc(){
		return masculino;
	}
	public void setMasc(char Name){
		this.masculino = masculino;
	}
	public char getFemin(){
		return feminino;
	}
	public void setFemin(char feminino){
		this.feminino = feminino;
	}
}
