package org.example;

import java.util.HashSet;

//Формат сдачи: ссылка на подписанный git-проект.
//        Задание
//        Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//        Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//        Создайте метод
//public boolean equals(Object o)
//        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
//        только если значения во всех полях сравниваемых объектов равны.
//        Создайте метод
//public int hashCode()
//        который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//        Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bobik", "Black");
        Cat cat2 = new Cat("Bobik", "Black");
        Cat cat3 = new Cat("Dobby", "White");
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(cat1);
        hashSet.add(cat2);
        hashSet.add(cat3);
        System.out.println(hashSet);
        cat2.name = "Barsik";
    }
}