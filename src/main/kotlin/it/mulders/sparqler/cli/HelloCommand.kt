package it.mulders.sparqler.cli

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import picocli.CommandLine

@CommandLine.Command(name = "hello", description = ["Greet world"])
class HelloCommand : Runnable {
    override fun run() {
        log.info("Hello, World!")
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(HelloCommand::class.java)
    }
}