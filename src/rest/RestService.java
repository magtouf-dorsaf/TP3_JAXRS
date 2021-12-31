package rest;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.GestionLivreImp;
import model.Livre;

@Path("/livre")
public class RestService {
	
	GestionLivreImp dao ;
	 public RestService() {
		this.dao=new GestionLivreImp();
	}
	 
	@GET
	@Path("/listeLivre")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livre> getAllLivre(){
		return dao.getAllLivre();
	}
	
	@POST
	@Path("/livreById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Livre getLivreById(@PathParam("id") int idd){
		return dao.getLivreByID(idd);
	}
	
	

}