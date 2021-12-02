package blackjack

import scala.annotation.tailrec

object Game {
  def askPlayer(): Action =
    ???

  @tailrec def loop(player: Hand, dealer: Hand, deck: Deck): Result = {
    askPlayer() match {
      case Hit() =>
        val (card, newDeck) = deck.draw
        // A tail recursive loop
        loop(player.add(card), dealer, newDeck)

      case Stick() =>
        if (player.points > dealer.points) PlayerWins()
        else PlayerLoses()
    }
  }
}

sealed trait Result
final case class PlayerWins() extends Result
final case class PlayerLoses() extends Result

sealed trait Action
final case class Hit() extends Action
final case class Stick() extends Action
