package javaProfessional.ex_001_lambdaExpression.withoutLambdaExpression;

public class Radio implements ElectricityConsumer{

    private void playMusic() {
        System.out.println("Radio plays");
    }

    public void electricityOn(Object sender) {
        playMusic();
    }
}
