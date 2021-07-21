import Model.Escolaridade;
import Model.Funcionario;
import Model.Grupo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void deveRetornarEscolaridadeDoPresidenteDoGrupo(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);
        Escolaridade escolaridade = new Escolaridade("Mestrado");

        presidente.setEscolaridade(escolaridade);
        grupo.setPresidente(presidente);

        assertEquals("Mestrado", grupo.getEscolaridadePresidente());
    }

    @Test
    void deveRetornarSemEscolaridadeDoPresidenteDoGrupo(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);

        grupo.setPresidente(presidente);

        assertEquals("Model.Escolaridade não informada", grupo.getEscolaridadePresidente());
    }





}