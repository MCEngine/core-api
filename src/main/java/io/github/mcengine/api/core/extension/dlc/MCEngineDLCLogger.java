package io.github.mcengine.api.core.extension.dlc;

import io.github.mcengine.api.core.util.PrefixedLogger;
import org.bukkit.plugin.Plugin;

import java.util.logging.Logger;

/**
 * Logger utility for DLCs, providing a prefixed logger for a specific DLC name.
 */
public class MCEngineDLCLogger {

    /**
     * The logger with auto-prefix for this DLC.
     */
    private final Logger logger;

    /**
     * Constructs a new DLC logger for the specified plugin and DLC name.
     *
     * @param plugin  The plugin instance to retrieve the logger from.
     */
    public MCEngineDLCLogger(Plugin plugin, String dlcName) {
        this.logger = new PrefixedLogger(plugin.getLogger(), "[DLC] [" + dlcName + "] ");
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
