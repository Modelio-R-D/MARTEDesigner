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

@objid ("bf8974ef-35a7-4873-b606-e2de548db4f1")
public class SecondaryScheduler_AssociationProperty implements IPropertyContent {
    @objid ("4f395c01-253f-4b2a-8be4-1675741605ad")
    private static List<ModelElement> listSchedulableResource = null;

    @objid ("eb86539e-90c2-40e2-a0e1-0dac10a402b3")
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
                    MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATION_SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS,
                    value
            );
        }
    }

    @objid ("663cb567-de8d-45a7-be6b-de4e9a5832c7")
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
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATION_SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS), value_virtualProcessingUnits, tab_virtualProcessingUnits);
    }

}
