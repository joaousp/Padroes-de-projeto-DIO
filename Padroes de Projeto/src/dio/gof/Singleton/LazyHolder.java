package dio.gof.Singleton;

public class LazyHolder {
    private static class Holder{
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder(){
        super();

    }

    public static LazyHolder getInstancia(){
        return Holder.instancia;
    }
}