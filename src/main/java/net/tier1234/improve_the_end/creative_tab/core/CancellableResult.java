package net.tier1234.improve_the_end.creative_tab.core;

public enum CancellableResult {
    PASS(false),
    CANCEL(true);

    public static CancellableResult pass() {
        return PASS;
    }

    public static CancellableResult cancel() {
        return CANCEL;
    }

    private final boolean cancelled;

    CancellableResult(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }
}