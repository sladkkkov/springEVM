package ru.sladkkov.database.springEVM;

import org.hibernate.LazyInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.repository.BuyerRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
    @Autowired
    BuyerRepository buyerRepository;
    @Test(expected = LazyInitializationException.class)
    public void lazyLoading() throws Exception {
        buyerRepository.deleteById(1252);

    }
}
