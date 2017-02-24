package com.example.j8_new_features;

public interface PersonInterface
{
    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    default String getPersonInfo()
    {
        return getName() + " ( " + getAge() + ")";
    }

    static String getPersonInfo(Person p)
    {
        return p.getName() + " ( " + p.getAge() + ")";
    }
}
