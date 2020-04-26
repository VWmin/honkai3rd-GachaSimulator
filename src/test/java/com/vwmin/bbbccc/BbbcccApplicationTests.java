package com.vwmin.bbbccc;

import com.vwmin.bbbccc.honkar3rd.GachaOperator;
import com.vwmin.bbbccc.honkar3rd.entities.Item;
import com.vwmin.bbbccc.honkar3rd.entities.Person;
import com.vwmin.bbbccc.honkar3rd.gacha.GachaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.util.Pair;

import java.io.IOException;
import java.util.List;


@SpringBootTest
class BbbcccApplicationTests {

    @Test
    void contextLoads(){

    }


    @Autowired
    GachaOperator operator;

    @Test
    void wodehuihe() throws IOException {
        Person person = new Person();
        Pair<GachaType, List<Item>> pair = operator.focusedB10(person);
        System.out.println(operator.draw(pair.getFirst(), pair.getSecond()));
    }

}
