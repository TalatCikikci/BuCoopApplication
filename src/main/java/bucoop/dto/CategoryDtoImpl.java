package bucoop.dto;

import bucoop.model.Category;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CategoryDtoImpl implements CategoryDto{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistCategory(Category category) {
        entityManager.persist(category);
    }
    
    @Override
    @Transactional
    public Category getCategoryWithId(Integer categoryId) {
        final Category category = entityManager.find(Category.class, categoryId);
        if (category == null) {
            return null;
        }
        return category;
    }
    
    @Override
    @Transactional
    public List<Category> getCategories() {
        final List categoriesOrdered = entityManager.createQuery("SELECT h FROM Category h ORDER BY h.id ASC").getResultList();
        return categoriesOrdered;
    }

    
    @Override
    public List<Category> getCategoryList() {
        final List<Category> categoriyList = getCategories();
        return categoriyList;
    }
}