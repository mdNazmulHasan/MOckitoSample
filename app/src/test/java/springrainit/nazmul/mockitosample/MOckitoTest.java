package springrainit.nazmul.mockitosample;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static springrainit.nazmul.mockitosample.Foo.HELLO_WORLD;

import org.junit.*;

/**
 * Created by nazmul on 11/3/2017.
 */

public class MOckitoTest {
    @Test
    public void fooGreets() {
        Foo foo = mock(Foo.class);
        when(foo.greet()).thenReturn("ok");
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(foo.greet(), HELLO_WORLD);
    }


}
