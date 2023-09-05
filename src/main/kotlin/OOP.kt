import eeemail.*
import java.lang.reflect.Array.set
import javax.swing.text.StyledEditorKit.FontFamilyAction

open class Person constructor(vararg name: String){                            //(параметр)
    var name: String = "Undefined"                          //var val - свойства
    var age: Int = 18
    fun SayHello(){
        print("Hello, my name is $name \n")
    }
    fun SayAge(){
        print("My age is $age")
    }
    fun go(location: String){
        println("$name goes to $location")
    }
    fun personToString() : String {
        return "Name: $name  Age: $age"
    }
}
fun PersonTest() {
    var Men: Person = Person() //создаем объект person  (!)меняем объект а не класс
    println(Men.name)     //18
    println(Men.age)      //Петя

    Men.age = 25
    Men.name = "Sergey"

    println(Men.name)       //25
    println(Men.age)        //Сережа

    Men.SayHello()            //Hello, my name is Сережа
    Men.go("Moscow")  //Сережа goes to Moscow
    Men.SayAge()              //My age is 25
}

class Womem constructor(_Name:String){      //первичный конструктор (можно без constructor)

    var age : Int = 18           //обозначения условий по умолчанию обязательно
    var name: String            //тут нет потому что значение указано в первичном конструкторе
    var corp: String = "Uncnown"
    init {                      //init - инициализатор
        name = _Name
    }

    constructor(_Name:String , _Age:Int , ) : this (_Name){ //вторичный конструктор
        age=_Age
    }

    constructor(_Name:String , _Age:Int , _Corp:String): this (_Name , _Age){ //вторичный консруктор
        corp=_Corp
    }


}
fun  WomemTest() {
    var Slawa: Womem = Womem("Slawa")
    var Vlada: Womem = Womem("Vlada" , 19)
    var Masha: Womem = Womem("Masha" , 21, "taxi")

    println("Name: ${Slawa.name}. Age: ${Slawa.age}")
    println("Name: ${Vlada.name}. Age: ${Vlada.age}. Job: ${Vlada.corp}")
    println("Name: ${Masha.name}. Age: ${Masha.age}. Job: ${Masha.corp}")
}

fun eeemailTest(){
    val myMessage = Message("Hello Kotlin")
    send(myMessage ,"sergeydudin963782@gmail.com")
}

class Employee(vararg Comp: String, ): Person(){
    var Comp: String  = "Under"    //"constructor()" определяет вторичный конструктор класса Employee
    fun SayComp(){                 // "super()" - вызывает конструктор базового класса(родительский класс)
        println("My company: $Comp")

    }
}
fun EmployeeTest(){
    var Sasha: Employee = Employee()
    Sasha.name = "Sasha"
    Sasha.SayHello()


    var Misha: Person = Person()
    Misha.name = "Misha"
    Misha.SayHello()


    var Dasha: Employee = Employee("Shawa")
    Dasha.Comp = "Shawa"
    Dasha.name = "Dasha"
    Dasha.SayHello()
    Dasha.SayComp()}



class visibilityModifiers (){
    private var Alexey: Employee=Employee() //доступен только в этом классе
    protected var Anton: Employee = Employee() //доступен только в этом классе и в классах наследниках
    internal var Irina: Employee = Employee() //в любой части модуля
    public var Vika: Employee = Employee() //везде




}

fun     setgetTest(){
}



fun main() {

}
