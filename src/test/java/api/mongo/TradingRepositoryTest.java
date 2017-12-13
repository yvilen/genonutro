package api.mongo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradingRepositoryTest {

    @Autowired
    TradingRepository repository;

    @Test
    public void canWrite(){
        TradingPlatform tradingPlatform = new TradingPlatform();
        tradingPlatform.setAlias("bob");
        List<TradingPlatform> saved = repository.findAll();

        assertNotNull(saved);
    }

    @After
    public void tearDown() throws Exception {
//        this.repository.deleteAll();
    }
}