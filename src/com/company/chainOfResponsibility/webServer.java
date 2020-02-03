package com.company.chainOfResponsibility;

public class webServer {
    private Handler handler;

    public webServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
