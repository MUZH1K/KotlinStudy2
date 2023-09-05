fun main() {
testCalc()
}



fun testCalc()  {
    var testSpisok = mutableListOf<Any>()

    testSpisok += 5
    testSpisok += 4
    testSpisok += 3
    testSpisok += 2
    testSpisok += 1

    for (i in testSpisok.indices){
        if (i < testSpisok.lastIndex && i != testSpisok.lastIndex ) {

            println("$testSpisok")
        }
        else {

        }



    }



}

fun lastIndex() {
    var ab : Char = 'a'
    var a = mutableListOf<Int>()
    var b = 4
    var c = true

    a += 1
    a += 2
    a += 3
    a += 4
    a += 5


    println(a)

    println(a.lastIndex)

    println(b == a.lastIndex)

    for (i in a.indices){

        println(i)
        if (i != a.lastIndex){
            println("if " + i)
        }

    }


    println("размер: ${a.size}")
}

fun hello (/*параметр функции(необязательно) */  ) {
    val name: String = "Серега"
                                
    print("Hello, $name!") //вывод сообщения
   // println("Hello World!") //следующий вывод будет на строчку ниже

    val a = 5
    val b = a in 1..6       // true - число 5 входит в последовательность от 1 до 6

    val c = 4
    val d = c in 11..15     // false - число 4 НЕ входит в последовательность от 11 до 15

    val ab = 5
    val bc = a !in 1..6        // false - число 5 входит в последовательность от 1 до 6

}

fun hi () {
    var a = 10
    //конструкция when

    when(a /*объект конструкции*/){ //тело конструкции


        10 -> {                                 //исход если a=10
            println("a = 10")
            a *= 2
        }
        20 -> {                                 //исход если a=20
            println("a = 20")
            a *= 5
        }
        30, 40 -> {                             //определяем действия для нескольких значений через запятую
            println("a = 30 или 40 ")
            a *= 10
        }
        in 11..15 -> {                    //сравниваем значения в определенном диапазоне с помощью оператор in
            println("a = 30 или 40 ")
            a *= 10
        }
        !in 11..15 -> {                   //позволяет узнать отсутствует ли значение в определенной последовательности
            println("a = 30 или 40 ")
            a *= 10
        }


        else -> { println("неопределенное значение")} //ни то ни другое
    }
    println(a)

}

fun test(){





}

fun workWithStr(){

    var object1 = "Hello Kotllin!"

    println(object1.lastIndex)  //индекс последнего символа

    print(object1.length)       //количество символов
    println(object1.count())    //то же самое

    println(object1.uppercase())    //caps on
    println(object1.lowercase())    //caps off

    println(object1.drop(4))     //удаление с начала
    println(object1.dropLast(3)) //удаление с конца

    println(object1.subSequence(1, 3  ))    //subSequence(удалить с начала , написать до .. )

    val s = "Kotlin is concise"
    val t = "Kotlin is cOncise"             // сравнивает значения, одинаковые = 0 , нет = нет
    println(s.compareTo(t))


    val a = "Hello"
    val b = "World"
    val sb = StringBuilder()
    sb.append(a).append(b)
    val c = sb.toString()
    println(c)

}

fun baza(args: Array<String>){

    var serega: Int = 2 // переменная

    val a = "Привет, мир!" //переменная которую нельзя изменить

    val z: Boolean = true
    val x: Boolean = false

    val c: Char = 't'

    val h: Any = 1  //Any поддерживает любой тип данных

    val name1 = readLine()  //readLine возвращает введеные значения, всегда имеет тип string

    val name: String = """ Серега
        
        
    """ //тройные кавычки для многострочного текста


    //функция if (пока это"true", делай это)
    if (serega == 2/*условие true.false*/) {/*выражение, которое будет выполняться*/
        serega = serega + 1
    }
    else {
        println(serega)
    }

    //вызываем функцию hello
    hello()

}

fun spiski(){
    var cats = mutableListOf<String>( // mutableListOf<тип данных> - список
        "Вася" ,
        "Рыжик" ,
        "Мурзик" ,
        "Барсик" ,
    )
    println(cats)
    cats.add("Вася")    //добавить в список
    println(cats)
    cats.remove("Рыжик")        //удалить удалить из списка
    println(cats)

    println(cats.get(1))        //второй элемент списка
    println(cats[1])            //так же

    cats.forEach{                       //перебирает элементы по порядку
        element -> println(element)
    }
    cats.forEach{println(it)}

    /* data class Cat (
         val name: String ,
         val age: Int ,
         val weght : Int
     )*/

    val list = listOf(1, 3, 9)
    println(list.javaClass)

    val listCats : List<String>
    val readOnlyCats = cats.toList() //меняет список в неизменяемый

    println(cats.getOrElse(4){"неизвестный котик"})     //можно указать больше с помощью getOrElse, и указать значение по умолчанию
    //или так
    println(cats.getOrElse(4) { cats.first() })

    println(list.any {it % 2 == 0 })    //true        // с помощью any можно пройтись по списку и узнать совпадает ли хоть один элемент с условием
    println(list.any { it > 10 })       //false

    println(list.all { it % 2== 0 })  //false      //совпадают ли все значения с условием
    println(list.none { it > 6 }) //true //!all

    println(list.count({it % 2 == 0}))                //позволяет узнать количество совпадений элементов и условия

    println(cats.maxOrNull())       //макcимальное количество или null


    cats.forEachIndexed{index , value ->
        println("в позиции $index находится $value")
    /*В позиции 0 содержится Барсик
      В позиции 1 содержится Рыжик
      В позиции 2 содержится Васька*/

    }




}

fun indices(){
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for (index in numbers.indices) {
        println("Значение индекса $index равно ${numbers[index]}")
    }
    println(numbers.indices)
}