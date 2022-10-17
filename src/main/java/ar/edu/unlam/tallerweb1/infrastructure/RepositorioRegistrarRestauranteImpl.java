package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.domain.restaurant.RepositorioRestaurante;
import ar.edu.unlam.tallerweb1.domain.restaurant.Restaurante;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioRegistrarRestauranteImpl implements RepositorioRestaurante {
    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioRegistrarRestauranteImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Restaurante> buscarPor(Usuario administrador) {
        return this.sessionFactory.getCurrentSession().createCriteria(Restaurante.class)
                .add(Restrictions.eq("administrador", administrador)).list();
    }
}
