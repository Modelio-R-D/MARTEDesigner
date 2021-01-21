package org.modelio.module.marte.profile.grm.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6f6f96e0-252f-4460-9761-1f20e426ec83")
public class SecondaryScheduler_AssociationEndProperty implements IPropertyContent {
    @objid ("04cbd0a4-5b94-4946-8c47-7e909e1b3493")
    private static List<ModelElement> listSchedulableResource = null;

    @objid ("4b5940f8-9d70-4141-a26b-8ad9aab6fc46")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER);
        
            ModelUtils.manageMultipleToOneLink(elt,
                    listSchedulableResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, 
                    possibleTagTypeName,
                    MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS,
                    value
            );
        }
    }

    @objid ("3be6a921-1e75-46d2-a382-b48f2fba573d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Virtual Processing Units
        //
        
        listSchedulableResource = new ArrayList<> ();
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATION));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ATTRIBUTE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER));
        
        String[] tab_virtualProcessingUnits = ModelUtils.createListString(listSchedulableResource);      
        String value_virtualProcessingUnits = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS), value_virtualProcessingUnits, tab_virtualProcessingUnits);
    }

}
