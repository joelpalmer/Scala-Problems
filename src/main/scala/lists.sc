import com.problems.Lists
val ls = new Lists

//duplicate elements
ls.duplicate(List("Liam", "Sebastian", "Michelle", "Dusty"))

//demo getLast
val mary = ls.getLast(List("Joel", "May", "Mary")).get
ls.getLast(List())

//demo getKth
val listOfNumbers = List(1,2,3,4,5,6)
ls.getKth(listOfNumbers, 3).get