package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    private SingletonService(){ // private을 선언하여 임의적인 선언을 막는다.

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
