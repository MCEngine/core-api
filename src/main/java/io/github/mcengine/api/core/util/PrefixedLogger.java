package io.github.mcengine.api.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A wrapper for {@link Logger} that automatically prefixes messages with a given string.
 * This allows consistent log message formatting across different modules, such as AddOns and DLCs.
 * <p>
 * Use this logger when you want to reuse a logger instance that automatically prefixes messages
 * without needing to manually attach the prefix each time.
 */
public class PrefixedLogger extends Logger {

    /**
     * The original base logger used to log messages.
     */
    private final Logger baseLogger;

    /**
     * The prefix that will be prepended to all log messages.
     */
    private final String prefix;

    /**
     * Constructs a new prefixed logger that wraps the provided base logger.
     *
     * @param baseLogger The original logger to delegate logging operations to.
     * @param prefix     The prefix to prepend to all log messages.
     */
    public PrefixedLogger(Logger baseLogger, String prefix) {
        super(baseLogger.getName(), null);
        this.baseLogger = baseLogger;
        this.prefix = prefix;
    }

    /**
     * Logs a message at the specified level with the prefix.
     *
     * @param level The log level to use.
     * @param msg   The message to log.
     */
    @Override
    public void log(Level level, String msg) {
        baseLogger.log(level, prefix + msg);
    }

    /**
     * Logs a message at the specified level with the prefix and an associated exception.
     *
     * @param level   The log level to use.
     * @param msg     The message to log.
     * @param thrown  The exception to log.
     */
    @Override
    public void log(Level level, String msg, Throwable thrown) {
        baseLogger.log(level, prefix + msg, thrown);
    }

    /**
     * Logs a message at the INFO level with the prefix.
     *
     * @param msg The message to log.
     */
    @Override
    public void info(String msg) {
        baseLogger.info(prefix + msg);
    }

    /**
     * Logs a message at the WARNING level with the prefix.
     *
     * @param msg The message to log.
     */
    @Override
    public void warning(String msg) {
        baseLogger.warning(prefix + msg);
    }

    /**
     * Logs a message at the SEVERE level with the prefix.
     *
     * @param msg The message to log.
     */
    @Override
    public void severe(String msg) {
        baseLogger.severe(prefix + msg);
    }
}
