package com.kinship.automation.config;

import com.kinship.automation.constants.RemoteType;
import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

public class StringToRemoteTypeConverter implements Converter<RemoteType> {

  @Override
  public RemoteType convert(Method method, String remoteType) {
    return RemoteType.valueOf(remoteType.toUpperCase());
  }
}
