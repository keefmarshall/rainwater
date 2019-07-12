package uk.eleusis.rainwater

class RainWater {

    fun calculateRainWater(bars: IntArray): Int {
        val maxRows = bars.max() ?: 0

        return (0..maxRows).fold(0) { vol, row ->
            calculateVolumeInRow(row, bars) + vol
        }
    }

    private fun calculateVolumeInRow(row: Int, bars: IntArray): Int {
        var inside = false
        var volume = 0
        var tempVolume = 0
        bars.forEach { bar ->
            if (bar > row) {
                volume += tempVolume
                tempVolume = 0
                inside = true
            } else if (inside) {
                tempVolume ++
            }
        }

        return volume
    }
}

fun main(args: Array<String>) {
    println("Use 'mvn test' to run this at present, text input not (yet) supported")
}
