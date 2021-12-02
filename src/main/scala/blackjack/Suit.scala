package blackjack

// A Suit is Diamond or Heart or Spades or Club
sealed trait Suit
object Suit {
  val suits: List[Suit] = List(Diamond(), Heart(), Spade(), Club())
}
final case class Diamond() extends Suit
final case class Heart() extends Suit
final case class Spade() extends Suit
final case class Club() extends Suit
