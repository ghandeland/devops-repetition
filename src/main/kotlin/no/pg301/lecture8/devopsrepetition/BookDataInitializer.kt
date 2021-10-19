package no.pg301.lecture8.devopsrepetition

object BookDataInitializer {
    fun getBooks(): List<Book> {

        val list = mutableListOf<Book>()

        list.run {
            add(Book(0, "Dune", "Frank Herbert", "Sci-Fi", 1965))
            add(Book(1, "1984", "George Orwell", "Dystopian", 1949))
            add(Book(2, "The DevOps Handbook", "Gene Kim", "Technology", 2015))
            add(Book(3, "Crime and punishment", "Fyodor Dostoevsky", "Philosophical novel", 1866))
        }

        return list
    }
}