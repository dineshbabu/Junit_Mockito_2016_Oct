package mockitotest;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorServiceImplTest {

	@Mock
	private BookService bookService;
	
	@Mock
    private BookValidatorService bookValidatorService;
	
	@Test
	public void testgetTotalBooks(){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Dinesh"));		
		books.add(new Book("Babu"));
		when(bookService.findBookByAuthor("Dinesh")).thenReturn(books);
		
		AuthorServiceImpl obj = new AuthorServiceImpl();
        obj.setBookService(bookService);
        obj.setBookValidatorService(new FakeBookValidatorService());
        
      //2. Test method
        int qty = obj.getTotalBooks("Dinesh");

		//3. Verify result
        assert(qty==2);
		
	}
}
