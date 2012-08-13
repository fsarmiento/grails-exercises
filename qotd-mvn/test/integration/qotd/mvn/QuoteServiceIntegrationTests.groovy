package qotd.mvn

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {

	def quoteService

	@Before
	void setUp() {
	}

	@After
	void tearDown() {
	}

	@Test
	void testStaticQuote() {
		def staticQuote = quoteService.getStaticQuote()
		assertEquals("Anonymous", staticQuote.getAuthor())
		assertEquals("Real programmers don't eat much Quiche", staticQuote.getContent())
	}
}
