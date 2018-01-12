/**
 * 
 */
package com.iae.wis.service.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iae.wis.service.dao.StudentJdbcRepository;

/**
 * @author
 *
 */
@Component
public class TrackerServiceRoute extends RouteBuilder {

	@Autowired
	private StudentJdbcRepository studentJdbcRepository;

	@Override
	public void configure() throws Exception {


		restConfiguration().component("restlet").host("localhost").port("9090").bindingMode(RestBindingMode.auto);

		rest("/iaewis").get("/students").produces("application/json").route().routeId("getStudent")
				.to("direct:getStudents");

		from("direct:getStudents").routeId("getStudentsRoute").log("Received request to retrive all students")
				.bean("studentJdbcRepository", "findById(1000)").marshal().json(JsonLibrary.Jackson);

	}

}