package valueclass.restriction

object ValueClassRestriction_04 extends App {
  // equals hashCodeは実装できない
//  class Hoge(val i:Int) extends AnyVal {
//    def equals(hoge:Hoge) = true // redefinition of equals method. See SIP-15, criterion 4. is not allowed in value class
//    def hashCode = 0             // redefinition of hashCode method. See SIP-15, criterion 4. is not allowed in value class
//  }
}
