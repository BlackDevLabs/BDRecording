package gg.blackdev.bdrecording.listeners;

import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.network.server.ServerDisconnectEvent;
import net.labymod.api.event.client.network.server.ServerJoinEvent;
import net.labymod.api.event.client.network.server.ServerSwitchEvent;
import net.labymod.api.event.client.network.server.SubServerSwitchEvent;

public class ServerNavigationListener {
  @Subscribe
  public void onServerConnect(ServerJoinEvent event) {
    System.out.println("\n\nStarted snapping gameplay on server " + event.serverData().getName() + "\n\n");
  }

  @Subscribe
  public void onServerSwitch(ServerSwitchEvent event) {
    System.out.println("\n\n stopped snapping gameplay on server " + event.previousServerData().getName() + "\n\n");
    System.out.println("\n\nStarted snapping gameplay on server " + event.newServerData().getName() + "\n\n");
  }
  @Subscribe
  public void onServerDisconnect(ServerDisconnectEvent event) {
    System.out.println("\n\n stopped snapping gameplay on server " + event.serverData().getName() + "\n\n");
  }

}
