package com.springbootbooksApp;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.springbootbooksApp.api.Item;
import com.springbootbooksApp.api.Result;



@Controller
public class BookController {
	@Value("${books.api.url}")
    private String apiURL;

	@Autowired
	BookRepository repository;
	
	@RequestMapping(value="/books", method=RequestMethod.GET) 
	public String developersList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "books";		
		}
	
	 @GetMapping("/addBook")
	    public String addBook(Model model){
	        model.addAttribute("book", new Book());
	        return "addBook";
	    }
	 
	 @PostMapping("/saveNewBook")
	    @Transactional
	    public String saveAuthor(@ModelAttribute Book book) {
	        repository.save(book);
	        return "redirect:/books";
	    }
	
	 @GetMapping("/book/{id}")
	    public String getAuthorOtherBooks(@PathVariable("id") Integer id, Model model, HttpSession session) {

		    Book book = repository.findOne(id);
	        session.setAttribute("current", book);

	        RestTemplate restTemplate = new RestTemplate();
	        String formattedURL = MessageFormat.format(apiURL, book.getAuthor_lastName() + " " + book.getAuthor_firstName()); 
	        Result result = restTemplate.getForObject(formattedURL, Result.class);	

	        List<Book> moreBooks = new ArrayList<>();
	        result.getItems().forEach((Item item) -> moreBooks.add(addBook(item)));
	       
	        

	        model.addAttribute("moreBooks", moreBooks);
	        return "moreBooks";

	    }
	 

	    @DeleteMapping("/book/delete/{id}")
	    @Transactional
	    public String deleteBook(@PathVariable("id") Integer id) {
	        repository.delete(id);
	        return "redirect:/books";
	    }
	    
	    @RequestMapping("editBook/{id}")
	    public String editAuthor(@PathVariable Integer id, Model model){
	        model.addAttribute("book", repository.findOne(id));
	        return "editBook";
	    }
	 
	 private Book addBook(Item item) {
	        Book book = new Book();
	        book.setTitle(item.getVolumeInfo().getTitle());
	        book.setDescription(item.getVolumeInfo().getDescription());
	       

	        if(item.getVolumeInfo().getImageLinks() != null) {
	            book.setImageLink(item.getVolumeInfo().getImageLinks().getThumbnail());
	        }

	        return book;
	    }
}
