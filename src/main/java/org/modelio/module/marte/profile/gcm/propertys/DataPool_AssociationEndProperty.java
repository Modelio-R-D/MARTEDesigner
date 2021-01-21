package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d7aafe6-f9e5-4835-b4b1-dbe9bcac2047")
public class DataPool_AssociationEndProperty implements IPropertyContent {
    @objid ("06299bdc-e238-4fa8-8a42-38ef6e838e69")
    private static List<ModelElement> _behaviors = null;

    @objid ("9f31a208-7da1-476b-82b7-131424d11f9a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, value);
        }
        if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _behaviors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION, 
                    value
            );
        }
        if(row == 3){
             ModelUtils.manageSingleOrientedLink(elt, 
                     _behaviors, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_SELECTION_DATAPOOL_BEHAVIOR, 
        //                     MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_SELECTION, 
                     value
             );
        }
    }

    @objid ("059547ac-e371-42a9-8e0b-b1630b55bee0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tab_ordering = MARTEEnumerationUtils.getDataPoolOderingKind();
        String value_ordering = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, elt);
        if (!(MARTEEnumerationUtils.isDataPoolOderingKind(value_ordering))){
            value_ordering = "FIFO";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING),value_ordering, tab_ordering);
        
        _behaviors = MARTESearchUtils.searchBehavior();   
        String[] tab_behavior = ModelUtils.createListString(_behaviors);      
        String value_classifiers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION), value_classifiers, tab_behavior);
        
           
        String value_selection = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION), value_selection, tab_behavior);
    }

}
