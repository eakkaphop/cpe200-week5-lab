package cpe200Test;

import cpe200.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 6/9/2559.
 */
public class UserTest {
    protected User user;
    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void setUserNameValid() throws Exception {
        assertEquals(null, user.setUserName("harrypotter"));
        assertEquals("harrypotter", user.setUserName("kinggeorge3"));
        assertEquals("kinggeorge3", user.setUserName("i5554321"));
        assertEquals("i5554321", user.setUserName("HarryPotter"));
        assertEquals("HarryPotter", user.setUserName("harrypotter"));
    }

    @Test
    public void setUserNameInValid() throws Exception {
        try {
            user.setUserName("harry"); // short
            fail("Expect an exception");
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setUserName("15554321"); // all number
            fail("Expect an exception");
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setUserName("5tormer5"); // lead with number
            fail("Expect an exception");
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setUserName("harry-potter"); // with symbol
            fail("Expect an exception");
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }
    }

    @Test
    public void setPasswordValid() throws Exception {
        assertEquals(14, user.setPassword("A123456789012a"));
        assertEquals(15, user.setPassword("1Abcdefghijklmn"));
        assertEquals(13, user.setPassword("Abcd12345abcd"));
    }

    @Test
    public void setPasswordInvalid() throws Exception {
        try {
            user.setPassword("Abcd1"); // short
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setPassword("Abcdefghtijk"); // no number
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setPassword("abcdefghtijk123"); // no capital
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }

        try {
            user.setPassword("ABCDEFGHIJK123"); // no small
        } catch (RuntimeException ex) {
        } catch (Exception ex) {
            fail("Expect runtime exception");
        }
    }

    @Test
    public void getUserName() throws Exception {
        user.setUserName("harrypotter");
        assertEquals("harrypotter", user.getUserName());
    }

    @Test
    public void getPassword() throws Exception {
        user.setPassword("1Abcdefghijklmn");
        assertEquals("1Abcdefghijklmn", user.getPassword());

    }

}
