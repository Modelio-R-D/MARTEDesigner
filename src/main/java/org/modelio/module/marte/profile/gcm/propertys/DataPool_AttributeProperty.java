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

@objid ("76846d09-ef88-4caf-a147-9bc761d5abe3")
public class DataPool_AttributeProperty implements IPropertyContent {
    @objid ("cf27373f-5b5c-47e3-811e-b707855bb016")
    public static final String GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_HOST = "GaCommHost_Association_host";

    @objid ("5b8bb90a-49e6-4800-8cb4-6ca672e43c80")
    private static List<ModelElement> _behaviors = null;

    @objid ("7641c2ce-7cc2-456d-9648-42cb39ff0b69")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, value);
        }
        if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _behaviors, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, 
        //                    MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION, 
                    value
            );
        }
        if(row == 3){
             ModelUtils.manageSingleOrientedLink(elt, 
                     _behaviors, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_SELECTION_DATAPOOL_BEHAVIOR, 
        //                     MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_SELECTION, 
                     value
             );
        }
    }

    @objid ("3f65f7e9-f35a-47ca-bef8-13c7900a7aeb")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tab_ordering = MARTEEnumerationUtils.getDataPoolOderingKind();
        String value_ordering = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, elt);
        if (!(MARTEEnumerationUtils.isDataPoolOderingKind(value_ordering))){
            value_ordering = "FIFO";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING),value_ordering, tab_ordering);
        
        _behaviors = MARTESearchUtils.searchBehavior();   
        String[] tab_behavior = ModelUtils.createListString(_behaviors);      
        String value_classifiers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION), value_classifiers, tab_behavior);
        
           
        String value_selection = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INSERTION_DATAPOOL_BEHAVIOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION), value_selection, tab_behavior);
    }

}
