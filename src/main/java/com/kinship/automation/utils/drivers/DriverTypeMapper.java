package com.kinship.automation.utils.drivers;

import com.kinship.automation.constants.MobileDriverType;
import com.kinship.automation.constants.RunType;

public class DriverTypeMapper {
  public static MobileDriverType fromRunType(RunType runType) {
    switch (runType) {
      case LOCAL:
        return MobileDriverType.LOCAL;
      case REMOTE:
        return MobileDriverType.REMOTE;
      // Add other mappings as needed
      default:
        throw new IllegalArgumentException("Unsupported RunType: " + runType);
    }
  }
}
