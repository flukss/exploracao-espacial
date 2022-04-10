import Nave.Nave;
import Planeta.Planeta;
import Recursos.Ferro;
import Recursos.Ouro;
import Recursos.Silicio;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NaveTest {
    @Test
    public void aNaveDeveIrAteOPlanetaDestinoEConseguirVoltarParaSuaPosicaoInicial() {
        Nave novaNave = new Nave(24);
        Planeta terra = new Planeta(3, null);
        int posicaoEsperada = 0;

        novaNave.explorar(terra);

        Assert.assertEquals(posicaoEsperada, novaNave.getPosicao());
    }
    @Test
    public void deveRetornarCorretamenteAPosicaoQueANaveEstaQuandoEstiverVoltando(){
        Nave novaNave = new Nave(18);
        Planeta terra = new Planeta(3, null);
        int posicaoEsperada = 2;

        novaNave.explorar(terra);

        Assert.assertEquals(posicaoEsperada, novaNave.getPosicao());

    }
    @Test
    public void deveRetornarCorretamenteAPosicaoQueANaveEsta(){
        Nave novaNave = new Nave(12);
        Planeta terra = new Planeta(3, null);
        int posicaoEsperada = 3;

        novaNave.explorar(terra);

        Assert.assertEquals(posicaoEsperada, novaNave.getPosicao());
    }
    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta() {
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(12);
        Planeta tatooine = new Planeta(4, null);
        milleniumFalcon.explorar(tatooine);


        Assert.assertEquals(posicaoEsperada, milleniumFalcon.getPosicao());
    }

    @Test
    public void deveGastarOCombustivelCorretamente() {
        Nave novaNave = new Nave(9);
        Planeta novoPlaneta = new Planeta(2, new ArrayList<>());
        novoPlaneta.recursos.add(new Ferro());
        novoPlaneta.recursos.add(new Ouro());
        novoPlaneta.recursos.add(new Silicio());
        int combustivelEsperado = 0;

        novaNave.explorar(novoPlaneta);

        Assert.assertEquals(combustivelEsperado, novaNave.getCombustivel());
    }
}
