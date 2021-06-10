package lu.uni.exercises.jakarta.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.core.MediaType;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lu.uni.exercises.jakarta.xml.xmlComponents.CubeView;

@RequestScoped
@ManagedBean
public class XmlBean  {
	@EJB
	EJBProcess ejbProcess;	
	
	private JAXBContext jaxbContext;
	private String doc, output, path;
	private CubeView cubeView;
	private StreamedContent file;
	private String[] years;
	private List<String> inputYears;
	private String fileName = "statec.xml";
	
	

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public List<String> getInputYears() {
		return inputYears;
	}

	public void setInputYears(List<String> inputYears) {
		this.inputYears = inputYears;
	}

	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String[] getYears() {
		return years;
	}

	public void setYears(String[] years) {
		this.years = years;
	}

	public void displayJsonfromXML() throws JAXBException, IOException  {
		File xmlFile = new File(fileName);
		jaxbContext = JAXBContext.newInstance(CubeView.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		cubeView = (CubeView) jaxbUnmarshaller.unmarshal(xmlFile);
		doc = ejbProcess.CreateJsonFromXml(cubeView, inputYears);
	}
	
	public void downloadFile() throws JAXBException, IOException {
		displayJsonfromXML();
    	InputStream stream = new ByteArrayInputStream(doc.getBytes()); 
        file = new DefaultStreamedContent(stream,
                MediaType.APPLICATION_JSON,
                "statec.json");         
	}
	
	@PostConstruct
	public void getyears() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		years = new String[year - 1994];
		int v = 0;
		for (int i=year; i>1994; i--) {
			years[v] = String.valueOf(i);
			v++;
		}		
	}

}
