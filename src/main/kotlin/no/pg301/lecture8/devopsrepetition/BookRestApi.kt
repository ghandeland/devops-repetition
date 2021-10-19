package no.pg301.lecture8.devopsrepetition

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookRestApi(val bookService: BookService) {

    @GetMapping("/books")
    fun getAllBooks(): ResponseEntity<List<Book>> {
        val bookList = bookService.getAllBooks()
        return ResponseEntity.status(200).body(bookList)
    }

}