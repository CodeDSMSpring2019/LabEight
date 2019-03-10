package edu.dmacc.codedsm.examples;

import java.util.Objects;

public class PlainOldObject {

    private String name;
    private Integer age;

    public PlainOldObject(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlainOldObject that = (PlainOldObject) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PlainOldObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
