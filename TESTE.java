import java.util.Scanner;
import java.util.ArrayList;

public class SignUp {

    public static void main(String[] args) {
     
        Scanner l = new Scanner(System.in);
        
        System.out.println("Cadastro de usuário");

        System.out.println("Digite os dados: "+"\nNome: ");
        String nome = l.nextLine();
        
        System.out.println("Login desejado: "); 
        String login = l.nextLine();
        
        System.out.println("CPF: "); 
        String cpf = l.nextLine();
        
        System.out.println("Senha de acesso: ");
        int senha = l.nextInt();
        
        
        Dados usuario;
        
        usuario = new Dados();
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCPF(cpf);
        usuario.setSenha(senha);
        
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        
        usuarios.add(usuario);
        
        System.out.println("Cadastrado com sucesso!");
     }
}

public class Dados {
    
    private String nome;    
    private int senha;
    private String login;
    private String cpf;
     
    public Dados(){
    
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String name){
        nome = name;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String log){
        login = log;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public void setCPF(String cpf){
        cpf = car;
    } 

    public int getSenha(){
        return senha;
    }
        
    public int setSenha(int Senha){
        senha = Senha;
    } 
}

public class SignIn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("login> ");
        String login = in.nextLine();

        System.out.println("senha> ");
        String senha = in.nextLine();

        Dados usuario;

        if(login.equals(usuario.getLogin) && senha.equals(usuario.getSenha)){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}