package services.ServiceImpl;

import services.Service.ItemService;
import dao.ItemDAO;
import daoImpl.ItemDAOImpl;
import entity.Fridge;
import entity.Kettle;
import entity.TV;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public List<Kettle> getKettles() {
        return itemDAO.getKettles();
    }

    @Override
    public List<TV> getTVs() {
        return itemDAO.getTVs();
    }

    @Override
    public List<Fridge> getFridges() {
        return itemDAO.getFridges();
    }
}
