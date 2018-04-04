package retrofit.harshada.com.retrofitdemo.Interface;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;

public class NYCDataClientTest {



    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reposForUser() {

    }
    @Mock
    NYCDataClient nycDataClient;

    private SchoolListRepo userRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
      //  userRepository = new SchoolListRepo(reposForUser());
    }
}