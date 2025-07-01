package io.github.mcengine.api.core.extension.dlc;

import io.github.mcengine.api.core.util.PrefixedLogger;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logger utility for DLCs, providing a prefixed logger for a specific DLC name.
 */
public class MCEngineDLCLogger {

    /**
     * The logger with automatic prefixing.
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
     * Logs an informational message with the DLC prefix.
     *
     * @param message The message to log.
     */
    public void info(String message) {
        logger.info(message);
    }

    /**
     * Logs a warning message with the DLC prefix.
     *
     * @param message The message to log.
     */
    public void warning(String message) {
        logger.warning(message);
    }

    /**
     * Logs a severe message with the DLC prefix.
     *
     * @param message The message to log.
     */
    public void severe(String message) {
        logger.severe(message);
    }

    /**
     * Logs a message with the specified level and DLC prefix.
     *
     * @param level   The log level.
     * @param message The message to log.
     */
    public void log(Level level, String message) {
        logger.log(level, message);
    }

    /**
     * Returns the wrapped prefixed logger.
     *
     * @return the underlying logger with automatic prefixing.
     */
    public Logger getLogger() {
        return logger;
    }
}
