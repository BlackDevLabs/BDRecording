package gg.blackdev.bdrecording;

import gg.blackdev.bdrecording.config.BDRConfig;
import gg.blackdev.bdrecording.hud.RecordingHUDWidget;
import gg.blackdev.bdrecording.listeners.ServerNavigationListener;
import net.labymod.api.LabyAPI;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.client.gui.hud.binding.category.HudWidgetCategory;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.icon.Icon;
import net.labymod.api.client.resources.ResourceLocation;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class BDRecording extends LabyAddon<BDRConfig>{
  //<>
  @Override
  protected void enable() {
    registerSettingCategory();
    registerListener(new ServerNavigationListener());

    //HudWidgetCategory category = new HudWidgetCategory("BDRecording");
    //labyAPI().hudWidgetRegistry().categoryRegistry().register(category);
    //labyAPI().hudWidgetRegistry().register(new RecordingHUDWidget(category));
  }

  @Override
  protected Class<? extends BDRConfig> configurationClass() {
    return BDRConfig.class;
  }


}
