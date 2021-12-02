package blackjack

// A Card is a Rank and Suit
final case class Card(rank: Rank, suit: Suit) {
  val points: Int =
    rank match {
      case Two()   => 2
      case Three() => 3
      case Four()  => 4
      case Five()  => 5
      case Six()   => 6
      case Seven() => 7
      case Eight() => 8
      case Nine()  => 9
      case Ten()   => 10
      case Jack()  => 10
      case Queen() => 10
      case King()  => 10
      case Ace()   => 11
    }
}
