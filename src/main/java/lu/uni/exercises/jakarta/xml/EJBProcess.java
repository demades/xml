package lu.uni.exercises.jakarta.xml;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import lu.uni.exercises.jakarta.xml.xmlComponents.C;
import lu.uni.exercises.jakarta.xml.xmlComponents.Cell;
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
	List<Row> row;
	Cells cells;
	List<C> cList;
	C c;
	RowLabels rowLabels;
	RowLabel rowLabel;
	

    /**
     * Default constructor. 
     */
    public EJBProcess() {
        // TODO Auto-generated constructor stub
    }
    
    public void myTest(CubeView cubeView) {
    	doc = new ArrayList();
    	data = cubeView.getData();
    	rows = data.getRows();
    	row = rows.getRow();
    	rowLabels = row.get(0).getRowLabels();
    	rowLabel.getMember();
    	for (int i=0; i<row.size(); i++) {
    		entry = new JSONDocument();
    		cells = row.get(i).getCells();
    		cList = cells.getC();
    		for (int j=0; j<cList.size(); j++) {
    			switch (j) {
    			case 0:
    				c = cList.get(j);
    				entry.setResidentBorderes(c.getV());
    				break;
    			case 1:
    				c = cList.get(j);
    				entry.setNonResidentBorderes(c.getV());
    				break;
    			case 2:
    				c = cList.get(j);
    				entry.setNationalWageEarners(c.getV());
    				break;
    			case 3:
    				c = cList.get(j);
    				entry.setDomesticWageEarners(c.getV());
    				break;
    			case 4:
    				c = cList.get(j);
    				entry.setNationalSeflEmployment(c.getV());
    				break;
    			case 5:
    				c = cList.get(j);
    				entry.setDomesticSelfEmployment(c.getV());
    				break;
    			case 6:
    				c = cList.get(j);
    				entry.setNationalEmployment(c.getV());
    				break;
    			case 7:
    				c = cList.get(j);
    				entry.setDomesticEmployment(c.getV());
    				break;
    			case 8:
    				c = cList.get(j);
    				entry.setNumberUnemployed(c.getV());
    				break;
    			case 9:
    				c = cList.get(j);
    				entry.setActivePopulation(c.getV());
    				break;
    			}
    		}
    		doc.add(entry);
    		
    	}
    	
    }

}
