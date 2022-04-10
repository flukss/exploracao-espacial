import Planeta.Planeta;
import Recursos.Recursos;
import org.junit.Assert;
import org.junit.Test;
import Recursos.Agua;
import Recursos.Oxigenio;

import java.util.ArrayList;

public class PlanetaTest {
    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta() {
        Planeta terra = new Planeta(4, new ArrayList<Recursos>());
        terra.recursos.add(new Agua());
        terra.recursos.add(new Oxigenio());
        int valorEsperado = 480;

        Assert.assertEquals(valorEsperado, terra.valorTotal());
    }
    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta() {
        Planeta terra = new Planeta(4, new ArrayList<Recursos>());
        terra.recursos.add(new Agua());
        terra.recursos.add(new Oxigenio());
        int valorEsperado = 168;

        Assert.assertEquals(valorEsperado, terra.valorPorPeso());

    }
    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso() {
        Planeta terra = new Planeta(1, null);
        int valorEsperado = 0;

        Assert.assertEquals(valorEsperado, terra.valorTotal());
    }
    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso() {
        Planeta terra = new Planeta(1, null);
        int valorEsperado = 0;

        Assert.assertEquals(valorEsperado, terra.valorPorPeso());
    }
}
