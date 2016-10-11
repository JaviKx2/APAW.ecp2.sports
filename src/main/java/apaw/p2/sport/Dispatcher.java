package apaw.p2.sport;

import apaw.p2.sport.utils.web.http.HttpRequest;
import apaw.p2.sport.utils.web.http.HttpResponse;
import apaw.p2.sport.utils.web.http.HttpStatus;

public class Dispatcher {

	public void doGet(HttpRequest request, HttpResponse response) {
		// TODO Auto-generated method stub

	}

	public void doPost(HttpRequest request, HttpResponse response) {
		// TODO Auto-generated method stub

	}

	public void doPut(HttpRequest request, HttpResponse response) {
		// TODO Auto-generated method stub

	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		// TODO Auto-generated method stub

	}
	
	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

}
