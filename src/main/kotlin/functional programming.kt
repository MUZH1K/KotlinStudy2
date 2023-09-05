import javax.lang.model.element.Name


//здесь я узнаю что такое функции

fun showMessage(name: String){  ///значения в круглых скобках - аргумент.
    print(name)                 ///fun имя функции(имя аргумента : тип данных){инструкции}
}

fun human (name:String , age : Int , job:String = "unemploid"){     //значение job можно не указывать
    println()                                                       //по умолчанию установлено "безработный"
    print("name: $name  age: $age job: $job" )

}

fun double(n: Int){
    //n = n * 2   // !Ошибка - значение параметра нельзя изменить
    println("Значение в функции double: $n")
}

fun array3(name: IntArray){ //сложные аргументы вроде array можно изменять
    name [0] = name [0] * 2
    println("Значение в функции double: ${name[0]}")
}

fun printarray (array: Array<Int>){ //позволяет читать array без танцев с бубнами
    for (a in array){
        print(a)

    }
}

fun variable(vararg name: String){  // если мы не знаем сколько параметров нужно ставим vararg перед именем
     for (str in name){
         println(str)
     }
}

fun sum(x:Int , z:Int): Int{ // "Int" тип возвращаемых данных
    return x + z //"return" то, после чего должен возвращаться указанный тип, в нашем случае "Int"
 //если ничего не возвращаем то пишем Unit или ничего не пишем
}
fun square(x: Int) = x * x //так тоже можно если тело функции вместилось в одну строку

fun qwerty2() : Unit{      //см. fun qwerty
    print("Good morning")
}

fun qwerty(){           //оказывается переменной можно присваивать функции :)
    var a:() -> Unit    //говорим из чего должна состоять переменная а
    a = ::qwerty2       //::присваемая функция
    a()                 //вызываем переменную
}
fun main() {

        var asd = { a : String -> println("Привет, $a") }  //лямбда - безымянная функция (ты плохо ее изучил)
    asd("Коля")
}