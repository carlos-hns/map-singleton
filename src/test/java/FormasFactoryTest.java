import entidades.Circulo;
import org.junit.jupiter.api.Assertions;
import     org.junit.jupiter    .api.Test;

class FormasFactoryTest {

    private Circulo circulo;


    @Test
    void getIDCirculo() {
        circulo = FormasFactory.getCirculo();
        Assertions.assertEquals(1,circulo.getId());
    }

    @Test
    void getQuadrado() {

    }

    @Test
    void getTriangulo() {
        Assertions.assertEquals();
    }

    @Test
    void getQuantidadeDeInstanciasTriangulos() {

    }

    @Test
    void getQuantidadeDeInstanciasRetangulos() {

    }
}