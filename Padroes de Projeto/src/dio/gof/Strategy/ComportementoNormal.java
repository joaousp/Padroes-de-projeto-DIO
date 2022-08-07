package dio.gof.Strategy;

public class ComportementoNormal implements Comportamento{

    @Override
    public void Mover() {
        System.out.println("Movendo-se Normalmente");
    }
}
