package modelo;
/**
* Classe para setar e capturar os dados dos usuarios
* 
* @author Jacques G. Silva  / Leandro Reis
* 
*  
*/
public class Usuario {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    } 

}