
import java.time.LocalDateTime;

/**
 *
 * @author guilhermeAmedrado
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    private String ip;
    
    //construtor vazio para criar a "casca" do objeto, um objeto "vazio".
    public Usuario(){   
    }
    
    //construtor para preencher o objeto.
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email,String senha, Boolean ativo){
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    //métodos getters e setters.
    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public PerfilUsuario getPerfil() {return perfil;}

    public void setPerfil(PerfilUsuario perfil) {this.perfil = perfil;}

    public String getNomeUsuario() {return nomeUsuario;}

    public void setNomeUsuario(String nomeUsuario) {this.nomeUsuario = nomeUsuario;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public LocalDateTime getUltimoLogin() {return ultimoLogin;}

    public void setUltimoLogin(LocalDateTime ultimoLogin) {this.ultimoLogin = ultimoLogin;}

    public Boolean getAtivo() {return ativo;}

    public void setAtivo(Boolean ativo) {this.ativo = ativo;}

    public String getIp() {return ip;}

    public void setIp(String ip) {this.ip = ip;}
    
    //método toString(retorna uma String formatada com as informações).
    public String toString(){
        return "Usuario[id=" + id + ", nome=" + nomeUsuario + ", perfil='" + perfil.getDescricao() + "']";
    }
    
}
