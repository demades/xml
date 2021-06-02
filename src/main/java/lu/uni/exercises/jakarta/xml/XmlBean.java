package lu.uni.exercises.jakarta.xml;

import java.io.File;

import javax.faces.bean.ManagedBean;
import javax.print.attribute.standard.OutputDeviceAssigned;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.activation.*;

@ManagedBean
public class XmlBean  {
	
	private String fileName = "statec.xml";
	private String output;
	private JAXBContext jaxbContext;
	
	
	
	public String getOutput() {
		return output;
	}



	public void setOutput(String output) {
		this.output = output;
	}


	public void jaxbXmlFileToObject() throws JAXBException  {
		String path = new File("").getAbsolutePath();
		
		File xmlFile = new File(fileName);
		jaxbContext = JAXBContext.newInstance(CubeView.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		CubeView cubeView = (CubeView) jaxbUnmarshaller.unmarshal(xmlFile);
		System.out.println(cubeView.toString());
		output = cubeView.toString();
		
	}
	

}
