package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.Student;
import dao.StudentDAO;

@Path("Students")
public class StudentController {
	
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllStudents() {
		
		GenericEntity<List<Student>> studlist;
		
		studlist = new GenericEntity<List<Student>>(StudentDAO.getAllStudents()) {};
		
		return Response.ok(studlist).build();
	}
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudent(@PathParam("id") int id) {
		
		GenericEntity<List<Student>> studlist;
		
		studlist = new GenericEntity<List<Student>>(StudentDAO.getStudent(id)) {};
		
		return Response.ok(studlist).build();
	}
}
