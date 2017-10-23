package application;

import framework.Bob;

/**
 * Класс демонстрирует использование написанного фреймворка.
 * Мы создаем людей (имплементят Man) и в зависимости от того,
 * кем человек является Бобу, он рассказывает историю, здоровается с женой,
 * спрашивает имя незнакомца
 */
public class Service {
    public static void main(String[] args) {
        Bob bob = new Bob();
        Jack jack = new Jack();
        Sara sara = new Sara();
        Vasya vasya = new Vasya();
        Hostile hostile = new Hostile();
        WorstEnemy worstEnemy = new WorstEnemy();

        System.err.println(bob.tellStory(hostile));
        System.err.println(bob.tellStory(worstEnemy));
    }
}
