package com.example.myfirsttests

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertSame
import org.junit.Test

class VerificationTestsTest {

    @Test
    fun equalsString() {
        assertEquals(VerificationTests.obj1, VerificationTests.obj2)
    }

    @Test
    fun notEqualsString() {
        assertNotEquals(VerificationTests.obj1, VerificationTests.obj3)
    }

    @Test
    fun arrayEquals() {
        assertArrayEquals(VerificationTests.obj4, VerificationTests.obj5)
    }

    @Test
    fun isNullString() {
        assertNull(VerificationTests.obj6)
    }

    @Test
    fun isNotNullString() {
        assertNull(VerificationTests.obj6)
    }

    /**
     * Утверждает, что два объекта ссылаются на один и тот же объект.
     * Если они не то же самое, выдается {@link AssertionError} без сообщения
     */
    @Test
    fun sameString() {
        assertSame(VerificationTests.obj1, VerificationTests.obj2)
    }
}
