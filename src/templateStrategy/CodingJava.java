package templateStrategy;

public class CodingJava implements CodingTemplate{
    @Override
    public void preCook() {
        System.out.println("打开eclipse");
    }

    @Override
    public void cooking() {
        System.out.println("写java");
    }

    @Override
    public void afterCook() {
        System.out.println("发布java");
    }
}
