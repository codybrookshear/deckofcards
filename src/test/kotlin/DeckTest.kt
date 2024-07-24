import org.example.Card
import org.example.Deck
import org.example.FaceValue
import org.example.Suit
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Order

class DeckTest {
    private lateinit var deck : Deck

    @org.junit.jupiter.api.BeforeEach
    fun setup() {
        deck = Deck()
    }

    @Test
    fun testCardCountAndNull() {
        // should have 52 valid deals before the deck is empty
        // and starts returning null
        for (i in 1..52) {
            assertNotNull(deck.deal_card())
        }
        assertNull(deck.deal_card())
        assertNull(deck.deal_card())
    }

    @Test
    fun testDefaultOrder() {
        // by default cards should be sorted in a deterministic order
        val expectedOrder = arrayOf(
            Card(Suit.HEARTS, FaceValue.ACE),
            Card(Suit.HEARTS, FaceValue.TWO),
            Card(Suit.HEARTS, FaceValue.THREE),
            Card(Suit.HEARTS, FaceValue.FOUR),
            Card(Suit.HEARTS, FaceValue.FIVE),
            Card(Suit.HEARTS, FaceValue.SIX),
            Card(Suit.HEARTS, FaceValue.SEVEN),
            Card(Suit.HEARTS, FaceValue.EIGHT),
            Card(Suit.HEARTS, FaceValue.NINE),
            Card(Suit.HEARTS, FaceValue.TEN),
            Card(Suit.HEARTS, FaceValue.JACK),
            Card(Suit.HEARTS, FaceValue.QUEEN),
            Card(Suit.HEARTS, FaceValue.KING),
            Card(Suit.SPADES, FaceValue.ACE),
            Card(Suit.SPADES, FaceValue.TWO),
            Card(Suit.SPADES, FaceValue.THREE),
            Card(Suit.SPADES, FaceValue.FOUR),
            Card(Suit.SPADES, FaceValue.FIVE),
            Card(Suit.SPADES, FaceValue.SIX),
            Card(Suit.SPADES, FaceValue.SEVEN),
            Card(Suit.SPADES, FaceValue.EIGHT),
            Card(Suit.SPADES, FaceValue.NINE),
            Card(Suit.SPADES, FaceValue.TEN),
            Card(Suit.SPADES, FaceValue.JACK),
            Card(Suit.SPADES, FaceValue.QUEEN),
            Card(Suit.SPADES, FaceValue.KING),
            Card(Suit.CLUBS, FaceValue.ACE),
            Card(Suit.CLUBS, FaceValue.TWO),
            Card(Suit.CLUBS, FaceValue.THREE),
            Card(Suit.CLUBS, FaceValue.FOUR),
            Card(Suit.CLUBS, FaceValue.FIVE),
            Card(Suit.CLUBS, FaceValue.SIX),
            Card(Suit.CLUBS, FaceValue.SEVEN),
            Card(Suit.CLUBS, FaceValue.EIGHT),
            Card(Suit.CLUBS, FaceValue.NINE),
            Card(Suit.CLUBS, FaceValue.TEN),
            Card(Suit.CLUBS, FaceValue.JACK),
            Card(Suit.CLUBS, FaceValue.QUEEN),
            Card(Suit.CLUBS, FaceValue.KING),
            Card(Suit.DIAMONDS, FaceValue.ACE),
            Card(Suit.DIAMONDS, FaceValue.TWO),
            Card(Suit.DIAMONDS, FaceValue.THREE),
            Card(Suit.DIAMONDS, FaceValue.FOUR),
            Card(Suit.DIAMONDS, FaceValue.FIVE),
            Card(Suit.DIAMONDS, FaceValue.SIX),
            Card(Suit.DIAMONDS, FaceValue.SEVEN),
            Card(Suit.DIAMONDS, FaceValue.EIGHT),
            Card(Suit.DIAMONDS, FaceValue.NINE),
            Card(Suit.DIAMONDS, FaceValue.TEN),
            Card(Suit.DIAMONDS, FaceValue.JACK),
            Card(Suit.DIAMONDS, FaceValue.QUEEN),
            Card(Suit.DIAMONDS, FaceValue.KING),
        )
    }

    @Test
    fun testAllCardShuffle() {

    }

    @Test
    fun testMultipleShuffles() {

    }

    @Test
    fun testOddNumberOfCardsShuffle() {

    }

    @Test
    fun testEmptyDeckShuffle() {

    }

}