package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        UserList list = new UserList();
        list.addUser("TU4444Y", "1234567890");
        list.addUser("Patiphan", "8888");
        list.addUser("GaGmy", "12345");

        User u = list.findUserByUsername("GaGmy");

        assertEquals("GaGmy", u.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList list = new UserList();
        list.addUser("TU4444Y", "1234567890");
        list.addUser("Patiphan", "8888");
        list.addUser("GaGmy", "12345");

        list.changePassword("Patiphan", "8888", "8888");

        assertTrue(list.changePassword("Patiphan", "8888", "12344"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList list = new UserList();
        list.addUser("TU4444Y", "1234567890");
        list.addUser("Patiphan", "8888");
        list.addUser("GaGmy", "12345");

        User u = list.login("Patiphan", "8888");

        assertEquals(u, list.login("Patiphan", "8888"));
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList list = new UserList();
        list.addUser("TU4444Y", "1234567890");
        list.addUser("Patiphan", "8888");
        list.addUser("GaGmy", "12345");

        User u = list.login("Patiphan", "8822");

        assertNull(list.login("Patiphan", "8822"));
    }

}