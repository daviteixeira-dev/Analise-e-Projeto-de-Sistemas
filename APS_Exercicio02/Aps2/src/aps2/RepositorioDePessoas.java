
package aps2;

import java.util.HashMap;
import java.util.Map;

public class RepositorioDePessoas {
    static Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
    
    public void addPessoa(String matricula, Pessoa valor){
        pessoas.put(matricula, valor);
    }
    
    public void removerPessoa(String matricula){
        pessoas.remove(matricula);
    }
    
    public Pessoa acharPessoa(String matricula){
        return pessoas.get(matricula);
    }
    
    public Map<String, Pessoa> getPessoas(){ 
        return pessoas; 
    }

    public void setPessoas(Map<String, Pessoa> pessoas){
        RepositorioDePessoas.pessoas = pessoas;
    }
}
