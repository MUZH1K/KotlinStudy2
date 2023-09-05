import java.util.Enumeration

fun main () {
    var a:  Array<Int> = arrayOf(1, 2, 3, 4, 5)

    printarray(array = a)
}

fun cycle () {

    for (a  in  1..9){
    println("квадрат числа $a = ${a * a}  ")
    }

}

fun multiplicationTable () {
    for(i in 1..9){

        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }
}

fun diapasons(){
    var a = 1..10 // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    var b = 5 downTo 1 // 5, 4, 3, 2, 1
    val range1 = 1 until 9          // 1 2 3 4 5 6 7 8
    val range2 = 1 until 9 step 2   // 1 3 5 7
    var c = 2 in range2 // false - нет в этом диапазоне
    print(c)

}

fun question (){
    val z = 1
    val a = 2

    var condition: Boolean = z > a
    println (condition)   // false - z меньше a

    var b =  a > z // true



    println (b)
    //hello() //вызов функции hello :)

    /*println("квадрат чисел")
     cycle()*/

    print("таблица умножения \n")
    multiplicationTable()
}

fun Enumeration(){
    val range1 = 5 downTo 1
    for(c in range1) print(c)   // 54321
    println()

    val range2 = 'a'..'d'
    for(c in range2) print(c)   // abcd
    println()

    for(c in 1..9) print(c)     // 123456789
    println()

    for(c in 1 until 9) print(c)    // 12345678
    println()

    for(c in 1..9 step 2) print(c)  // 13579
}

fun array(){
    //инициализируем данные в массиве
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5) //Aray<тип данных> = запись данных()
    var n = numbers[1] //получим второй элемент n=2
    numbers[2] = 5 //переустанавливаем третий элемент
    val numbers1 = Array(3, {5}) // [5, 5, 5]

}

fun data() {
    //определение данных в массиве
    var a: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(4 in a) // true
    println(4 !in a) // false
    println(6 in a) // false
}

fun type(){
    /*массивы для типов данных:
    BooleanArray, ByteArray, ShortArray, IntArray, LongArray, CharArray, FloatArray и DoubleArray*/
    val a : BooleanArray =  booleanArrayOf(true)
    val b : IntArray = intArrayOf(1, 2, 3)
}

fun array1(){
    /*чтение данных из массива
    p.s. дальше сам давай разбирайся мне лень
     */
    var pencil: IntArray = intArrayOf(1, 2, 3)
        for (a in pencil){
            println(a)}

    // кст вот упрощенная запись массива :)
    val table = Array(3, {0})

}

fun array2(){
    //чтение двухмерных arrays
    val table = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)     // первая строка таблицы
    table[1] = arrayOf(4, 5, 6)     // вторая строка таблицы
    table[2] = arrayOf(7, 8, 9)     // третья строка таблицы

    for(row in table){

        for(cell in row){
            print("$cell \t")
        }
        println() //смещение строки вниз(enter)
    }

}

