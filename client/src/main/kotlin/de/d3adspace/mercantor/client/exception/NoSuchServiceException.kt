package de.d3adspace.mercantor.client.exception

/**
 * @author Felix Klauke <fklauke></fklauke>@itemis.de>
 */
class NoSuchServiceException : RuntimeException {

    constructor()

    constructor(message: String) : super(message)

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(cause: Throwable) : super(cause)

    constructor(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) : super(message, cause, enableSuppression, writableStackTrace)
}