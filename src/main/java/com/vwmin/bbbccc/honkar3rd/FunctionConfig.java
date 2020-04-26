package com.vwmin.bbbccc.honkar3rd;

import com.vwmin.bbbccc.honkar3rd.gacha.CharacterSupply;
import com.vwmin.bbbccc.honkar3rd.gacha.EquipmentSupply;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.prefs.BackingStoreException;

/**
 * @author vwmin
 * @version 1.0
 * @date 2020/4/26 13:10
 */
@Component
public class FunctionConfig {
    @Bean("focusedSupplyA")
    public EquipmentSupply focusedSupplyA(ResourceManager manager) throws IOException, BackingStoreException {
        return new EquipmentSupply(manager, EquipmentSupply.FOCUSED_A);
    }

    @Bean("focusedSupplyB")
    public EquipmentSupply focusedSupplyB(ResourceManager manager) throws IOException, BackingStoreException {
        return new EquipmentSupply(manager, EquipmentSupply.FOCUSED_B);
    }

    @Bean("expansionSupplyA")
    public CharacterSupply expansionSupplyA(ResourceManager manager) throws IOException, BackingStoreException {
        return new CharacterSupply(manager);
    }

    @Bean("expansionSupplyB")
    public EquipmentSupply expansionSupplyB(ResourceManager manager) throws IOException, BackingStoreException {
        return new EquipmentSupply(manager, EquipmentSupply.EXPANSION_B);
    }
}
