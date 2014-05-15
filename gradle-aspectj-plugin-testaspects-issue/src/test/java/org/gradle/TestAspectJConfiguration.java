package org.gradle;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Tests the ability to apply advice defined in the test source and in
 * application source to targets in both.
 * 
 * @author Mark Miller
 * 
 */
public class TestAspectJConfiguration {

    /**
     * Advice is in src/test target is in src/test
     */
    @Test
    public void testAspectInTestTargetInTest() {

        final TargetInTest t = new TargetInTest();

        final Object r = t.testAspectTarget();

        assertNotNull("Aspect from Test did not find Target in Test", r);
    }

    /**
     * Advice is in src/test target is in src/main.
     */
    @Test
    public void testAspectInTestTargetInMain() {

        final TargetInMain t = new TargetInMain();

        final Object r = t.testAspectTarget();

        assertNotNull("Aspect from Test did not find Target in Main", r);

    }

    /**
     * Advice is in src/main target is in src/test
     */
    @Test
    public void testAspectInMainTargetInTest() {

        final TargetInTest t = new TargetInTest();

        final Object r = t.mainAspectTarget();

        assertNotNull("Aspect from Main did not find Target in Test", r);
    }

    /**
     * Advice is in src/main target is in src/main
     */
    @Test
    public void testAspectInMainTargetInMain() {

        final TargetInMain t = new TargetInMain();

        final Object r = t.mainAspectTarget();

        assertNotNull("Aspect from Main did not find Target in Main", r);
    }

}
