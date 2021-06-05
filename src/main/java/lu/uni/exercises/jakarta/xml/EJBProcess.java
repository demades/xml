package lu.uni.exercises.jakarta.xml;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import lu.uni.exercises.jakarta.xml.xmlComponents.C;
import lu.uni.exercises.jakarta.xml.xmlComponents.Cells;
import lu.uni.exercises.jakarta.xml.xmlComponents.CubeView;
import lu.uni.exercises.jakarta.xml.xmlComponents.Data;
import lu.uni.exercises.jakarta.xml.xmlComponents.Row;
import lu.uni.exercises.jakarta.xml.xmlComponents.RowLabel;
import lu.uni.exercises.jakarta.xml.xmlComponents.RowLabels;
import lu.uni.exercises.jakarta.xml.xmlComponents.Rows;

/**
 * Session Bean implementation class EJBProcess
 */
@Stateless
@LocalBean
public class EJBProcess implements EJBProcessLocal {
	
	Data data;
	Rows rows;
	JSONDocument entry;
	List<JSONDocument> doc;
	Row[] rowList;
	Cells cells;
	List<C> cList;
	C[] cs;
	RowLabels rowLabels;
	RowLabel rowLabel;
	C c;
	Jsonb jdoc;
	

    /**
     * Default constructor. 
     */
    public EJBProcess() {
        // TODO Auto-generated constructor stub
    }
    
    public Jsonb CreateJsonFromXml(CubeView cubeView) {
    	jdoc = JsonbBuilder.create();
    	rowList = cubeView.getData().getRows().getRow();
    //	doc = new ArrayList();
    	
    	for (int i=0; i<rowList.length; i++) {
    		entry = new JSONDocument();
    		entry.setResidentBorderes(rowList[i].getCells().getC()[0].getV());
    		entry.setNonResidentBorderes(rowList[i].getCells().getC()[1].getV());
    		entry.setNationalWageEarners(rowList[i].getCells().getC()[2].getV());
    		entry.setDomesticWageEarners(rowList[i].getCells().getC()[3].getV());
    		entry.setNationalSeflEmployment(rowList[i].getCells().getC()[4].getV());
    		entry.setDomesticSelfEmployment(rowList[i].getCells().getC()[5].getV());
    		entry.setNationalEmployment(rowList[i].getCells().getC()[6].getV());
    		entry.setDomesticEmployment(rowList[i].getCells().getC()[7].getV());
    		entry.setNumberUnemployed(rowList[i].getCells().getC()[8].getV());
    		entry.setActivePopulation(rowList[i].getCells().getC()[9].getV()); 
    		String result = jdoc.toJson(entry);
    	}
    	return jdoc;
    }

}
