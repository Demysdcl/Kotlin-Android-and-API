package com.iqmsoft.boot.vue

import org.springframework.hateoas.MediaTypes
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/books", produces = arrayOf(MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE))
open class BookController {

	@Autowired
	lateinit var bookRepository: BookRepository
	
    @PostMapping("/{id}/borrow")
    fun borrow(@PathVariable("id") id: Long, @RequestBody user: String): ResponseEntity<Any> {
        val book = bookRepository.findOne(id);
		
		if(book != null)
			{
				book.user = user;
				bookRepository.save(book);
			}
		
        //book.ifPresent({
            //it.user = user
            //bookRepository.save(it)
        //})
        return ResponseEntity.ok().build<Any>();
    }

    @PostMapping("/{id}/return")
    fun returnBook(@PathVariable("id") id: Long): ResponseEntity<Any> {
        val book = bookRepository.findOne(id);
		
		if(book != null)
			{
				book.user = null;
				bookRepository.save(book);
			}
		
       // book.ifPresent({
            //it.user = null
            //bookRepository.save(it)
        //})
        return ResponseEntity.ok().build<Any>();
    }
}
