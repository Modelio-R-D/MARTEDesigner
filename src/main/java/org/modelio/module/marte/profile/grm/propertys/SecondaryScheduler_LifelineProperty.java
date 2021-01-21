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

@objid ("ccfe5c46-c306-479c-8846-3ac46262ddc7")
public class SecondaryScheduler_LifelineProperty implements IPropertyContent {
    @objid ("c69c7f9d-f3a0-4d2f-bcea-096936d8e472")
    private static List<ModelElement> listSchedulableResource = null;

    @objid ("9d97a73e-9589-40b6-9ec1-d1ba11ee9fe8")
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
                    MARTEDesignerTagTypes.SECONDARYSCHEDULER_LIFELINE_SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS,
                    value
            );
        }
    }

    @objid ("b307438e-6ab4-4aaf-a4ef-43ac81c0810b")
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
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SECONDARYSCHEDULER_LIFELINE_SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS), value_virtualProcessingUnits, tab_virtualProcessingUnits);
    }

}
