package org.badhombre.mailbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MailboxApplication

fun main(args: Array<String>) {
	runApplication<MailboxApplication>(*args)
}
