package zay.edu.hellospring.dao.cafedra.interfaces;

import zay.edu.hellospring.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {
    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra delete(String id);
    Cafedra update(Cafedra cafedra);
    List<Cafedra> getAll();
}
