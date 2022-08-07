package dio.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void Mover() {
        System.out.println("Movendo-se defensivamente");
    }
}
