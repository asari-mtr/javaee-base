package jp.co.anywhere.consumer.shared;

import jp.co.anywhere.iface.ServiceObject;

/**
 * Created by asari on 2015/11/11.
 */
public interface ServiceObjectConverter<VM extends ViewModel, SO extends ServiceObject> {
  VM toViewModel(SO serviceObject);
  SO toServiceObject(VM viewModel);
}
