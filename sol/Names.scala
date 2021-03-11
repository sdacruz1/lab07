package sol

/**
 * Names is a class that contains and modifies a val Array.
 *
 * @author cs18tas
 * @param nameList - an Array of Strings that is a private val
 */
class Names (nameList: Array[String]) {

  def clear(name: String){
    for (i <- 0 until nameList.length) {
      if (nameList(i) == name) {
        nameList(i) = "CLEARED"
      }
    }
     }
}


/**
 * Names2 is a class that contains and modifies a list as a var.
 *
 * @author cs18tas
 * @param nameList - a private var list of Strings
 */
class Names2 (private var nameList: List[String]) {

  def clear(name: String) {
    nameList = nameList.map(n => n match {
      case `name` => "CLEARED"
      case n => n})
  }
}


/**
 * Names3 is a class that contains a list of suspects as a val.
 *
 * @author cs18tas
 * @param nameList - a private val list of Strings
 */

class Names3 (nameList: List[String]) {

  def clear (name: String): Names3 = {
    val newList = nameList.map(n => n match {
      case `name` => "CLEARED"
      case n => n})
    new Names3(newList)
  }

}
