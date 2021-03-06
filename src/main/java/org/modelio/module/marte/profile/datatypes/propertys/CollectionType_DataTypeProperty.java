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

public class CollectionType_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listCollectionAtt = null;

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
                                                listCollectionAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_COLLECTIONATTRIB_COLLECTIONTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB,
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
         * collectionAttrib tagged value initialization
         */
        listCollectionAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabCollectionAtt = ModelUtils.createListString(listCollectionAtt);   
        String value_collectionAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_COLLECTIONATTRIB_COLLECTIONTYPE_ATTRIBUTE,  elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB),value_collectionAttrib, tabCollectionAtt);
    }

}
