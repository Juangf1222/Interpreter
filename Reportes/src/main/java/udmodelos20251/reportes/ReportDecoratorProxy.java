

class ReportDecoratorProxy implements ReportDecorator {
    private ReportDecorator realDecorator;
    private User user;

    public ReportDecoratorProxy(ReportDecorator decorator, User user) {
        this.realDecorator = decorator;
        this.user = user;
    }

    public void generateReport() {
    }

    private boolean checkAcces() {
    }
}