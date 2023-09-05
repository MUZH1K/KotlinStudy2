package eeemail

class Message(val text: String){

}

fun send(message: Message, address: String){
    println("Message `${message.text}` has been sent to $address")
}


fun main(){
    val myMessage = Message("Hello Kotlin")
    send(myMessage ,"sergeydudin963782@gmail.com")
}
