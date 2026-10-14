package Controller;

import model.PessoaService;

import java.util.List;

public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    public void cadastrar(){
        pessoaService.cadastrarPessoa("abc","abc");
    }

    public List<?> mostrar(){
        return pessoaService.listarPessoa();
    }

    public void deletar(int id){
        pessoaService.deletarPessoa(id);
    }

    public void atualizar(int id,String nome){
        pessoaService.atualizarPessoa(id,nome);
    }

}
