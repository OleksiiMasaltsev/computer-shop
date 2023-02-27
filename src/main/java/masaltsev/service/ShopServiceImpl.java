package masaltsev.service;

import java.util.List;
import masaltsev.dao.ShopDao;
import masaltsev.model.component.Component;

public class ShopServiceImpl implements ShopService {
    private final ShopDao shopDao;

    public ShopServiceImpl(ShopDao shopDao) {
        this.shopDao = shopDao;
    }

    @Override
    public void save(Component component) {
        shopDao.save(component);
    }

    @Override
    public List<Component> getAll() {
        return shopDao.getAll();
    }

    @Override
    public void remove(Component component) {
        shopDao.remove(component);
    }
}
