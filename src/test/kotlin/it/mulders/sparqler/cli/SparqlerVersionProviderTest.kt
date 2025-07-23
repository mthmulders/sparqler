package it.mulders.sparqler.cli

import assertk.assertThat
import assertk.assertions.any
import assertk.assertions.contains
import org.junit.jupiter.api.Test

class SparqlerVersionProviderTest {
    private val provider: SparqlerVersionProvider = SparqlerVersionProvider(VERSION)

    @Test
    fun `should include supplied version number`() {
        // Arrange

        // Act
        val result = provider.getVersion()

        // Assert
        assertThat(result.asSequence())
            .any { it.contains(VERSION) }
    }

    companion object {
        private const val VERSION = "1.0"
    }
}
