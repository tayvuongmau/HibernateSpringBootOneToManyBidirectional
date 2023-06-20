package demo.service;

import demo.entity.Author;
import demo.entity.Book;
import demo.repository.AuthorRepository;
import demo.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookstoreService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }
    public void insertAuthorWithBooks(){
        Author author = new Author();
            author.setName("Thang");
            author.setAge(30);
            author.setGenre("NVVP");
        Book book = new Book();
            book.setTitle("Naruto Shippuden");
            book.setIsbn("2023-No1");
        author.addBook(book);
        authorRepository.save(author);
    }

    @Transactional
    public void deleteBookOfAuthor(){
        Author author = authorRepository.fetchByName("Thang");
        Book book = author.getBooks().get(0);
        author.removeBook(book);
    }

    public void deleteAllBookOfAuthor(){
        Author author = authorRepository.fetchByName("Thang");
        author.removeBooks();
    }

























}
