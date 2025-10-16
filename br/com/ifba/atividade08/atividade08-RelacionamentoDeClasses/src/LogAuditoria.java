import java.time.LocalDateTime;

/**
 *
 * @author guilhermeAmedrado
 */
public class LogAuditoria {
    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
    //construtor vazio para criar a "casca" do objeto, um objeto "vazio".
    public LogAuditoria(){   
    }

    //construtor para preencher o objeto.
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip){
        this.id =id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }
    
    //métodos getters e setters.
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Usuario getUsuario() {return usuario;}

    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    public String getAcao() {return acao;}

    public void setAcao(String acao) {this.acao = acao;}

    public LocalDateTime getDataHora() {return dataHora;}

    public void setDataHora(LocalDateTime dataHora) {this.dataHora = dataHora;}
    
    //método toString(retorna uma String formatada com as informações).
    public String toString(){
        return "Log[acao='" + acao + ", usuario='" + usuario.getNomeUsuario() + "']";
    }
}
