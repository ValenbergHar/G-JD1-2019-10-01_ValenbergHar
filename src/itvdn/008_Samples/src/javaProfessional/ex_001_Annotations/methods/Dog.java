package javaProfessional.ex_001_Annotations.methods;

// К классу Dog добавится полная информация об аннотации @Mammal в JavaDoc
@Mammal(color = Color.GREY, sound = "Woof")
public class Dog {
    @HasHair
    public void hair() {

    }
}
