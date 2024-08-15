package gg.blackdev.bdrecording;

import gg.blackdev.bdrecording.config.BDRConfig;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class BDRecording extends LabyAddon<BDRConfig>{
  //<>
  @Override
  protected void enable() {
    registerSettingCategory();
  }

  @Override
  protected Class<? extends BDRConfig> configurationClass() {
    return BDRConfig.class;
  }



}
