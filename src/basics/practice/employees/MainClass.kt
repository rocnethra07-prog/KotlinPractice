package basics.practice.employees

import java.math.BigDecimal

fun main(){
    val emp1 = Employee("Nethra", 18, 20000)
    val emp2 = Employee("Abhi", 62, 40000)
    val emp3 = Employee("Zayn", 43, 10000)

    val listOfEmployee = listOf(emp1, emp2, emp3)

//    println(listOfEmployee.sorted())     default comparable (sorts by name)

//    println(listOfEmployee.sortedWith(AgeComparator()))  - 1

//    println(listOfEmployee.sortedWith(ageComparator))    - 2

    //as Lambda
    val sortedList: List<Employee> = listOfEmployee.sortedWith (
        Comparator<Employee> {
            e1, e2 -> e1.age.compareTo(e2.age)
        }
    )
    //internally lambda gets converted to object of type Comparator<Employee>

//    println(sortedList)                                   - 3

    val sortedList2 = listOfEmployee.sortedWith {
        e1, e2 -> e1.age.compareTo(e2.age)
    }
//    Under the hood, Kotlin converts that lambda into a Comparator object automatically.

//    println(sortedList2)                                  - 4

    println(
        listOfEmployee.sortedWith(
            compareBy<Employee> { it.age }
        )
    )                                                       //5


    println(
        listOfEmployee.sortedBy { it.age }
    )                                                      //6



    println(
        listOfEmployee.sortedWith (
            compareBy<Employee>{ employee -> employee.salary }
        )
    )

    println(
        listOfEmployee.sortedWith (
            compareBy { it.salary }
        )
    )

    println(listOfEmployee.sortedBy { it.salary})



}