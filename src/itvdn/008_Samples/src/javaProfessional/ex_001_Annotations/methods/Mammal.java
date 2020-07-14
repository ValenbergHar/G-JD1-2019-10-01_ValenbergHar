package javaProfessional.ex_001_Annotations.methods;

import java.lang.annotation.*;

/*
    @Target(ElementType.TYPE) - аннотация может использоваться только с классом, интерфейсом, перечислением enum или с другой аннотацией.
    @Documented - указываем, что данная аннотация будет указана в сгенерированной документации JavaDoc.
    @Retention(RetentionPolicy.RUNTIME) - аннотация хранится в .class файле и доступна во время выполнения программы.
    @Inherited - аннотация автоматически наследуется в дочерних классах описанного аннотацией класса.
 */

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Mammal {
    /**
     * @return sound of a mammal
     */
    String sound() default "Meow";

    /**
     * @return color of mammal
     */
    Color[] color() default Color.BLACK;
}