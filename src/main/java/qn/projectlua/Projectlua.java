package qn.projectlua;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "projectlua",
        name = "Projectlua",
        description = "A powerful scripting API for Lua.",
        authors = {
                "01QueN10"
        }
)
public class Projectlua {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
