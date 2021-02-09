package org.modelio.module.marte.profile.datatypes.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class IntervalType_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listIntervalAtt = null;

    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
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
