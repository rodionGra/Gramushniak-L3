package com.thirdlsnacdhomework

/**
 * Sort map <Int, String> in ascending key value.
 *   It is necessary to create
 *   <Person, String> where Person - a class in which there is an age. Sort by age*/

fun main() {

    val person1 = Person("Gary", 34)
    val person2 = Person("David",12)
    val person3 = Person("Jason",45)
    val person4 = Person("Luis",10)
    val person5 = Person("Richard",8)
    val person6 = Person("Frank",23)

    var mapOfPerson = mapOf<Person, String>(person1 to "person1", person2 to "person2", person3 to "person3",
                                            person4 to "person4", person5 to "person5", person6 to "person6")


    println("Unsorted  map : $mapOfPerson")

    mapOfPerson = mapOfPerson.toList().sortedBy { (key, _) -> key.age}.toMap()

    println("Sorted by age:  $mapOfPerson")
}

data class Person(val name : String, val age : Int){
    override fun toString(): String {
        return "(name='$name', age=$age)"
    }
}