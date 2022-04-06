import com.example.bookstore.BookRepository
import spock.lang.Specification

class BookRepositoryTests extends Specification {

    private BookRepository bookRepository = new BookRepository()

    def "bookstore returns correct number of books"() {
        expect:
        bookRepository.findAll().size() == 3
    }
}
