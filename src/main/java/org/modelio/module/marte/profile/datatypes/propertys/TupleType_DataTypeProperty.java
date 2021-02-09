package org.modelio.module.marte.profile.datatypes.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TupleType_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listTupleAtt = null;

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
            ModelUtils.manageMultipleOrientedLink(elt, 
                                                  listTupleAtt, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_TUPLEATTRIB_TUPLETYPE_ATTRIBUTE, 
        //                                                  MARTEDesignerTagTypes.TUPLETYPE_DATATYPE_TUPLETYPE_DATATYPE_TUPLEATTRIB,
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
        //
        // Tuple Type
        //
        listTupleAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabTupleAtt = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TUPLEATTRIB_TUPLETYPE_ATTRIBUTE), listTupleAtt);
        String value_tupleAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TUPLEATTRIB_TUPLETYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TUPLETYPE_DATATYPE_TUPLETYPE_DATATYPE_TUPLEATTRIB), value_tupleAttrib, tabTupleAtt);
    }

}
