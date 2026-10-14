import Controller.PessoaController;
import model.PessoaService;

void main() {

    // Padrão MVC
    // Model é tudo que vai ir pro banco e tudo que vai virar uma lista

    // Controller, nao tem logica é tudo que comunica entre o front e o back

    // CRUD
    // Create
    // Read
    // Update
    // Delete

    PessoaService service = new PessoaService();
    PessoaController controller = new PessoaController(service);

    controller.cadastrar();

    IO.println(controller.mostrar());

    controller.atualizar(1,"resenha");
    IO.println(controller.mostrar());
}