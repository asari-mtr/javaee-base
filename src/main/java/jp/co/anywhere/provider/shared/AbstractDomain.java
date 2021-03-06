package jp.co.anywhere.provider.shared;

import jp.co.anywhere.iface.ServiceObject;
import jp.co.anywhere.iface.Parameter;
import jp.co.anywhere.provider.repository.SimpleRepository;

import javax.inject.Inject;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by asari on 2015/11/17.
 */
public abstract class AbstractDomain<M extends ServiceObject, E extends AbstractEntity> implements Domain<M, E>, EntityConverter<M, E> {

  private final Class<E> clazz;

  @Inject
  private SimpleRepository<E> repository;

  public AbstractDomain() {
    final ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
    clazz = (Class<E>) type.getActualTypeArguments()[1];
  }

  public Collection<M> findAll() {
    return repository.findAll(clazz).stream().map(this::toServiceObject).collect(Collectors.toList());
  }

  public Collection<M> findMany(Parameter parameter) {
    return repository.findMany(clazz,parameter).stream().map(this::toServiceObject).collect(Collectors.toList());
  }

  public void delete(Long id) {
    repository.delete(id);
  }

  public M save(M model) {
    Long id = model.getId();
    E e = null;
    if (id == null) {
      try {
        e = clazz.newInstance();
      } catch (InstantiationException e1) {
        // TODO
        e1.printStackTrace();
      } catch (IllegalAccessException e1) {
        // TODO
        e1.printStackTrace();
      }
    } else {
      e = repository.get(id);
    }
    E saved = repository.save(toEntity(e, model));

    return toServiceObject(saved);
  }

  public M get(Long id) {
    return toServiceObject(repository.get(id));

  }

}
