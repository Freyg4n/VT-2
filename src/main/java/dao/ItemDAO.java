package dao;

import entity.Fridge;
import entity.Kettle;
import entity.TV;

import java.util.List;

public interface ItemDAO {

    /**
     * @return список чайников в xml файле
     */
    List<Kettle> getKettles();

    /**
     * @return список телевизоров в xml файле
     */
    List<TV> getTVs();

    /**
     * @return список холодильников в xml файле
     */
    List<Fridge> getFridges();

}