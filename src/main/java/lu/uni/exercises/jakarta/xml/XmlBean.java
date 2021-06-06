package lu.uni.exercises.jakarta.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.ws.rs.core.MediaType;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lu.uni.exercises.jakarta.xml.xmlComponents.CubeView;
import lu.uni.exercises.jakarta.xml.xmlComponents.Data;
import lu.uni.exercises.jakarta.xml.xmlComponents.Row;
import lu.uni.exercises.jakarta.xml.xmlComponents.RowLabel;
import lu.uni.exercises.jakarta.xml.xmlComponents.Rows;
import jakarta.activation.*;

@ManagedBean
public class XmlBean  {
	@EJB
	EJBProcess ejbProcess;	
	
	private String fileName = "statec.xml";
//	private String Urlpath = "https://statistiques.public.lu/stat/TableViewer/download.aspx?x=";
	private URL url;
	private JAXBContext jaxbContext;
	private String doc;
	private CubeView cubeView;
	private StreamedContent file;
	private int[] years;

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

	public int[] getYears() {
		return years;
	}

	public void setYears(int[] years) {
		this.years = years;
	}

	public void jaxbXmlFileToObject() throws JAXBException, MalformedURLException  {
//		url = new URL(Urlpath);
		String path = new File("").getAbsolutePath();		
		File xmlFile = new File(fileName);
		jaxbContext = JAXBContext.newInstance(CubeView.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		cubeView = (CubeView) jaxbUnmarshaller.unmarshal(xmlFile);
		doc = ejbProcess.CreateJsonFromXml(cubeView);
	}
	
	public void downloadFile() {
    	InputStream stream = new ByteArrayInputStream(doc.getBytes()); 
        file = new DefaultStreamedContent(stream,
                MediaType.APPLICATION_JSON,
                "statec.json");         
	}
	
	public void getyears() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		years = new int[year - 1994];
		int v = 0;
		for (int i=year; i>1994; i--) {
			years[v] = i;
			v++;
		}
		
	}
	
}
