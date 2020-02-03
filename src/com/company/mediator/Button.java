package com.company.mediator;

public class Button extends UIControl {
    private Boolean isEnabled;

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
