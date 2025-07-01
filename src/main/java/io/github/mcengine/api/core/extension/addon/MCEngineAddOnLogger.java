package io.github.mcengine.api.core.extension.addon;

import io.github.mcengine.api.core.util.PrefixedLogger;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logger utility for AddOns, providing a prefixed logger for a specific AddOn name.
 */
public class MCEngineAddOnLogger {

    /**
     * The logger with automatic prefixing.
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
     * Logs an informational message with the AddOn prefix.
     *
     * @param message The message to log.
     */
    public void info(String message) {
        logger.info(message);
    }

    /**
     * Logs a warning message with the AddOn prefix.
     *
     * @param message The message to log.
     */
    public void warning(String message) {
        logger.warning(message);
    }

    /**
     * Logs a severe message with the AddOn prefix.
     *
     * @param message The message to log.
     */
    public void severe(String message) {
        logger.severe(message);
    }

    /**
     * Logs a message with the specified level and AddOn prefix.
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
