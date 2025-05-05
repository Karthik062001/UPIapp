package web.services.calling.server;

public class RequestWrapper {

	private Object request;

    public RequestWrapper(Object request) {
        this.request = request;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }
		  
}
