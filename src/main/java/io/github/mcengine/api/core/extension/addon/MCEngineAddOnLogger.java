package io.github.mcengine.api.core.extension.addon;

import io.github.mcengine.api.core.util.PrefixedLogger;
import org.bukkit.plugin.Plugin;

import java.util.logging.Logger;

/**
 * Logger utility for AddOns, providing a prefixed logger for a specific AddOn name.
 */
public class MCEngineAddOnLogger {

    /**
     * The logger with auto-prefix for this AddOn.
     */
    private final Logger logger;

    /**
     * Constructs a new AddOn logger for the specified plugin and AddOn name.
     *
     * @param plugin    The plugin instance to retrieve the logger from.
     */
    public MCEngineAddOnLogger(Plugin plugin, String addOnName) {
        this.logger = new PrefixedLogger(plugin.getLogger(), "[AddOn] [" + addOnName + "] ");
    }

    /**
     * Returns the logger with automatic prefixing.
     *
     * @return The prefixed logger.
     */
    public Logger getLogger() {
        return logger;
    }
}
