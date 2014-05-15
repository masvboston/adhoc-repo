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
public class TestAspectJ {

    /**
     * Advice is in Test target for advice is in test.
     */
    @Test
    public void testAspectInTestTargetInTest() {

        final TargetInTest t = new TargetInTest();

        final Object r = t.testAspectTarget();

        assertNotNull("Aspect from Test did not find Target in Test", r);
    }

    /**
     * Advice is in Test target is in source.
     */
    @Test
    public void testAspectInTestTargetInSrc() {

        final TargetInSrc t = new TargetInSrc();

        final Object r = t.testAspectTarget();

        assertNotNull("Aspect from Test did not find Target in Src", r);

    }

    @Test
    public void testAspectInSrcTargetInTest() {

        final TargetInTest t = new TargetInTest();

        final Object r = t.srcAspectTarget();

        assertNotNull("Aspect from Src did not find Target in Test", r);
    }

    @Test
    public void testAspectInSrcTargetInSrc() {

        final TargetInSrc t = new TargetInSrc();

        final Object r = t.srcAspectTarget();

        assertNotNull("Aspect from Src did not find Target in Src", r);
    }

}
