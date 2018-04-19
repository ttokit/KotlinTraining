package io.access.kotlintraining

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val personalInfo: PersonalInfo? =  client?.let { it.personalInfo }

    val email: String? = personalInfo?.let { it.email }

    if (email != null && message != null)
        mailer.sendMessage(email, message)
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}