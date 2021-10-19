package no.pg301.lecture8.devopsrepetition

import org.springframework.stereotype.Service

@Service
class BookService {

    fun getAllBooks(): List<Book> {
        return BookDataInitializer.getBooks()
    }

}