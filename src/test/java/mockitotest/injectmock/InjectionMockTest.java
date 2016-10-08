package mockitotest.injectmock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class InjectionMockTest {
	
	@InjectMocks
	InjectionRecepient injectionRecepient = new InjectionRecepient();
	
	@Mock
	InjectedClass injectedClass;
	
	@Test
	public void testInjection(){
		when(injectedClass.sayHello()).thenReturn("Hello again");
		
		//test the call
	    injectedClass.sayHello();
	      
		verify(injectedClass, times(1)).sayHello();
		verify(injectedClass, atLeast(1)).sayHello();
		
	}

}
