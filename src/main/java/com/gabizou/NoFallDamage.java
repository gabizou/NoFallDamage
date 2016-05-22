package com.gabizou;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.cause.entity.damage.DamageTypes;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.entity.DamageEntityEvent;
import org.spongepowered.api.event.filter.cause.Root;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "no-fall-damage",
        name = "NoFallDamage",
        authors = "gabizou",
        version = "1.0.0",
        description = "Prevents players from taking fall damage"
)
public class NoFallDamage {

    @Listener
    public void onFall(DamageEntityEvent event, @Root DamageSource source) {
        event.setCancelled(source.getType().equals(DamageTypes.FALL));
    }

}
