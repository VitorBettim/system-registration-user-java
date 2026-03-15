import java.util.ArrayList;

public class SistemaCadastro {
    
    private ArrayList<Usuario> usuarios;

    public SistemaCadastro(){
        usuarios = new ArrayList<>();
    }

   // Método para adicionar usuário 
   public void cadastrarUsuario(Usuario usuario){
    usuarios.add(usuario);
   }

   // Método para listar usuários 
   public void listarUsuario(){
    for(Usuario u : usuarios){
        System.out.println("ID: " + u.getId());
        System.out.println("Nome: " + u.getNome());
        System.out.println("Email: " + u.getEmail());
        System.out.println("---------------------");
    }
   }

   // Método para buscar usuário
   public Usuario buscarUsuario(int id){
    for(Usuario u : usuarios){
        if (u.getId() == id) {
            return u;
        }
    }
    return null;
   }

   // Método para remover usuário
   public void removerUsuario(int id){
    Usuario usuario = buscarUsuario(id);
    if (usuario != null) {
        usuarios.remove(usuario);
        System.out.println("Usuário removido");
    }else{
        System.out.println("Usuário não encontrado");
    }
   }
}
