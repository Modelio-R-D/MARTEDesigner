package org.modelio.module.marte.profile.datatypes.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ab9f1d7f-3d13-41f3-86d5-73047efd8c90")
public class IntervalType_DataTypeProperty implements IPropertyContent {
    @objid ("1c3e532e-f35a-45e6-a3e2-71cbb7966ce1")
    private static List<ModelElement> listIntervalAtt = null;

    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @objid ("153449b3-e33f-40b9-9481-7c47dbaefce8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listIntervalAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_INTERVALATTRIB_INTERVALTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.INTERVALTYPE_DATATYPE_INTERVALTYPE_DATATYPE_INTERVALATTRIB,
                                                value );
        }
    }

    /**
     * Updates the Modelio properties table.
     * @param element is the owner this.element.
     * 
     * @param table is the properties table.
     */
    @objid ("810200e7-0063-4a5e-ae71-697f85abfc0a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * intervalAttrib tagged value initialization
         */
        
        
        listIntervalAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabIntervalAtt = ModelUtils.createListString(listIntervalAtt);
        String value_intervalAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerTagTypes.INTERVALTYPE_DATATYPE_INTERVALTYPE_DATATYPE_INTERVALATTRIB, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERVALTYPE_DATATYPE_INTERVALTYPE_DATATYPE_INTERVALATTRIB),value_intervalAttrib, tabIntervalAtt);
    }

}
