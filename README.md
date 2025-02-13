# DeckOfCards
Kotlin library that simulates a deck of playing cards that can be dealt and shuffled.

## How do I use it?

The API is real simple. Create an instance of a `Deck` and then you can call:
* `shuffle()` to randomize the cards
* `deal_card()` to remove the "top" card from the deck. It returns a `Card` which has a `Suit` and `FaceValue`

A simple, runnable example is provided in [Main.kt](src/main/kotlin/Main.kt):

```kotlin
val d = Deck()  // a new deck, left un-shuffled, will be in a deterministic order

for (i in 1..52) {
    print("${d.deal_card()} ")
}
print("\n")

val d2 = Deck()
d2.shuffle()  // kind of just have to trust that it happened.

var card : Card?
while (d2.deal_card().also { card = it } != null) {  // just another way to loop through
    print("$card ")
}
print("\n")
```

We get this output (this run):
```text
A❤ 2❤ 3❤ 4❤ 5❤ 6❤ 7❤ 8❤ 9❤ T❤ J❤ Q❤ K❤ A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ 
8♣ 4♣ 6♠ 2♠ 9♦ 2♦ K♠ 5♠ 7♠ K❤ 2❤ J♠ K♣ A♣ J♦ 7❤ 3❤ A♦ 5❤ A❤ 8♠ 4♦ 7♣ Q♦ 2♣ 5♦ 7♦ 4❤ 3♠ T♠ A♠ 6❤ 9♣ T♣ 4♠ 8♦ 5♣ J❤ 8❤ 3♣ J♣ 3♦ 9♠ 6♣ 9❤ T♦ K♦ Q♣ Q♠ T❤ 6♦ Q❤
```

## How can I use this library in my project?

The library is published using [Jitpack](https://jitpack.io/#codybrookshear/DeckOfCards/23034b03). If you are using *gradle*, just add `jitpack.io` as a repository, and add a dependency:

```kotlin
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.codybrookshear:deckofcards:1.0.1")
}
```

An example project that uses the library is provided in the [jitpack-sample](jitpack-sample) directory. Open it using **IntelliJ** or cd into `jitpack-sample` and `./gradle build && ./gradle run`.

[![](https://jitpack.io/v/codybrookshear/DeckOfCards.svg)](https://jitpack.io/#codybrookshear/DeckOfCards)

Tests are ran using JitCI:

[![](https://jitci.com/gh/codybrookshear/DeckOfCards/svg)](https://jitci.com/gh/codybrookshear/DeckOfCards)

## How can I build & run & test this?
 
Short answer is "use the IntelliJ IDEA IDE". But you can build and run from a command line as well. This project uses the [gradle](https://gradle.org/) build tool.

Build:
```shell
./gradlew build
```

Run Main.kt:
```shell
./gradlew run
```

Run unit tests. See tests in [src/test/kotlin](src/test/kotlin). We are using [Junit 5](https://junit.org/junit5/docs/current/user-guide/).
```shell
./gradlew test
```

## Anything else to know?

> [!NOTE]  
> Open question - as-is there's no way for the caller (or unit tests) to verify a shuffle actually occurred. Do we need a `Deck.checksum()` method that can be used to "verify" a shuffle actually happened?  Perhaps each card would have a UUID and then we'd need an algorithm that takes all these into account and creates a unique signature that changes after a shuffle occurs. BUT can't be reverse engineered to figure out card order.