/**
 *
 * @author guilhermeAmedrado
 */
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar os Perfis.
        //primeiro crio os objetos independentes que servirão de 'moldes" para os usuarios.
        System.out.println("---1. Criando os Perfis de Usuário ---");
        
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", Arrays.asList("CRIAR", "EDITAR", "DELETAR"));
        PerfilUsuario perfilComum = new PerfilUsuario(2L, "Usuario comum", Arrays.asList("LER", "ESCREVER"));
        
        System.out.println("Criado: " + perfilAdmin);
        System.out.println("Criado: " + perfilComum);
        System.out.println();
        
        //Cria os usuarios para fazer ligação com os perfis.
        //Crio os usuarios e passo a referência do perfil.
        Usuario usuario1 = new Usuario(101L, perfilAdmin, "supervisor", "sup@empresa.com", "senha1", true);
        Usuario usuario2 = new Usuario(102L, perfilComum, "guilherme", "guilherme@empresa.com", "senha2", true);
        
        System.out.println("Criado: " + usuario1);
        System.out.println("Criado: " + usuario2);
        System.out.println();
        
        //Crio os Logs e aa sessões para fazer a ligação com os usuarios.
        //Crio os eventos(objetos) e passo a referência do usuário que realizou a ação.
        System.out.println("--- 3. Criando Logs e Sessões ---");
        
        LogAuditoria logDeLogin = new LogAuditoria(501L, usuario1, "Login bem-sucedido", LocalDateTime.now(), "192.168.1.10");
        Sessao sessaoAtiva = new Sessao(801L, usuario2, "token=xyz-bmw-123");
        
        System.out.println("Criado: " + logDeLogin);
        System.out.println("Criada: " + sessaoAtiva);
        System.out.println();
        
        System.out.println("--- 4. Verificando as Conexões de ambos os usuários ---");
        System.out.println();

        // --- Verificações para o usuario1 ("supervisor") ---
        System.out.println("--- Detalhes do Usuário: " + usuario1.getNomeUsuario() + " ---");
        System.out.println("-> O usuário '" + usuario1.getNomeUsuario() + "' tem o perfil: '" + usuario1.getPerfil().getDescricao() + "'");
        System.out.println("-> O log de ID " + logDeLogin.getId() + " pertence a: '" + logDeLogin.getUsuario().getNomeUsuario() + "'");
        System.out.println();

        // --- Verificações para o usuario2 ("guilherme") ---
        System.out.println("--- Detalhes do Usuário: " + usuario2.getNomeUsuario() + " ---");
        System.out.println("-> O usuário '" + usuario2.getNomeUsuario() + "' tem o perfil: '" + usuario2.getPerfil().getDescricao() + "'");
        System.out.println("-> A sessão com token '" + sessaoAtiva.getToken() + "' pertence a: '" + sessaoAtiva.getUsuario().getNomeUsuario() + "'");
    }
}