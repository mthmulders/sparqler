package it.mulders.sparqler.cli;

import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.config.inject.ConfigProperty
import picocli.CommandLine

@ApplicationScoped
class SparqlerVersionProvider(@ConfigProperty(name = "quarkus.application.version") val version: String) : CommandLine.IVersionProvider {
    override fun getVersion(): Array<String>? = arrayOf("Sparqler v${version}")
}
