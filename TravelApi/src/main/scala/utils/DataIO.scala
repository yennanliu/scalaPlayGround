package utils

// https://mungingdata.com/scala/read-write-json/
// https://github.com/lihaoyi/os-lib#getting-started

// TODO : make a trait, and get below classes via extend that trait
class DataIO{

  def loadRecords(fileName:String) = {
    os.read
    val userJson = os.read(os.pwd/"src"/"main"/"scala"/"data"/s"$fileName")
    val data = ujson.read(userJson)
    data
  }

  /** User IO */
  def getUserRecord() = {
    os.read
    val userJson = os.read(os.pwd/"src"/"main"/"scala"/"data"/"user.json")
    val data = ujson.read(userJson)
    data
  }

  def addUserRecord(userId:String): Unit = {
    val data = getUserRecord()
    // TODO : check if there is better mechanism
    // overwrite the file if already existed
    val newUser =  ujson.Obj(userId -> "")
    data(userId) = newUser
    os.write.over(os.pwd/"src"/"main"/"scala"/"data"/"user.json", data)
  }

  def deleteUserRecord(userId: String): Unit = {
    // TODO : fix this
    println("deleteUserRecord")
  }

//  /** Order IO */
//  def getOrderRecord() = {
//    os.read
//    val userJson = os.read(os.pwd/"src"/"main"/"scala"/"data"/"order.json")
//    val data = ujson.read(userJson)
//    data
//  }
}