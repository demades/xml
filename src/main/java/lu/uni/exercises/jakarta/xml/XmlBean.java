package lu.uni.exercises.jakarta.xml;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.print.attribute.standard.OutputDeviceAssigned;

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
	private String output;
	private JAXBContext jaxbContext;
	private Jsonb doc;
	private CubeView cubeView;
	
	public Jsonb getDoc() {
		return doc;
	}

	public void setDoc(Jsonb doc) {
		this.doc = doc;
	}




	public void jaxbXmlFileToObject() throws JAXBException, MalformedURLException  {
//		url = new URL(Urlpath);
		String path = new File("").getAbsolutePath();		
		File xmlFile = new File(fileName);
		jaxbContext = JAXBContext.newInstance(CubeView.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		cubeView = (CubeView) jaxbUnmarshaller.unmarshal(xmlFile);
		doc = ejbProcess.CreateJsonFromXml(cubeView);
		System.out.println(doc.toString());

	}
	
//	public void createJSONdoc() {
//		List<JSONDocument> docs = new ArrayList();
//		doc = new JSONDocument();
//		docs.add(doc);
//		Jsonb jsonb = JsonbBuilder.create();
//		String result = jsonb.toJson(doc);
//		System.out.println(result);
//		ejbProcess.myTest(cubeView);
//	}
	

}
