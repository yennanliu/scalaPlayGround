package com.yen.bean

class Customer {
  // attr
  var id:Int = _
  var name:String = _
  var gender:Char = _
  var age:Short = _
  var tel:String = _
  var email:String = _

  // constructor
  def this(id:Int, name:String, gender:Char, age:Short, tel:String, email:String){
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }

  // constructor (without id)
  def this( name:String, gender:Char, age:Short, tel:String, email:String){
    this
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }
}
