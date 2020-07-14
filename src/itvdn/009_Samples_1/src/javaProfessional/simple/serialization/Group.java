package javaProfessional.simple.serialization;

import java.io.Serializable;

/**
 * Created by Yevhenii Tykhonov.
 */
public class Group implements Serializable {
    private String name;
    private transient Student student;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
