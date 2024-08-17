package gg.blackdev.bdrecording.hud;


import gg.blackdev.bdrecording.config.BDRConfig;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.gfx.pipeline.renderer.primitive.ResourceRenderer;
import net.labymod.api.client.gui.hud.HudWidgetRendererAccessor;
import net.labymod.api.client.gui.hud.binding.category.HudWidgetCategory;
import net.labymod.api.client.gui.hud.hudwidget.HudWidget;
import net.labymod.api.client.gui.hud.hudwidget.HudWidgetConfig;
import net.labymod.api.client.gui.hud.hudwidget.SimpleHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.hud.position.HudSize;
import net.labymod.api.client.gui.icon.Icon;
import net.labymod.api.client.gui.mouse.MutableMouse;
import net.labymod.api.client.gui.screen.widget.widgets.hud.HudWidgetWidget;
import net.labymod.api.client.gui.screen.widget.widgets.renderer.IconWidget;
import net.labymod.api.client.render.matrix.Stack;
import net.labymod.api.client.resources.ResourceLocation;
import net.labymod.api.util.bounds.Rectangle;
import org.jetbrains.annotations.NotNull;
import java.awt.*;


public class RecordingHUDWidget extends TextHudWidget<TextHudWidgetConfig> {


  public RecordingHUDWidget(HudWidgetCategory category) {
    super("BDRecording");

    this.setIcon(Icon.texture(ResourceLocation.create("bdrecording","textures/recording.png")));
    this.bindCategory(category);

  }

  @Override
  public void load(TextHudWidgetConfig config) {
    super.load(config);

    super.createLine(
        Component.translatable("bdrecording.hudWidget.recording"),
        Component.text("Recording....")
    );
  }

}
