package qotd.mvn

class QuoteService {

	boolean transactional = true

	def getStaticQuote() {
		def staticAuthor = "Anonymous"
		def staticContent = "Real programmers don't eat much Quiche"
		return new Quote(author: staticAuthor, content: staticContent)
	}

	def getRandomQuote() {
		def allQuotes = Quote.list()
		def randomQuote

		if (allQuotes.size() > 0) {
			def randomIdx = new Random().nextInt(allQuotes.size())
			randomQuote = allQuotes[randomIdx]
		} else {
			randomQuote = getStaticQuote()
		}
		
		return randomQuote
	}
}
