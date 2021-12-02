package blackjack

// A Hand is 2 or more Cards
final case class Hand(card1: Card, card2: Card, remainder: List[Card]) {
  def points: Int =
    card1.points + card2.points + remainder.map(c => c.points).sum

  def add(card: Card): Hand =
    Hand(card1, card2, card :: remainder)
}
object Hand {
  def apply(card1: Card, card2: Card): Hand =
    Hand(card1, card2, List.empty)
}
