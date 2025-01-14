package com.grinderwolf.swm.api.events;

import com.grinderwolf.swm.api.world.SlimeWorld;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class AsyncPostGenerateWorldEvent extends Event {

  private static final HandlerList handlers = new HandlerList();
  private final SlimeWorld slimeWorld;

  public AsyncPostGenerateWorldEvent(SlimeWorld slimeWorld) {
    super(true);
    this.slimeWorld = Objects.requireNonNull(slimeWorld, "slimeWorld cannot be null");
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public @NotNull HandlerList getHandlers() {
    return handlers;
  }

  public SlimeWorld getSlimeWorld() {
    return slimeWorld;
  }
}
