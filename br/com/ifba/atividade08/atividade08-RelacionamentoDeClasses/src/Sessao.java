/**
 *
 * @author guilhermeAmedrado
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;
    
     //construtor vazio para criar a "casca" do objeto, um objeto "vazio".
    public Sessao(){  
    }

    //construtor para preencher o objeto.
    public Sessao(Long id, Usuario usuario, String token){
        this.id = id;
        this. usuario = usuario;
        this.token = token;
    }
    
     //métodos getters e setters.
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getToken() {return token;}

    public void setToken(String token) {this.token = token;}
    
    public String toString(){
        return "Sessao[token='" + token + "', usuario='" + usuario.getNomeUsuario() + "']";
    }
    
}
