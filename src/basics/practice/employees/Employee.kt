package basics.practice.employees

data class Employee(val name:String, val age:Int,val salary: Int) : Comparable<Employee>{

    override fun compareTo(other: Employee) : Int{
        return this.name.compareTo(other.name)
    }

}
