package jp.co.anywhere.consumer.shared;

import jp.co.anywhere.iface.Parameter;
import jp.co.anywhere.iface.ServiceObject;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by asari on 2015/11/23.
 */
public abstract class AbstractServiceProxy<VM extends ViewModel, SO extends ServiceObject> implements Proxy, ServiceObjectConverter<VM, SO>{

  protected VM invoke(Function<SO, SO> service, VM viewModel) {
    SO serviceObject = service.apply(toServiceObject(viewModel));
    return toViewModel(serviceObject);
  }

  /**
   * @param service
   * @param viewModel
   * @param parameterConverter
   * @param <PV> TODO 後で見直しViewModelのインタフェースを実装するようにしたい
   * @param <SV> TODO 後で見直しServiceObjectのインターフェースを実装するようにしたい
   * @return
   */
  protected <PV extends Parameter, SV extends Parameter> Collection<VM> invoke(Function<SV, Collection<SO>> service, PV viewModel, Function<PV, SV> parameterConverter) {
    Collection<SO> serviceObject = service.apply(parameterConverter.apply(viewModel));
    return serviceObject.stream().map(this::toViewModel).collect(Collectors.toList());
  }

  protected void invoke(Consumer<SO> function, VM viewModel) {
    function.accept(toServiceObject(viewModel));
  }

  protected Collection<VM> invoke(Supplier<Collection<SO>> function) {
    return function.get().stream().map(this::toViewModel).collect(Collectors.toList());
  }

  /**
   * 仮実装
   */
  protected  <P extends Parameter> P toParameter(P parameter) {
    return parameter;
  }

}
