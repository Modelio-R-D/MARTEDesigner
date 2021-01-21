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

@objid ("3ac255b0-d4b3-477f-8510-ca00b44dfbfc")
public class DataPool_BindableInstanceProperty implements IPropertyContent {
    @objid ("26889094-ed4f-4f88-a1dd-a1e50956f459")
    private static List<ModelElement> _behaviors = null;

    @objid ("35e19d25-8125-44d3-9877-9a8017a59c62")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, value);
        }
        if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _behaviors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION, 
                    value
            );
        }
        if(row == 3){
             ModelUtils.manageSingleOrientedLink(elt, 
                     _behaviors, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_SELECTION_DATAPOOL_BEHAVIOR, 
        //                     MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_SELECTION, 
                     value
             );
        }
    }

    @objid ("bfba4731-8de4-45ab-b1db-4224a530eae8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tab_ordering = MARTEEnumerationUtils.getDataPoolOderingKind();
        String value_ordering = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, elt);
        if (!(MARTEEnumerationUtils.isDataPoolOderingKind(value_ordering))){
            value_ordering = "FIFO";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING),value_ordering, tab_ordering);
        
        _behaviors = MARTESearchUtils.searchBehavior();   
        String[] tab_behavior = ModelUtils.createListString(_behaviors);      
        String value_classifiers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION), value_classifiers, tab_behavior);
        
           
        String value_selection = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION), value_selection, tab_behavior);
    }

}
