package com.vwmin.bbbccc.honkar3rd;

import com.vwmin.bbbccc.honkar3rd.entities.Item;
import org.apache.commons.codec.Charsets;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @author vwmin
 * @version 1.0
 * @date 2020/4/24 20:36
 */
@Component
public class ItemUtil {
    private static Map<String, Item> map;

    public ItemUtil(ResourceManager manager) throws IOException {
        String json = FileUtils.readFileToString(manager.getItems().getFile(), Charsets.UTF_8);
        map = ItemDeserializer.deserialize(json);
    }


    public static Item item(String key) {
        return map.get(key).clone();
    }
}
