package framework;

import application.WorstEnemy;

/**
 *
 */
public class Bob implements Man {

    private Narrator bob = new Narrator();

    public String tellStory(Man man) {

        String result = "ты кто такой?";
        Class clazz = man.getClass();


        if (clazz.isAnnotationPresent(Wife.class)) {
            result = "привет, дорогая";
        } else if (clazz.isAnnotationPresent(Friend.class)) {
            Friend annotation = (Friend) clazz.getAnnotation(Friend.class);

            StringBuilder stringBuilder = new StringBuilder();

            result = stringBuilder
                    .append(annotation.name())
                    .append(", ")
                    .append(getStory())
                    .toString();
        } else if (clazz.isAnnotationPresent(Enemy.class)) {
            Enemy annotation = (Enemy) clazz.getAnnotation(Enemy.class);
            int countOffences = annotation.countOffences();
            if (countOffences > 16) {
                result = "Get out!";
            } else {
                result = "Just go away.";
            }
        }
        return result;
    }

    private String getStory() {
        try {
            bob.tellStory();
            return "Вот такая история";
        } catch (Exception e) {
            System.out.println(e);
            return "представляешь, настоящая акула!";
        }
    }
}
