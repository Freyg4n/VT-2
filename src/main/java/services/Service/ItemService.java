package services.Service;

import entity.Fridge;
import entity.Kettle;
import entity.TV;

import java.util.List;

public interface ItemService {
    /**
     * @return возвращает список объектов типа Kettle
     */
    List<Kettle> getKettles();
    /**
     * @return возвращает список объектов типа TV
     */
    List<TV> getTVs();
    /**
     * @return возвращает список объектов типа Fridge
     */
    List<Fridge> getFridges();
}
