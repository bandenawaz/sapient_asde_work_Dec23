import org.example.Mocking;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingTests {

    //Lets create an instance of Mocking Class
    Mocking mocking;

    @Mock
    User user = mock(User.class);

//    @BeforeEach
//    public void setup(){
//        user = mock.
//    }

    //Lets write the test Method
    @Test
    @DisplayName("Permissions Assigned Successfully")
    public void testPermissionsAssignedSuccessfully(){
        mocking = new Mocking();
        mocking.setUser(user);
        when(user.getRole()).thenReturn("admin");     //Method Stubbing
        //when(user.getRole()).thenReturn("sonali");
        Assertions.assertEquals(1,mocking.assignPermissions());
    }
}
