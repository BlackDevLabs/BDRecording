package gg.blackdev.bdrecording.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@ConfigName("settings")
public class BDRConfig extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SettingSection("KeyBinds")
@KeyBindSetting
private final ConfigProperty<net.labymod.api.client.gui.screen.key.Key> snap  = new ConfigProperty<>(
      Key.R);

  @KeyBindSetting
  private final ConfigProperty<net.labymod.api.client.gui.screen.key.Key> ai  = new ConfigProperty<>(
      Key.P);

  @SettingSection("Widgets")
  @SwitchSetting
  private final ConfigProperty<Boolean> recordingwidget = new ConfigProperty<>(true);

  @Override
  public ConfigProperty<Boolean> enabled() {

    return enabled;
  }

  public ConfigProperty<Boolean> recordingwidget() {
    return recordingwidget();
  }

  public ConfigProperty<net.labymod.api.client.gui.screen.key.Key> getSnap() {
    return snap;
  }
  public ConfigProperty<net.labymod.api.client.gui.screen.key.Key> getAi() {
    return ai;
  }
}
