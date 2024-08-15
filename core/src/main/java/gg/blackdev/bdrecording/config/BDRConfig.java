package gg.blackdev.bdrecording.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;

@ConfigName("settings")
public class BDRConfig extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

@KeyBindSetting
private final ConfigProperty<net.labymod.api.client.gui.screen.key.Key> snap  = new ConfigProperty<>(
      Key.R);

  @Override
  public ConfigProperty<Boolean> enabled() {

    return enabled;
  }
  public ConfigProperty<net.labymod.api.client.gui.screen.key.Key> getSnap() {
    return snap;
  }
}
