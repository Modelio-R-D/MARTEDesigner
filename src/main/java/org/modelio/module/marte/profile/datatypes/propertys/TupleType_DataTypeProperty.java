package org.modelio.module.marte.profile.datatypes.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9c432df8-3376-4acb-9b5f-81afb4c01e4f")
public class TupleType_DataTypeProperty implements IPropertyContent {
    @objid ("7f86208c-c1a7-40d1-a47e-ab6714694507")
    private static List<ModelElement> listTupleAtt = null;

    /**
     * Is called when the properties are changed.
     * @param element is the owner this.element.
     * 
     * @param row is the tag type row.
     * @param value is the new value.
     */
    @objid ("4c6a884e-5e4a-4475-ad27-93387c67af20")
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
    @objid ("4e9de79b-4901-452b-8189-7dfa4a3b4ba7")
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
