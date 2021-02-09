package org.modelio.module.marte.profile.datatypes.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class BoundedSubtype_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listBaseType = null;

    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listBaseType, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_BASETYPE_BOUNDEDSUBTYPE_DATATYPE, 
        //                                                MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_BASETYPE,
                                                value );
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, value);
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
         * baseType tagged value initialization
         */
        listBaseType = ModelUtils.searchElement(DataType.class);
        String[] tabBaseType = ModelUtils.createListString(listBaseType);
        String value_baseType = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BASETYPE_BOUNDEDSUBTYPE_DATATYPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_BASETYPE),value_baseType, tabBaseType);
        
        
        String value_minValue = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MINVALUE),value_minValue);
        
        String value_maxValue = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_MAXVALUE),value_maxValue);
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.BOUNDEDSUBTYPE_DATATYPE_BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN, elt));
    }

}
