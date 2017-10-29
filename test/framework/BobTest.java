package framework;

import application.Hostile;
import application.WorstEnemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BobTest {
    Bob bob;
    Hostile hostile;
    WorstEnemy worstEnemy;

    @Before
    public void init() {
        bob = new Bob();
        hostile = new Hostile();
        worstEnemy = new WorstEnemy();
    }

    @Test
    public void meetWorstEnemy() throws Exception {
        //given
        String expected = "Get out!";
        //when
        String actual = bob.tellStory(worstEnemy);
        //then
        assertEquals("test failed", expected, actual);
    }

    @Test
    public void meetHostile() throws Exception {
        //given
        String expected = "Just go away.";
        //when
        String actual = bob.tellStory(hostile);
        //then
        assertEquals("test failed", expected, actual);
    }

}