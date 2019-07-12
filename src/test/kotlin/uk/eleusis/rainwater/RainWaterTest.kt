package uk.eleusis.rainwater

import org.junit.Test

import org.junit.Assert.*

class RainWaterTest {

    @Test
    fun calculateRainWater1() {
        val rw = RainWater()
        val testData = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
        val expected = 6
        assertEquals(expected, rw.calculateRainWater(testData))
    }

    @Test
    fun calculateRainWaterDoubleMinima() {
        val rw = RainWater()
        val testData = intArrayOf(0,1,0,2,1,0,1,0,1,3,2,1,2,1)
        val expected = 9
        assertEquals(expected, rw.calculateRainWater(testData))
    }

    @Test
    fun calculateRainWaterDoubleMinima2() {
        val rw = RainWater()
        val testData = intArrayOf(0,1,0,2,1,0,0,1,0,1,3,2,1,2,1)
        val expected = 11
        assertEquals(expected, rw.calculateRainWater(testData))
    }

    @Test
    fun calculateRainWaterContainingFinalBlock() {
        val rw = RainWater()
        val testData = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1,2)
        val expected = 7
        assertEquals(expected, rw.calculateRainWater(testData))
    }

    @Test
    fun calculateRainWaterContainingInitialBlock() {
        val rw = RainWater()
        val testData = intArrayOf(1,0,1,0,2,1,0,1,3,2,1,2,1)
        val expected = 7
        assertEquals(expected, rw.calculateRainWater(testData))
    }

}