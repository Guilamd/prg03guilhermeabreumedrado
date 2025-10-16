import java.util.List;

/**
 *
 * @author guilhermeAmedrado
 */
public class PerfilUsuario {    
    private Long id;
    private String descricao;
    private List<String> permissoes;
    
    //construtor vazio para criar a "casca" do objeto, um objeto "vazio".
    public PerfilUsuario(){   
    }

    //construtor para preencher o objeto.
    public PerfilUsuario(Long id, String descricao, List<String> permissoes){
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    
    //métodos getters e setters.
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public List<String> getPermissoes() {return permissoes;}

    public void setPermissoes(List<String> permissoes) {this.permissoes = permissoes;}
    
    //método toString(retorna uma String formatada com as informações).
    public String toString(){
        return "PerfilUsuario[id=" + id + ", descricao='" + descricao + "']";
    }
}
