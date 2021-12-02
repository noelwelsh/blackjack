package blackjack

// Deck is 52 or fewer cards
final case class Deck(cards: List[Card]) {
  def draw: (Card, Deck) =
    cards match {
      case ::(c, cs) => (c, Deck(cs))
      case Nil       => throw new Exception("We are out of cards")
    }
}
object Deck {
  val full: Deck = {
    val cards =
      for {
        suit <- Suit.suits
        rank <- Rank.ranks
      } yield Card(rank, suit)

    Deck(cards)
  }
}
