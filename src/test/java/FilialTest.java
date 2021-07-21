import Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
    @Test
    void deveRetornarNomeDiretorDaEmpresaDeUmaFilial(){
        Filial filial = new Filial(new Cidade(new Estado("MG")));
        Empresa empresa = new Empresa(new Grupo(new Funcionario()));
        Funcionario diretor = new Funcionario();

        diretor.setNomeFuncionario("Marco");
        empresa.setDiretor(diretor);
        filial.setEmpresa(empresa);

        assertEquals("Marco", filial.getNomeDiretorDaEmpresaDeUmaFilial());
    }

    @Test
    void deveRetornarFilialSemEmpresa(){
        Filial filial = new Filial(new Cidade(new Estado("RJ")));

        assertEquals("Model.Empresa não identificada", filial.getNomeDiretorDaEmpresaDeUmaFilial());
    }
}