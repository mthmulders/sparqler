package it.mulders.sparqler

import io.quarkus.picocli.runtime.annotations.TopCommand
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import it.mulders.sparqler.cli.HelloCommand
import it.mulders.sparqler.cli.SparqlerVersionProvider
import jakarta.inject.Inject
import picocli.CommandLine

@CommandLine.Command(
    mixinStandardHelpOptions = true,
    name = "sparqler",
    subcommands = [HelloCommand::class],
    versionProvider = SparqlerVersionProvider::class
)
@TopCommand
@QuarkusMain
class SparqlerApplication @Inject constructor(val factory: CommandLine.IFactory) : QuarkusApplication {
    override fun run(vararg args: String): Int = CommandLine(this, factory).execute(*args)
}
