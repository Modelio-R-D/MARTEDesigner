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

public class ChoiceType_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listChoiceAtt = null;

    private static List<ModelElement> listDefaultAtt = null;

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
                                                  listChoiceAtt, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_CHOICEATTRIB_CHOICETYPE_ATTRIBUTE, 
        //                                                  MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB,
                                                  value );
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listDefaultAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_DEFAULTATTRIB_CHOICETYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB,
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
         * choiceAttrib tagged value initialization
         */
        listChoiceAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabChoiceAtt = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CHOICEATTRIB_CHOICETYPE_ATTRIBUTE), listChoiceAtt);
        String value_choiceAttrib = ModelUtils.getTargetDependencyNames( MARTEDesignerStereotypes.PROFILEASSOCIATION_CHOICEATTRIB_CHOICETYPE_ATTRIBUTE,  elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_CHOICEATTRIB),value_choiceAttrib, tabChoiceAtt);
        
        
        listDefaultAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabDefaultAtt = ModelUtils.createListString(listDefaultAtt);    
        String value_defaultAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEFAULTATTRIB_CHOICETYPE_ATTRIBUTE, elt);        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CHOICETYPE_DATATYPE_CHOICETYPE_DATATYPE_DEFAULTATTRIB),value_defaultAttrib, tabDefaultAtt);
    }

}
